// Generated by view binder compiler. Do not edit!
package me.devsaki.hentoid.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;
import me.devsaki.hentoid.R;

public final class IncludeReaderContentBottomPanelBinding implements ViewBinding {
  @NonNull
  private final CoordinatorLayout rootView;

  @NonNull
  public final TextView contentArtist;

  @NonNull
  public final TextView contentTags;

  @NonNull
  public final TextView contentTitle;

  @NonNull
  public final CoordinatorLayout imageDialogRoot;

  @NonNull
  public final ImageView imgActionFavourite;

  @NonNull
  public final View imgDivider;

  @NonNull
  public final ImageView ivCover;

  @NonNull
  public final ImageView rating1;

  @NonNull
  public final ImageView rating2;

  @NonNull
  public final ImageView rating3;

  @NonNull
  public final ImageView rating4;

  @NonNull
  public final ImageView rating5;

  private IncludeReaderContentBottomPanelBinding(@NonNull CoordinatorLayout rootView,
      @NonNull TextView contentArtist, @NonNull TextView contentTags,
      @NonNull TextView contentTitle, @NonNull CoordinatorLayout imageDialogRoot,
      @NonNull ImageView imgActionFavourite, @NonNull View imgDivider, @NonNull ImageView ivCover,
      @NonNull ImageView rating1, @NonNull ImageView rating2, @NonNull ImageView rating3,
      @NonNull ImageView rating4, @NonNull ImageView rating5) {
    this.rootView = rootView;
    this.contentArtist = contentArtist;
    this.contentTags = contentTags;
    this.contentTitle = contentTitle;
    this.imageDialogRoot = imageDialogRoot;
    this.imgActionFavourite = imgActionFavourite;
    this.imgDivider = imgDivider;
    this.ivCover = ivCover;
    this.rating1 = rating1;
    this.rating2 = rating2;
    this.rating3 = rating3;
    this.rating4 = rating4;
    this.rating5 = rating5;
  }

  @Override
  @NonNull
  public CoordinatorLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static IncludeReaderContentBottomPanelBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static IncludeReaderContentBottomPanelBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.include_reader_content_bottom_panel, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static IncludeReaderContentBottomPanelBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.content_artist;
      TextView contentArtist = ViewBindings.findChildViewById(rootView, id);
      if (contentArtist == null) {
        break missingId;
      }

      id = R.id.content_tags;
      TextView contentTags = ViewBindings.findChildViewById(rootView, id);
      if (contentTags == null) {
        break missingId;
      }

      id = R.id.content_title;
      TextView contentTitle = ViewBindings.findChildViewById(rootView, id);
      if (contentTitle == null) {
        break missingId;
      }

      CoordinatorLayout imageDialogRoot = (CoordinatorLayout) rootView;

      id = R.id.img_action_favourite;
      ImageView imgActionFavourite = ViewBindings.findChildViewById(rootView, id);
      if (imgActionFavourite == null) {
        break missingId;
      }

      id = R.id.img_divider;
      View imgDivider = ViewBindings.findChildViewById(rootView, id);
      if (imgDivider == null) {
        break missingId;
      }

      id = R.id.ivCover;
      ImageView ivCover = ViewBindings.findChildViewById(rootView, id);
      if (ivCover == null) {
        break missingId;
      }

      id = R.id.rating_1;
      ImageView rating1 = ViewBindings.findChildViewById(rootView, id);
      if (rating1 == null) {
        break missingId;
      }

      id = R.id.rating_2;
      ImageView rating2 = ViewBindings.findChildViewById(rootView, id);
      if (rating2 == null) {
        break missingId;
      }

      id = R.id.rating_3;
      ImageView rating3 = ViewBindings.findChildViewById(rootView, id);
      if (rating3 == null) {
        break missingId;
      }

      id = R.id.rating_4;
      ImageView rating4 = ViewBindings.findChildViewById(rootView, id);
      if (rating4 == null) {
        break missingId;
      }

      id = R.id.rating_5;
      ImageView rating5 = ViewBindings.findChildViewById(rootView, id);
      if (rating5 == null) {
        break missingId;
      }

      return new IncludeReaderContentBottomPanelBinding((CoordinatorLayout) rootView, contentArtist,
          contentTags, contentTitle, imageDialogRoot, imgActionFavourite, imgDivider, ivCover,
          rating1, rating2, rating3, rating4, rating5);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
