// Generated by view binder compiler. Do not edit!
package me.devsaki.hentoid.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;
import me.devsaki.hentoid.R;

public final class ItemReaderGalleryImageBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final TextView chapterOverlay;

  @NonNull
  public final ImageView checkedIndicator;

  @NonNull
  public final ImageView viewerGalleryImage;

  @NonNull
  public final TextView viewerGalleryPagenumberText;

  private ItemReaderGalleryImageBinding(@NonNull ConstraintLayout rootView,
      @NonNull TextView chapterOverlay, @NonNull ImageView checkedIndicator,
      @NonNull ImageView viewerGalleryImage, @NonNull TextView viewerGalleryPagenumberText) {
    this.rootView = rootView;
    this.chapterOverlay = chapterOverlay;
    this.checkedIndicator = checkedIndicator;
    this.viewerGalleryImage = viewerGalleryImage;
    this.viewerGalleryPagenumberText = viewerGalleryPagenumberText;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ItemReaderGalleryImageBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ItemReaderGalleryImageBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.item_reader_gallery_image, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ItemReaderGalleryImageBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.chapter_overlay;
      TextView chapterOverlay = ViewBindings.findChildViewById(rootView, id);
      if (chapterOverlay == null) {
        break missingId;
      }

      id = R.id.checked_indicator;
      ImageView checkedIndicator = ViewBindings.findChildViewById(rootView, id);
      if (checkedIndicator == null) {
        break missingId;
      }

      id = R.id.viewer_gallery_image;
      ImageView viewerGalleryImage = ViewBindings.findChildViewById(rootView, id);
      if (viewerGalleryImage == null) {
        break missingId;
      }

      id = R.id.viewer_gallery_pagenumber_text;
      TextView viewerGalleryPagenumberText = ViewBindings.findChildViewById(rootView, id);
      if (viewerGalleryPagenumberText == null) {
        break missingId;
      }

      return new ItemReaderGalleryImageBinding((ConstraintLayout) rootView, chapterOverlay,
          checkedIndicator, viewerGalleryImage, viewerGalleryPagenumberText);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
