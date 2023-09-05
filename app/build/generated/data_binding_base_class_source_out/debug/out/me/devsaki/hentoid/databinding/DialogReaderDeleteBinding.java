// Generated by view binder compiler. Do not edit!
package me.devsaki.hentoid.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioButton;
import android.widget.RadioGroup;
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
import me.devsaki.hentoid.views.ListPickerView;

public final class DialogReaderDeleteBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final MaterialButton actionButton;

  @NonNull
  public final RadioGroup deleteMode;

  @NonNull
  public final RadioButton deleteModeBook;

  @NonNull
  public final RadioButton deleteModePage;

  @NonNull
  public final ListPickerView deleteWhat;

  private DialogReaderDeleteBinding(@NonNull ConstraintLayout rootView,
      @NonNull MaterialButton actionButton, @NonNull RadioGroup deleteMode,
      @NonNull RadioButton deleteModeBook, @NonNull RadioButton deleteModePage,
      @NonNull ListPickerView deleteWhat) {
    this.rootView = rootView;
    this.actionButton = actionButton;
    this.deleteMode = deleteMode;
    this.deleteModeBook = deleteModeBook;
    this.deleteModePage = deleteModePage;
    this.deleteWhat = deleteWhat;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static DialogReaderDeleteBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static DialogReaderDeleteBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.dialog_reader_delete, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static DialogReaderDeleteBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.action_button;
      MaterialButton actionButton = ViewBindings.findChildViewById(rootView, id);
      if (actionButton == null) {
        break missingId;
      }

      id = R.id.delete_mode;
      RadioGroup deleteMode = ViewBindings.findChildViewById(rootView, id);
      if (deleteMode == null) {
        break missingId;
      }

      id = R.id.delete_mode_book;
      RadioButton deleteModeBook = ViewBindings.findChildViewById(rootView, id);
      if (deleteModeBook == null) {
        break missingId;
      }

      id = R.id.delete_mode_page;
      RadioButton deleteModePage = ViewBindings.findChildViewById(rootView, id);
      if (deleteModePage == null) {
        break missingId;
      }

      id = R.id.delete_what;
      ListPickerView deleteWhat = ViewBindings.findChildViewById(rootView, id);
      if (deleteWhat == null) {
        break missingId;
      }

      return new DialogReaderDeleteBinding((ConstraintLayout) rootView, actionButton, deleteMode,
          deleteModeBook, deleteModePage, deleteWhat);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}