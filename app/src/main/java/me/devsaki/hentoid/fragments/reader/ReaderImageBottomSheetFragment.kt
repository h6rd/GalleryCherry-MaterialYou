package me.devsaki.hentoid.fragments.reader

import android.content.Context
import android.content.res.ColorStateList
import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.graphics.Point
import android.graphics.drawable.BitmapDrawable
import android.graphics.drawable.Drawable
import android.net.Uri
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.DialogFragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.ViewModelProvider
import com.bumptech.glide.Glide
import com.bumptech.glide.load.Transformation
import com.bumptech.glide.load.resource.bitmap.CenterInside
import com.bumptech.glide.request.RequestOptions
import com.google.android.material.bottomsheet.BottomSheetDialogFragment
import com.google.android.material.dialog.MaterialAlertDialogBuilder
import com.google.android.material.snackbar.BaseTransientBottomBar
import com.google.android.material.snackbar.Snackbar
import me.devsaki.hentoid.R
import me.devsaki.hentoid.activities.bundles.ReaderActivityBundle
import me.devsaki.hentoid.core.HentoidApp
import me.devsaki.hentoid.database.domains.ImageFile
import me.devsaki.hentoid.databinding.IncludeReaderImageBottomPanelBinding
import me.devsaki.hentoid.util.Helper
import me.devsaki.hentoid.util.ThemeHelper
import me.devsaki.hentoid.util.exception.ContentNotProcessedException
import me.devsaki.hentoid.util.file.FileHelper
import me.devsaki.hentoid.util.image.ImageHelper
import me.devsaki.hentoid.viewmodels.ReaderViewModel
import me.devsaki.hentoid.viewmodels.ViewModelFactory
import timber.log.Timber
import java.io.IOException

class ReaderImageBottomSheetFragment : BottomSheetDialogFragment() {

    // Communication
    private lateinit var viewModel: ReaderViewModel

    // UI
    private var _binding: IncludeReaderImageBottomPanelBinding? = null
    private val binding get() = _binding!!

    // VARS
    private var imageIndex: Int = -1
    private var scale = -1f
    private var image: ImageFile? = null
    private val glideRequestOptions: RequestOptions

    init {
        val context: Context = HentoidApp.getInstance()
        val tintColor = ThemeHelper.getColor(context, R.color.light_gray)

        val bmp = BitmapFactory.decodeResource(context.resources, R.drawable.ic_hentoid_trans)
        val d: Drawable = BitmapDrawable(context.resources, ImageHelper.tintBitmap(bmp, tintColor))

        val centerInside: Transformation<Bitmap> = CenterInside()
        glideRequestOptions = RequestOptions()
            .optionalTransform(centerInside)
            .error(d)
    }


    override fun onAttach(context: Context) {
        super.onAttach(context)

        val bundle = arguments
        if (bundle != null) {
            val parser = ReaderActivityBundle(bundle)
            imageIndex = parser.imageIndex
            require(-1 != imageIndex) { "Initialization failed" }
            scale = parser.scale
        }

        val vmFactory = ViewModelFactory(requireActivity().application)
        viewModel = ViewModelProvider(requireActivity(), vmFactory)[ReaderViewModel::class.java]
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = IncludeReaderImageBottomPanelBinding.inflate(inflater, container, false)

        binding.imgActionFavourite.setOnClickListener { onFavouriteClick() }
        binding.imgActionCopy.setOnClickListener { onCopyClick() }
        binding.imgActionShare.setOnClickListener { onShareClick() }
        binding.imgActionDelete.setOnClickListener { onDeleteClick() }

        return binding.root
    }

    override fun onDestroyView() {
        _binding = null
        super.onDestroyView()
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        viewModel.getViewerImages().observe(viewLifecycleOwner) { images ->
            this.onImagesChanged(images)
        }
    }


    /**
     * Observer for changes in the book's list of images
     *
     * @param images Book's list of images
     */
    private fun onImagesChanged(images: List<ImageFile>) {
        val grayColor = ThemeHelper.getColor(requireContext(), R.color.dark_gray)
        // Might happen when deleting the last page
        if (imageIndex >= images.size) imageIndex = images.size - 1

        images[imageIndex].let {
            image = it
            var filePath: String
            val isArchive = it.content.target.isArchive
            if (isArchive) {
                filePath = it.url
                val lastSeparator = filePath.lastIndexOf('/')
                val archiveUri = filePath.substring(0, lastSeparator)
                val fileName = filePath.substring(lastSeparator)
                filePath =
                    FileHelper.getFullPathFromUri(
                        requireContext(),
                        Uri.parse(archiveUri)
                    ) + fileName
            } else {
                filePath =
                    FileHelper.getFullPathFromUri(requireContext(), Uri.parse(it.fileUri))
            }

            binding.imagePath.text = filePath
            val imageExists = FileHelper.fileExists(requireContext(), Uri.parse(it.fileUri))
            if (imageExists) {
                val dimensions = getImageDimensions(requireContext(), it.fileUri)
                val sizeStr: String = if (it.size > 0) {
                    FileHelper.formatHumanReadableSize(it.size, resources)
                } else {
                    val size =
                        FileHelper.fileSizeFromUri(requireContext(), Uri.parse(it.fileUri))
                    FileHelper.formatHumanReadableSize(size, resources)
                }
                binding.imageStats.text = resources.getString(
                    R.string.viewer_img_details,
                    dimensions.x,
                    dimensions.y,
                    scale * 100,
                    sizeStr
                )
                Glide.with(binding.ivThumb)
                    .load(Uri.parse(it.fileUri))
                    .apply(glideRequestOptions)
                    .into(binding.ivThumb)
            } else {
                binding.imageStats.setText(R.string.image_not_found)
                binding.imgActionFavourite.imageTintList = ColorStateList.valueOf(grayColor)
                binding.imgActionFavourite.isEnabled = false
                binding.imgActionCopy.imageTintList = ColorStateList.valueOf(grayColor)
                binding.imgActionCopy.isEnabled = false
                binding.imgActionShare.imageTintList = ColorStateList.valueOf(grayColor)
                binding.imgActionShare.isEnabled = false
            }
            // Don't allow deleting the image if it is archived
            if (isArchive) {
                binding.imgActionDelete.imageTintList = ColorStateList.valueOf(grayColor)
                binding.imgActionDelete.isEnabled = false
            } else {
                binding.imgActionDelete.imageTintList = null
                binding.imgActionDelete.isEnabled = true
            }
            updateFavouriteDisplay(it.isFavourite)
        }
    }

    /**
     * Handle click on "Favourite" action button
     */
    private fun onFavouriteClick() {
        viewModel.toggleImageFavourite(imageIndex) { newState: Boolean ->
            onToggleFavouriteSuccess(newState)
        }
    }

    /**
     * Success callback when the new favourite'd state has been successfully persisted
     */
    private fun onToggleFavouriteSuccess(newState: Boolean) {
        image!!.isFavourite = newState
        updateFavouriteDisplay(newState)
    }

    /**
     * Update the display of the "favourite page" action button
     *
     * @param isFavourited True if the button has to represent a favourite page; false instead
     */
    private fun updateFavouriteDisplay(isFavourited: Boolean) {
        if (isFavourited) binding.imgActionFavourite.setImageResource(R.drawable.ic_fav_full)
        else binding.imgActionFavourite.setImageResource(R.drawable.ic_fav_empty)
    }

    /**
     * Handle click on "Copy" action button
     */
    private fun onCopyClick() {
        image?.let {
            val targetFileName =
                it.content.target.uniqueSiteId + "-" + it.name + "." + FileHelper.getExtension(it.fileUri)
            try {
                val fileUri = Uri.parse(it.fileUri)
                if (!FileHelper.fileExists(requireContext(), fileUri)) return
                FileHelper.openNewDownloadOutputStream(
                    requireContext(),
                    targetFileName,
                    it.mimeType
                ).use { newDownload ->
                    FileHelper.getInputStream(requireContext(), fileUri)
                        .use { input -> Helper.copy(input, newDownload) }
                }
                Snackbar.make(
                    binding.root,
                    R.string.copy_download_folder_success,
                    BaseTransientBottomBar.LENGTH_LONG
                )
                    .setAction(R.string.open_folder) {
                        FileHelper.openFile(requireContext(), FileHelper.getDownloadsFolder())
                    }
                    .show()
            } catch (e: IOException) {
                Snackbar.make(
                    binding.root,
                    R.string.copy_download_folder_fail,
                    BaseTransientBottomBar.LENGTH_LONG
                ).show()
            } catch (e: IllegalArgumentException) {
                Snackbar.make(
                    binding.root,
                    R.string.copy_download_folder_fail,
                    BaseTransientBottomBar.LENGTH_LONG
                ).show()
            }
        }
    }

    /**
     * Handle click on "Share" action button
     */
    private fun onShareClick() {
        image?.let {
            val fileUri = Uri.parse(it.fileUri)
            if (FileHelper.fileExists(requireContext(), fileUri)) FileHelper.shareFile(
                requireContext(),
                fileUri,
                ""
            )
        }
    }

    /**
     * Handle click on "Delete" action button
     */
    private fun onDeleteClick() {
        MaterialAlertDialogBuilder(
            requireContext(),
            ThemeHelper.getIdForCurrentTheme(requireContext(), R.style.Theme_Light_Dialog)
        )
            .setIcon(R.drawable.ic_warning)
            .setCancelable(false)
            .setTitle(R.string.app_name)
            .setMessage(R.string.viewer_ask_delete_page)
            .setPositiveButton(R.string.yes) { dialog1, _ ->
                dialog1.dismiss()
                viewModel.deletePage(imageIndex) { t: Throwable -> onDeleteError(t) }
            }
            .setNegativeButton(R.string.no) { dialog12, _ -> dialog12.dismiss() }
            .create()
            .show()
    }

    /**
     * Return the given image's dimensions
     *
     * @param context Context to be used
     * @param uri     Uri of the image to be read
     * @return Dimensions (x,y) of the given image
     */
    private fun getImageDimensions(context: Context, uri: String): Point {
        val fileUri = Uri.parse(uri)
        if (!FileHelper.fileExists(context, fileUri)) return Point(0, 0)
        val options = BitmapFactory.Options()
        options.inJustDecodeBounds = true
        return try {
            BitmapFactory.decodeStream(FileHelper.getInputStream(context, fileUri), null, options)
            Point(options.outWidth, options.outHeight)
        } catch (e: IOException) {
            Timber.w(e)
            Point(0, 0)
        } catch (e: IllegalArgumentException) {
            Timber.w(e)
            Point(0, 0)
        }
    }

    /**
     * Callback for the failure of the "delete item" action
     */
    private fun onDeleteError(t: Throwable) {
        Timber.e(t)
        if (t is ContentNotProcessedException) {
            val message =
                if (null == t.message) resources.getString(R.string.file_removal_failed) else t.message!!
            Snackbar.make(binding.root, message, BaseTransientBottomBar.LENGTH_LONG).show()
        }
    }

    companion object {
        fun invoke(
            context: Context,
            fragmentManager: FragmentManager,
            imageIndex: Int,
            currentScale: Float
        ) {
            val bottomSheetFragment = ReaderImageBottomSheetFragment()

            val builder = ReaderActivityBundle()
            builder.imageIndex = imageIndex
            builder.scale = currentScale
            bottomSheetFragment.arguments = builder.bundle

            ThemeHelper.setStyle(
                context,
                bottomSheetFragment,
                DialogFragment.STYLE_NORMAL,
                R.style.Theme_Light_BottomSheetDialog
            )

            bottomSheetFragment.show(fragmentManager, "imageBottomSheetFragment")
        }
    }
}