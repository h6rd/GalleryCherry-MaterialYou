// Generated by view binder compiler. Do not edit!
package me.devsaki.hentoid.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.button.MaterialButton;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;
import me.devsaki.hentoid.R;

public final class DialogQueueErrorsBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final MaterialButton openLogBtn;

  @NonNull
  public final MaterialButton shareLogBtn;

  @NonNull
  public final TextView statsDetails;

  @NonNull
  public final TextView statsTitle;

  private DialogQueueErrorsBinding(@NonNull ConstraintLayout rootView,
      @NonNull MaterialButton openLogBtn, @NonNull MaterialButton shareLogBtn,
      @NonNull TextView statsDetails, @NonNull TextView statsTitle) {
    this.rootView = rootView;
    this.openLogBtn = openLogBtn;
    this.shareLogBtn = shareLogBtn;
    this.statsDetails = statsDetails;
    this.statsTitle = statsTitle;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static DialogQueueErrorsBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static DialogQueueErrorsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.dialog_queue_errors, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static DialogQueueErrorsBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.open_log_btn;
      MaterialButton openLogBtn = ViewBindings.findChildViewById(rootView, id);
      if (openLogBtn == null) {
        break missingId;
      }

      id = R.id.share_log_btn;
      MaterialButton shareLogBtn = ViewBindings.findChildViewById(rootView, id);
      if (shareLogBtn == null) {
        break missingId;
      }

      id = R.id.stats_details;
      TextView statsDetails = ViewBindings.findChildViewById(rootView, id);
      if (statsDetails == null) {
        break missingId;
      }

      id = R.id.stats_title;
      TextView statsTitle = ViewBindings.findChildViewById(rootView, id);
      if (statsTitle == null) {
        break missingId;
      }

      return new DialogQueueErrorsBinding((ConstraintLayout) rootView, openLogBtn, shareLogBtn,
          statsDetails, statsTitle);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
