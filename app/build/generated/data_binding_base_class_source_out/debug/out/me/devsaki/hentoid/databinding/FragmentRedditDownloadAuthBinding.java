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

public final class FragmentRedditDownloadAuthBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final TextView redditAuthAction;

  @NonNull
  public final ImageView redditAuthImg;

  @NonNull
  public final TextView redditAuthImgCount;

  @NonNull
  public final TextView redditAuthImgNote;

  private FragmentRedditDownloadAuthBinding(@NonNull ConstraintLayout rootView,
      @NonNull TextView redditAuthAction, @NonNull ImageView redditAuthImg,
      @NonNull TextView redditAuthImgCount, @NonNull TextView redditAuthImgNote) {
    this.rootView = rootView;
    this.redditAuthAction = redditAuthAction;
    this.redditAuthImg = redditAuthImg;
    this.redditAuthImgCount = redditAuthImgCount;
    this.redditAuthImgNote = redditAuthImgNote;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentRedditDownloadAuthBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentRedditDownloadAuthBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_reddit_download_auth, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentRedditDownloadAuthBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.reddit_auth_action;
      TextView redditAuthAction = ViewBindings.findChildViewById(rootView, id);
      if (redditAuthAction == null) {
        break missingId;
      }

      id = R.id.reddit_auth_img;
      ImageView redditAuthImg = ViewBindings.findChildViewById(rootView, id);
      if (redditAuthImg == null) {
        break missingId;
      }

      id = R.id.reddit_auth_img_count;
      TextView redditAuthImgCount = ViewBindings.findChildViewById(rootView, id);
      if (redditAuthImgCount == null) {
        break missingId;
      }

      id = R.id.reddit_auth_img_note;
      TextView redditAuthImgNote = ViewBindings.findChildViewById(rootView, id);
      if (redditAuthImgNote == null) {
        break missingId;
      }

      return new FragmentRedditDownloadAuthBinding((ConstraintLayout) rootView, redditAuthAction,
          redditAuthImg, redditAuthImgCount, redditAuthImgNote);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
