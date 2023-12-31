// Generated by view binder compiler. Do not edit!
package me.devsaki.hentoid.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
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

public final class ItemLibraryContentGridBinding implements ViewBinding {
  @NonNull
  private final FrameLayout rootView;

  @NonNull
  public final ImageView deleteBtn;

  @NonNull
  public final FrameLayout item;

  @NonNull
  public final ConstraintLayout itemCard;

  @NonNull
  public final ImageView ivCover;

  @NonNull
  public final ImageView ivExternal;

  @NonNull
  public final ImageView ivFavourite;

  @NonNull
  public final ImageView ivFlag;

  @NonNull
  public final ImageView ivOnline;

  @NonNull
  public final ImageView ivRating;

  @NonNull
  public final View lineNew;

  @NonNull
  public final View pbDownload;

  @NonNull
  public final ImageView queueSiteButton;

  @NonNull
  public final TextView tvTitle;

  private ItemLibraryContentGridBinding(@NonNull FrameLayout rootView, @NonNull ImageView deleteBtn,
      @NonNull FrameLayout item, @NonNull ConstraintLayout itemCard, @NonNull ImageView ivCover,
      @NonNull ImageView ivExternal, @NonNull ImageView ivFavourite, @NonNull ImageView ivFlag,
      @NonNull ImageView ivOnline, @NonNull ImageView ivRating, @NonNull View lineNew,
      @NonNull View pbDownload, @NonNull ImageView queueSiteButton, @NonNull TextView tvTitle) {
    this.rootView = rootView;
    this.deleteBtn = deleteBtn;
    this.item = item;
    this.itemCard = itemCard;
    this.ivCover = ivCover;
    this.ivExternal = ivExternal;
    this.ivFavourite = ivFavourite;
    this.ivFlag = ivFlag;
    this.ivOnline = ivOnline;
    this.ivRating = ivRating;
    this.lineNew = lineNew;
    this.pbDownload = pbDownload;
    this.queueSiteButton = queueSiteButton;
    this.tvTitle = tvTitle;
  }

  @Override
  @NonNull
  public FrameLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ItemLibraryContentGridBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ItemLibraryContentGridBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.item_library_content_grid, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ItemLibraryContentGridBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.delete_btn;
      ImageView deleteBtn = ViewBindings.findChildViewById(rootView, id);
      if (deleteBtn == null) {
        break missingId;
      }

      FrameLayout item = (FrameLayout) rootView;

      id = R.id.item_card;
      ConstraintLayout itemCard = ViewBindings.findChildViewById(rootView, id);
      if (itemCard == null) {
        break missingId;
      }

      id = R.id.ivCover;
      ImageView ivCover = ViewBindings.findChildViewById(rootView, id);
      if (ivCover == null) {
        break missingId;
      }

      id = R.id.ivExternal;
      ImageView ivExternal = ViewBindings.findChildViewById(rootView, id);
      if (ivExternal == null) {
        break missingId;
      }

      id = R.id.ivFavourite;
      ImageView ivFavourite = ViewBindings.findChildViewById(rootView, id);
      if (ivFavourite == null) {
        break missingId;
      }

      id = R.id.ivFlag;
      ImageView ivFlag = ViewBindings.findChildViewById(rootView, id);
      if (ivFlag == null) {
        break missingId;
      }

      id = R.id.ivOnline;
      ImageView ivOnline = ViewBindings.findChildViewById(rootView, id);
      if (ivOnline == null) {
        break missingId;
      }

      id = R.id.iv_rating;
      ImageView ivRating = ViewBindings.findChildViewById(rootView, id);
      if (ivRating == null) {
        break missingId;
      }

      id = R.id.lineNew;
      View lineNew = ViewBindings.findChildViewById(rootView, id);
      if (lineNew == null) {
        break missingId;
      }

      id = R.id.pbDownload;
      View pbDownload = ViewBindings.findChildViewById(rootView, id);
      if (pbDownload == null) {
        break missingId;
      }

      id = R.id.queue_site_button;
      ImageView queueSiteButton = ViewBindings.findChildViewById(rootView, id);
      if (queueSiteButton == null) {
        break missingId;
      }

      id = R.id.tvTitle;
      TextView tvTitle = ViewBindings.findChildViewById(rootView, id);
      if (tvTitle == null) {
        break missingId;
      }

      return new ItemLibraryContentGridBinding((FrameLayout) rootView, deleteBtn, item, itemCard,
          ivCover, ivExternal, ivFavourite, ivFlag, ivOnline, ivRating, lineNew, pbDownload,
          queueSiteButton, tvTitle);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
