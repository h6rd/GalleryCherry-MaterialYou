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

public final class DialogLibraryErrorsBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final MaterialButton openLogBtn;

  @NonNull
  public final MaterialButton redownloadBtn;

  @NonNull
  public final TextView redownloadDetail;

  @NonNull
  public final TextView redownloadDetailFirstError;

  @NonNull
  public final TextView redownloadTitle;

  @NonNull
  public final MaterialButton shareLogBtn;

  private DialogLibraryErrorsBinding(@NonNull ConstraintLayout rootView,
      @NonNull MaterialButton openLogBtn, @NonNull MaterialButton redownloadBtn,
      @NonNull TextView redownloadDetail, @NonNull TextView redownloadDetailFirstError,
      @NonNull TextView redownloadTitle, @NonNull MaterialButton shareLogBtn) {
    this.rootView = rootView;
    this.openLogBtn = openLogBtn;
    this.redownloadBtn = redownloadBtn;
    this.redownloadDetail = redownloadDetail;
    this.redownloadDetailFirstError = redownloadDetailFirstError;
    this.redownloadTitle = redownloadTitle;
    this.shareLogBtn = shareLogBtn;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static DialogLibraryErrorsBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static DialogLibraryErrorsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.dialog_library_errors, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static DialogLibraryErrorsBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.open_log_btn;
      MaterialButton openLogBtn = ViewBindings.findChildViewById(rootView, id);
      if (openLogBtn == null) {
        break missingId;
      }

      id = R.id.redownload_btn;
      MaterialButton redownloadBtn = ViewBindings.findChildViewById(rootView, id);
      if (redownloadBtn == null) {
        break missingId;
      }

      id = R.id.redownload_detail;
      TextView redownloadDetail = ViewBindings.findChildViewById(rootView, id);
      if (redownloadDetail == null) {
        break missingId;
      }

      id = R.id.redownload_detail_first_error;
      TextView redownloadDetailFirstError = ViewBindings.findChildViewById(rootView, id);
      if (redownloadDetailFirstError == null) {
        break missingId;
      }

      id = R.id.redownload_title;
      TextView redownloadTitle = ViewBindings.findChildViewById(rootView, id);
      if (redownloadTitle == null) {
        break missingId;
      }

      id = R.id.share_log_btn;
      MaterialButton shareLogBtn = ViewBindings.findChildViewById(rootView, id);
      if (shareLogBtn == null) {
        break missingId;
      }

      return new DialogLibraryErrorsBinding((ConstraintLayout) rootView, openLogBtn, redownloadBtn,
          redownloadDetail, redownloadDetailFirstError, redownloadTitle, shareLogBtn);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
