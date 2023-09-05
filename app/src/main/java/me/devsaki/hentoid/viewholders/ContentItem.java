package me.devsaki.hentoid.viewholders;

import static androidx.core.view.ViewCompat.requireViewById;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;

import androidx.annotation.DrawableRes;
import androidx.annotation.IntDef;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.RecyclerView;

import com.annimon.stream.Stream;
import com.annimon.stream.function.Consumer;
import com.bumptech.glide.Glide;
import com.bumptech.glide.load.Transformation;
import com.bumptech.glide.load.model.GlideUrl;
import com.bumptech.glide.load.resource.bitmap.CenterInside;
import com.bumptech.glide.request.RequestOptions;
import com.mikepenz.fastadapter.FastAdapter;
import com.mikepenz.fastadapter.drag.IExtendedDraggable;
import com.mikepenz.fastadapter.items.AbstractItem;
import com.mikepenz.fastadapter.swipe.IDrawerSwipeableViewHolder;
import com.mikepenz.fastadapter.swipe.ISwipeable;
import com.mikepenz.fastadapter.utils.DragDropUtil;

import org.jetbrains.annotations.NotNull;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.List;
import java.util.Locale;

import me.devsaki.hentoid.R;
import me.devsaki.hentoid.activities.bundles.ContentItemBundle;
import me.devsaki.hentoid.core.HentoidApp;
import me.devsaki.hentoid.database.domains.Chapter;
import me.devsaki.hentoid.database.domains.Content;
import me.devsaki.hentoid.database.domains.ImageFile;
import me.devsaki.hentoid.database.domains.QueueRecord;
import me.devsaki.hentoid.enums.StatusContent;
import me.devsaki.hentoid.ui.BlinkAnimation;
import me.devsaki.hentoid.util.ContentHelper;
import me.devsaki.hentoid.util.Helper;
import me.devsaki.hentoid.util.Preferences;
import me.devsaki.hentoid.util.ThemeHelper;
import me.devsaki.hentoid.util.download.ContentQueueManager;
import me.devsaki.hentoid.util.image.ImageHelper;
import me.devsaki.hentoid.views.CircularProgressView;

public class ContentItem extends AbstractItem<ContentItem.ContentViewHolder> implements IExtendedDraggable, ISwipeable {

    private static final int ITEM_HORIZONTAL_MARGIN_PX;
    private static final RequestOptions glideRequestOptions;

    @IntDef({ViewType.LIBRARY, ViewType.LIBRARY_GRID, ViewType.LIBRARY_EDIT, ViewType.QUEUE, ViewType.ERRORS, ViewType.ONLINE})
    @Retention(RetentionPolicy.SOURCE)
    public @interface ViewType {
        int LIBRARY = 0;
        int LIBRARY_GRID = 1;
        int LIBRARY_EDIT = 2;
        int QUEUE = 3;
        int ERRORS = 4;
        int ONLINE = 5;
    }

    private final Content content;

    private final QueueRecord queueRecord;
    private final @ViewType int viewType;
    private final boolean isSearchActive;
    private final boolean isEmpty;

    private final boolean isFirst;

    private Consumer<ContentItem> deleteAction = null;

    // Drag, drop & swipe
    private final ItemTouchHelper touchHelper;
    private final boolean isSwipeable;


    static {
        Context context = HentoidApp.getInstance();

        int screenWidthPx = HentoidApp.getInstance().getResources().getDisplayMetrics().widthPixels - (2 * (int) context.getResources().getDimension(R.dimen.default_cardview_margin));
        int gridHorizontalWidthPx = (int) context.getResources().getDimension(R.dimen.card_grid_width);
        int nbItems = (int) Math.floor(screenWidthPx * 1f / gridHorizontalWidthPx);
        int remainingSpacePx = screenWidthPx % gridHorizontalWidthPx;
        ITEM_HORIZONTAL_MARGIN_PX = remainingSpacePx / (nbItems * 2);

        Bitmap bmp = ImageHelper.INSTANCE.getBitmapFromResource(context, R.drawable.ic_cherry_icon);
        int tintColor = ThemeHelper.getColor(context, R.color.light_gray);
        Drawable d = new BitmapDrawable(context.getResources(), ImageHelper.INSTANCE.tintBitmap(bmp, tintColor));

        final Transformation<Bitmap> centerInside = new CenterInside();
        glideRequestOptions = new RequestOptions().optionalTransform(centerInside).error(d);
    }

    // Constructor for empty placeholder
    public ContentItem(@ViewType int viewType) {
        content = null;
        queueRecord = null;
        isSearchActive = false;
        isFirst = false;
        this.viewType = viewType;
        touchHelper = null;
        isEmpty = true;
        isSwipeable = true;
        setIdentifier(Helper.generateIdForPlaceholder());
    }

    // Constructor for library, online and error item
    public ContentItem(Content content, @Nullable ItemTouchHelper touchHelper, @ViewType int viewType, @Nullable final Consumer<ContentItem> deleteAction) {
        this.content = content;
        queueRecord = null;
        isSearchActive = false;
        isFirst = false;
        this.viewType = viewType;
        this.touchHelper = touchHelper;
        this.deleteAction = deleteAction;
        isEmpty = (null == content);
        isSwipeable = (content != null && !content.isBeingProcessed() && (!content.getStatus().equals(StatusContent.EXTERNAL) || Preferences.isDeleteExternalLibrary()));
        if (content != null) setIdentifier(content.uniqueHash());
        else setIdentifier(Helper.generateIdForPlaceholder());
    }

    // Constructor for queued item
    public ContentItem(@NonNull QueueRecord record, boolean isSearchActive, ItemTouchHelper touchHelper, boolean isFirst, @Nullable final Consumer<ContentItem> deleteAction) {
        content = record.getContent().getTarget();
        queueRecord = record;
        viewType = ViewType.QUEUE;
        this.isSearchActive = isSearchActive;
        this.touchHelper = touchHelper;
        this.deleteAction = deleteAction;
        this.isFirst = isFirst;
        isEmpty = (null == content);
        isSwipeable = true;
        if (content != null) setIdentifier(content.uniqueHash());
        else setIdentifier(Helper.generateIdForPlaceholder());
    }

    @Nullable
    public Content getContent() {
        return content;
    }

    @Nullable
    public QueueRecord getQueueRecord() {
        return queueRecord;
    }

    @NotNull
    @Override
    public ContentItem.ContentViewHolder getViewHolder(@NotNull View view) {
        return new ContentViewHolder(view, viewType);
    }

    @Override
    public int getLayoutRes() {
        if (ViewType.LIBRARY == viewType || ViewType.ONLINE == viewType)
            return R.layout.item_library_content;
        else if (ViewType.LIBRARY_GRID == viewType) return R.layout.item_library_content_grid;
        else return R.layout.item_queue;
    }

    @Override
    public int getType() {
        return R.id.content;
    }

    @Override
    public boolean isDraggable() {
        return (ViewType.QUEUE == viewType || ViewType.LIBRARY_EDIT == viewType);
    }

    @Override
    public boolean isSwipeable() {
        return isSwipeable;
    }

    @Override
    public boolean isDirectionSupported(int i) {
        return (ItemTouchHelper.LEFT == i);
    }

    @org.jetbrains.annotations.Nullable
    @Override
    public ItemTouchHelper getTouchHelper() {
        return touchHelper;
    }

    @org.jetbrains.annotations.Nullable
    @Override
    public View getDragView(@NotNull RecyclerView.ViewHolder viewHolder) {
        if (viewHolder instanceof ContentViewHolder)
            return ((ContentViewHolder) viewHolder).ivReorder;
        else return null;
    }

    public void updateProgress(RecyclerView.ViewHolder vh, boolean isPausedEvent, boolean isIndividual) {
        boolean isQueueReady = ContentQueueManager.INSTANCE.isQueueActive(vh.itemView.getContext()) && !ContentQueueManager.INSTANCE.isQueuePaused() && !isPausedEvent;

        content.computeProgress();
        content.computeDownloadedBytes();

        ProgressBar pb = vh.itemView.findViewById(R.id.pbDownload);
        if (isQueueReady || content.getPercent() > 0) {
            TextView tvPages = vh.itemView.findViewById(R.id.tvPages);
            if (content.getPercent() > 0) {
                pb.setIndeterminate(false);
                pb.setMax(100);
                pb.setProgress((int) (content.getPercent() * 100));
                pb.setVisibility(View.VISIBLE);

                int color;
                if (isQueueReady && isIndividual)
                    color = ThemeHelper.getColor(pb.getContext(), R.color.secondary_light);
                else color = ContextCompat.getColor(pb.getContext(), R.color.medium_gray);
                // fixes <= Lollipop progressBar tinting
                if (Build.VERSION.SDK_INT < Build.VERSION_CODES.M)
                    pb.getProgressDrawable().setColorFilter(color, PorterDuff.Mode.SRC_IN);
                else pb.getProgressDrawable().setColorFilter(color, PorterDuff.Mode.MULTIPLY);

                if (content.getBookSizeEstimate() > 0 && tvPages != null && View.VISIBLE == tvPages.getVisibility()) {
                    String pagesText = tvPages.getText().toString();
                    int separator = pagesText.indexOf(";");
                    if (separator > -1) pagesText = pagesText.substring(0, separator);
                    pagesText = pagesText + "; " + pb.getContext().getResources().getString(R.string.queue_content_size_estimate, content.getBookSizeEstimate() / (1024 * 1024));
                    tvPages.setText(pagesText);
                }
            } else if (isQueueReady && isFirst) {
                pb.setVisibility(isIndividual ? View.VISIBLE : View.GONE);
                pb.setIndeterminate(true);
                // fixes <= Lollipop progressBar tinting
                if (Build.VERSION.SDK_INT < Build.VERSION_CODES.M)
                    pb.getIndeterminateDrawable().setColorFilter(ThemeHelper.getColor(pb.getContext(), R.color.secondary_light), PorterDuff.Mode.SRC_IN);
            } else pb.setVisibility(View.GONE);
        } else {
            pb.setVisibility(View.GONE);
        }
    }


    public static class ContentViewHolder extends FastAdapter.ViewHolder<ContentItem> implements IDraggableViewHolder, IDrawerSwipeableViewHolder, ISwipeableViewHolder {

        // Common elements
        private final View baseLayout;
        private final TextView tvTitle;
        private final ImageView ivCover;
        private final ImageView ivFlag;
        private final TextView tvArtist;
        private final ImageView ivPages;
        private final TextView tvPages;
        private final ImageView ivSite;
        private final ImageView ivError;
        private final ImageView ivOnline;

        private final View bookCard;
        private final View deleteButton;

        // Specific to library content
        private View ivNew;
        private TextView tvTags;
        private TextView tvModel;
        private TextView tvSeries;
        private ImageView ivFavourite;
        private ImageView ivRating;
        private ImageView ivExternal;
        private CircularProgressView readingProgress;
        private ImageView ivCompleted;
        private ImageView ivChapters;
        private TextView tvChapters;
        private ImageView ivStorage;
        private TextView tvStorage;

        // Specific to Queued content
        private ProgressBar progressBar;
        private View ivTop;
        private View ivBottom;
        private View ivReorder;
        private View ivRedownload;

        private Runnable deleteActionRunnable = null;

        // Extra info to display in stacktraces
        private String debugStr = "[no data]";


        ContentViewHolder(View view, @ViewType int viewType) {
            super(view);

            baseLayout = requireViewById(itemView, R.id.item);
            tvTitle = requireViewById(itemView, R.id.tvTitle);
            ivCover = requireViewById(itemView, R.id.ivCover);
            ivFlag = requireViewById(itemView, R.id.ivFlag);
            ivSite = requireViewById(itemView, R.id.queue_site_button);
            tvArtist = itemView.findViewById(R.id.tvArtist);
            ivPages = itemView.findViewById(R.id.ivPages);
            tvPages = itemView.findViewById(R.id.tvPages);
            ivError = itemView.findViewById(R.id.ivError);
            ivOnline = itemView.findViewById(R.id.ivOnline);
            // Swipe elements
            bookCard = itemView.findViewById(R.id.item_card);
            deleteButton = itemView.findViewById(R.id.delete_btn);

            if (viewType == ViewType.LIBRARY) {
                ivNew = itemView.findViewById(R.id.lineNew);
                ivFavourite = itemView.findViewById(R.id.ivFavourite);
                ivRating = itemView.findViewById(R.id.iv_rating);
                ivExternal = itemView.findViewById(R.id.ivExternal);
                tvModel = requireViewById(itemView, R.id.tvModel);
                tvSeries = requireViewById(itemView, R.id.tvSeries);
                tvTags = requireViewById(itemView, R.id.tvTags);
                ivChapters = itemView.findViewById(R.id.ivChapters);
                tvChapters = itemView.findViewById(R.id.tvChapters);
                ivStorage = itemView.findViewById(R.id.ivStorage);
                tvStorage = itemView.findViewById(R.id.tvStorage);
                ivCompleted = requireViewById(itemView, R.id.ivCompleted);
                readingProgress = requireViewById(itemView, R.id.reading_progress);
            } else if (viewType == ViewType.ONLINE) {
                ivFavourite = itemView.findViewById(R.id.ivFavourite);
                ivExternal = itemView.findViewById(R.id.ivExternal);
                tvTags = requireViewById(itemView, R.id.tvTags);
                ivRedownload = itemView.findViewById(R.id.ivRedownload);
            } else if (viewType == ViewType.LIBRARY_GRID) {
                ivNew = itemView.findViewById(R.id.lineNew);
                ivFavourite = itemView.findViewById(R.id.ivFavourite);
                ivRating = itemView.findViewById(R.id.iv_rating);
                ivExternal = itemView.findViewById(R.id.ivExternal);
            } else if (viewType == ViewType.QUEUE || viewType == ViewType.LIBRARY_EDIT) {
                if (viewType == ViewType.QUEUE)
                    progressBar = itemView.findViewById(R.id.pbDownload);
                ivTop = itemView.findViewById(R.id.queueTopBtn);
                ivBottom = itemView.findViewById(R.id.queueBottomBtn);
                ivReorder = itemView.findViewById(R.id.ivReorder);
            } else if (viewType == ViewType.ERRORS) {
                ivRedownload = itemView.findViewById(R.id.ivRedownload);
            }
        }

        @Override
        public void bindView(@NotNull ContentItem item, @NotNull List<?> payloads) {
            if (item.isEmpty || null == item.content) {
                debugStr = "empty item";
                return; // Ignore placeholders from PagedList
            }

            // Payloads are set when the content stays the same but some properties alone change
            if (!payloads.isEmpty() && payloads.get(0) instanceof Bundle) {
                Bundle bundle = (Bundle) payloads.get(0);
                ContentItemBundle bundleParser = new ContentItemBundle(bundle);

                Boolean boolValue = bundleParser.isBeingDeleted();
                if (boolValue != null) item.content.setIsBeingProcessed(boolValue);
                boolValue = bundleParser.isFavourite();
                if (boolValue != null) item.content.setFavourite(boolValue);
                Integer intValue = bundleParser.getRating();
                if (intValue != null) item.content.setRating(intValue);
                boolValue = bundleParser.isCompleted();
                if (boolValue != null) item.content.setCompleted(boolValue);
                Long longValue = bundleParser.getReads();
                if (longValue != null) item.content.setReads(longValue);
                intValue = bundleParser.getReadPagesCount();
                if (intValue != null) item.content.setReadPagesCount(intValue);
                intValue = bundleParser.getStatus();
                if (intValue != null) item.content.setStatus(StatusContent.searchByCode(intValue));
                String stringValue = bundleParser.getCoverUri();
                if (stringValue != null) item.content.getCover().setFileUri(stringValue);
                stringValue = bundleParser.getTitle();
                if (stringValue != null) item.content.setTitle(stringValue);
                intValue = bundleParser.getDownloadMode();
                if (intValue != null) item.content.setDownloadMode(intValue);
                boolValue = bundleParser.getFrozen();
                if (boolValue != null) item.queueRecord.setFrozen(boolValue);
            }
            debugStr = "objectBox ID=" + item.content.getId() + "; site ID=" + item.content.getUniqueSiteId() + "; hashCode=" + item.content.hashCode();

            if (item.deleteAction != null)
                deleteActionRunnable = () -> item.deleteAction.accept(item);

            // Important to trigger the ViewHolder's global onClick/onLongClick events
            bookCard.setOnClickListener(v -> {
                if (v.getParent() instanceof View) ((View) v.getParent()).performClick();
            });
            bookCard.setOnLongClickListener(v -> {
                if (v.getParent() instanceof View) return ((View) v.getParent()).performLongClick();
                return false;
            });

            updateLayoutVisibility(item);
            attachCover(item.content);
            attachFlag(item.content);
            attachTitle(item.content, item.queueRecord);

            if (ivCompleted != null) attachCompleted(item.content);
            if (readingProgress != null) attachReadingProgress(item.content);
            if (tvArtist != null) attachArtist(item.content);
            if (tvSeries != null) attachSeries(item.content);
            if (tvModel != null) attachModel(item.content);
            if (tvPages != null) attachMetrics(item.content, item.viewType);
            if (tvTags != null) attachTags(item.content);
            attachButtons(item);

            if (progressBar != null) item.updateProgress(this, false, true);
            if (ivReorder != null) DragDropUtil.bindDragHandle(this, item);
        }


        private void updateLayoutVisibility(@NonNull final ContentItem item) {
            baseLayout.setVisibility(item.isEmpty ? View.GONE : View.VISIBLE);

            if (Preferences.Constant.LIBRARY_DISPLAY_GRID == Preferences.getLibraryDisplay()) {
                ViewGroup.LayoutParams layoutParams = baseLayout.getLayoutParams();
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    ((ViewGroup.MarginLayoutParams) layoutParams).setMarginStart(ITEM_HORIZONTAL_MARGIN_PX);
                    ((ViewGroup.MarginLayoutParams) layoutParams).setMarginEnd(ITEM_HORIZONTAL_MARGIN_PX);
                }
                baseLayout.setLayoutParams(layoutParams);
            }

            if (item.getContent() != null && item.getContent().isBeingProcessed())
                baseLayout.startAnimation(new BlinkAnimation(500, 250));
            else baseLayout.clearAnimation();

            // Unread indicator
            if (ivNew != null)
                ivNew.setVisibility((0 == item.getContent().getReads()) ? View.VISIBLE : View.GONE);
        }

        private void attachCover(@NonNull final Content content) {
            String thumbLocation = content.getCover().getUsableUri();
            if (thumbLocation.isEmpty()) {
                ivCover.setVisibility(View.INVISIBLE);
                return;
            }

            ivCover.setVisibility(View.VISIBLE);
            // Use content's cookies to load image (useful for ExHentai when viewing queue screen)
            if (thumbLocation.startsWith("http")) {
                GlideUrl glideUrl = ContentHelper.bindOnlineCover(content, thumbLocation);
                if (glideUrl != null) {
                    Glide.with(ivCover).load(glideUrl).apply(glideRequestOptions).into(ivCover);
                }
            } else // From stored picture
                Glide.with(ivCover).load(Uri.parse(thumbLocation)).apply(glideRequestOptions).into(ivCover);
        }

        private void attachFlag(@NonNull final Content content) {
            @DrawableRes int resId = ContentHelper.getFlagResourceId(ivFlag.getContext(), content);
            if (resId != 0) {
                ivFlag.setImageResource(resId);
                ivFlag.setVisibility(View.VISIBLE);
            } else {
                ivFlag.setVisibility(View.GONE);
            }
        }

        private void attachTitle(@NonNull final Content content, final QueueRecord queueRecord) {
            CharSequence title;
            if (content.getTitle() == null) {
                title = tvTitle.getContext().getText(R.string.work_untitled);
            } else {
                if (!content.getReplacementTitle().isEmpty()) title = content.getReplacementTitle();
                else title = content.getTitle();
            }
            tvTitle.setText(title);

            int colorId = R.color.card_title_light;
            if (queueRecord != null && queueRecord.isFrozen()) colorId = R.color.frozen_blue;
            tvTitle.setTextColor(ThemeHelper.getColor(tvTitle.getContext(), colorId));
        }

        private void attachCompleted(@NonNull final Content content) {
            if (content.isCompleted()) ivCompleted.setVisibility(View.VISIBLE);
            else ivCompleted.setVisibility(View.GONE);
        }

        private void attachReadingProgress(@NonNull final Content content) {
            List<ImageFile> imgs = content.getImageFiles();
            if (imgs != null && !content.isCompleted()) {
                readingProgress.setVisibility(View.VISIBLE);
                readingProgress.setTotalColor(R.color.transparent);
                readingProgress.setTotal(Stream.of(content.getImageFiles()).withoutNulls().filter(ImageFile::isReadable).count());
                readingProgress.setProgress1(content.getReadPagesCount());
            } else {
                readingProgress.setVisibility(View.INVISIBLE);
            }
        }

        private void attachArtist(@NonNull final Content content) {
            tvArtist.setText(ContentHelper.formatArtistForDisplay(tvArtist.getContext(), content));
        }

        private void attachModel(@NonNull final Content content) {
            String text = ContentHelper.formatModelForDisplay(tvModel.getContext(), content);
            if (text.isEmpty()) {
                tvModel.setVisibility(View.GONE);
            } else {
                tvModel.setVisibility(View.VISIBLE);
                tvModel.setText(text);
            }
        }


        private void attachSeries(@NonNull final Content content) {
            String text = ContentHelper.formatSeriesForDisplay(tvSeries.getContext(), content);
            if (text.isEmpty()) {
                tvSeries.setVisibility(View.GONE);
            } else {
                tvSeries.setVisibility(View.VISIBLE);
                tvSeries.setText(text);
            }
        }

        private void attachMetrics(@NonNull final Content content, @ViewType int viewType) {
            tvPages.setVisibility(0 == content.getQtyPages() ? View.INVISIBLE : View.VISIBLE);
            Context context = tvPages.getContext();

            String template;
            if (viewType == ViewType.QUEUE || viewType == ViewType.ERRORS || viewType == ViewType.LIBRARY_EDIT) {
                String nbPages = content.getQtyPages() + "";
                if (viewType == ViewType.ERRORS) {
                    long nbMissingPages = content.getQtyPages() - content.getNbDownloadedPages();
                    if (nbMissingPages > 0) {
                        String missingStr = " " + context.getResources().getQuantityString(R.plurals.work_pages_missing, (int) nbMissingPages, nbMissingPages);
                        template = context.getResources().getString(R.string.work_pages_queue, nbPages, missingStr);
                    } else
                        template = context.getResources().getString(R.string.work_pages_queue, nbPages, "");
                } else
                    template = context.getResources().getString(R.string.work_pages_queue, nbPages, "");
                tvPages.setText(template);
            } else { // Library
                boolean isPlaceholder = content.getStatus().equals(StatusContent.PLACEHOLDER);
                int phVisibility = isPlaceholder ? View.GONE : View.VISIBLE;
                ivPages.setVisibility(phVisibility);
                tvPages.setVisibility(phVisibility);

                tvPages.setText(String.format(Locale.ENGLISH, "%d", content.getNbDownloadedPages()));

                if (tvChapters != null) {
                    List<Chapter> chapters = content.getChapters();
                    int chapterVisibility = (isPlaceholder || null == chapters || chapters.isEmpty()) ? View.GONE : View.VISIBLE;
                    ivChapters.setVisibility(chapterVisibility);
                    tvChapters.setVisibility(chapterVisibility);
                    if (chapterVisibility == View.VISIBLE) {
                        if (content.isManuallyMerged())
                            ivChapters.setImageResource(R.drawable.ic_action_merge);
                        else ivChapters.setImageResource(R.drawable.ic_chapter);
                        tvChapters.setText(String.format(Locale.ENGLISH, "%d", chapters.size()));
                    }
                }

                if (tvStorage != null) {
                    int storageVisibility = (isPlaceholder || content.getDownloadMode() == Content.DownloadMode.STREAM) ? View.GONE : View.VISIBLE;
                    ivStorage.setVisibility(storageVisibility);
                    tvStorage.setVisibility(storageVisibility);
                    if (storageVisibility == View.VISIBLE)
                        tvStorage.setText(context.getString(R.string.library_metrics_storage, content.getSize() / (1024.0 * 1024.0)));
                }
            }
        }

        private void attachTags(@NonNull final Content content) {
            String tagTxt = ContentHelper.formatTagsForDisplay(content);
            if (tagTxt.isEmpty()) {
                tvTags.setVisibility(View.GONE);
            } else {
                tvTags.setVisibility(View.VISIBLE);
                tvTags.setText(tagTxt);
                tvTags.setTextColor(ThemeHelper.getColor(tvTags.getContext(), R.color.card_tags_light));
            }
        }

        private void attachButtons(@NonNull final ContentItem item) {
            Content content = item.getContent();
            if (null == content) return;

            // Source icon
            if (content.isUrlBrowsable()) ivSite.setVisibility(View.VISIBLE);
            else ivSite.setVisibility(View.GONE);
            if (content.getSite() != null) {
                ivSite.setImageResource(content.getSite().getIco());
            } else {
                ivSite.setImageResource(R.drawable.ic_cherry);
            }

            if (deleteButton != null) {
                deleteButton.setOnClickListener(v -> deleteActionRunnable.run());
                deleteButton.setOnLongClickListener(v -> {
                    deleteActionRunnable.run();
                    return true;
                });
            }

            boolean isStreamed = content.getDownloadMode() == Content.DownloadMode.STREAM;
            if (ivOnline != null) ivOnline.setVisibility(isStreamed ? View.VISIBLE : View.GONE);

            if (ViewType.QUEUE == item.viewType || ViewType.LIBRARY_EDIT == item.viewType) {
                ivTop.setVisibility(View.VISIBLE);
                ivBottom.setVisibility(View.VISIBLE);
                ivReorder.setVisibility(item.isSearchActive ? View.INVISIBLE : View.VISIBLE);
            } else if (ViewType.ERRORS == item.viewType) {
                ivRedownload.setVisibility(View.VISIBLE);
                ivError.setVisibility(View.VISIBLE);
            } else if (ViewType.ONLINE == item.viewType) {
                ivExternal.setVisibility(View.GONE);
                ivFavourite.setVisibility(View.GONE);
                if (content.getStatus().equals(StatusContent.ONLINE))
                    ivRedownload.setVisibility(View.VISIBLE);
                else
                    ivRedownload.setVisibility(View.GONE);
            } else if (ViewType.LIBRARY == item.viewType || ViewType.LIBRARY_GRID == item.viewType) {
                if (content.getStatus().equals(StatusContent.EXTERNAL)) {
                    int resourceId = content.isArchive() ? R.drawable.ic_archive : R.drawable.ic_folder_full;
                    if (ivExternal != null) {
                        ivExternal.setImageResource(resourceId);
                        ivExternal.setVisibility(View.VISIBLE);
                    } else if (ivStorage != null) {
                        if (isStreamed)
                            resourceId = R.drawable.ic_action_download_stream; // External streamed is streamed icon
                        ivStorage.setImageResource(resourceId);
                    }
                } else {
                    if (ivExternal != null) {
                        ivExternal.setVisibility(View.GONE);
                    } else if (ivStorage != null) {
                        int resourceId = isStreamed ? R.drawable.ic_action_download_stream : R.drawable.ic_storage;
                        ivStorage.setImageResource(resourceId);
                    }
                }

                if (content.isFavourite()) {
                    ivFavourite.setImageResource(R.drawable.ic_fav_full);
                } else {
                    ivFavourite.setImageResource(R.drawable.ic_fav_empty);
                }

                if (ivRating != null)
                    ivRating.setImageResource(ContentHelper.getRatingResourceId(content.getRating()));
            }
        }

        public View getFavouriteButton() {
            return ivFavourite;
        }

        public View getRatingButton() {
            return ivRating;
        }

        public View getSiteButton() {
            return ivSite;
        }

        public View getErrorButton() {
            return ivError;
        }

        public View getTopButton() {
            return ivTop;
        }

        public View getBottomButton() {
            return ivBottom;
        }

        public View getDownloadButton() {
            return ivRedownload;
        }


        @Override
        public void unbindView(@NotNull ContentItem item) {
            deleteActionRunnable = null;
            debugStr = "[no data]";
            bookCard.setTranslationX(0f);
            if (ivCover != null && Helper.isValidContextForGlide(ivCover))
                Glide.with(ivCover).clear(ivCover);
        }

        @Override
        public void onDragged() {
            // TODO fix incorrect visual behaviour when dragging an item to 1st position
            //bookCard.setBackgroundColor(ThemeHelper.getColor(bookCard.getContext(), R.color.white_opacity_25));
        }

        @Override
        public void onDropped() {
            // TODO fix incorrect visual behaviour when dragging an item to 1st position
            //bookCard.setBackground(bookCard.getContext().getDrawable(R.drawable.bg_book_card));
        }

        @NotNull
        @Override
        public View getSwipeableView() {
            return bookCard;
        }

        @Override
        public void onSwiped() {
            // Nothing
        }

        @Override
        public void onUnswiped() {
            // Nothing
        }

        @NonNull
        @Override
        public String toString() {
            return super.toString() + " " + debugStr;
        }
    }
}
