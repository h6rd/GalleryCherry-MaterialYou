// Generated by view binder compiler. Do not edit!
package me.devsaki.hentoid.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.button.MaterialButton;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;
import me.devsaki.hentoid.R;
import me.devsaki.hentoid.views.ListPickerView;

public final class DialogReaderBookPrefsBinding implements ViewBinding {
  @NonNull
  private final ScrollView rootView;

  @NonNull
  public final MaterialButton actionButton;

  @NonNull
  public final MaterialButton bookPrefsAppPrefsBtn;

  @NonNull
  public final ListPickerView browsePicker;

  @NonNull
  public final ListPickerView displayPicker;

  @NonNull
  public final TextView exportTitle;

  @NonNull
  public final ListPickerView renderingPicker;

  private DialogReaderBookPrefsBinding(@NonNull ScrollView rootView,
      @NonNull MaterialButton actionButton, @NonNull MaterialButton bookPrefsAppPrefsBtn,
      @NonNull ListPickerView browsePicker, @NonNull ListPickerView displayPicker,
      @NonNull TextView exportTitle, @NonNull ListPickerView renderingPicker) {
    this.rootView = rootView;
    this.actionButton = actionButton;
    this.bookPrefsAppPrefsBtn = bookPrefsAppPrefsBtn;
    this.browsePicker = browsePicker;
    this.displayPicker = displayPicker;
    this.exportTitle = exportTitle;
    this.renderingPicker = renderingPicker;
  }

  @Override
  @NonNull
  public ScrollView getRoot() {
    return rootView;
  }

  @NonNull
  public static DialogReaderBookPrefsBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static DialogReaderBookPrefsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.dialog_reader_book_prefs, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static DialogReaderBookPrefsBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.action_button;
      MaterialButton actionButton = ViewBindings.findChildViewById(rootView, id);
      if (actionButton == null) {
        break missingId;
      }

      id = R.id.book_prefs_app_prefs_btn;
      MaterialButton bookPrefsAppPrefsBtn = ViewBindings.findChildViewById(rootView, id);
      if (bookPrefsAppPrefsBtn == null) {
        break missingId;
      }

      id = R.id.browse_picker;
      ListPickerView browsePicker = ViewBindings.findChildViewById(rootView, id);
      if (browsePicker == null) {
        break missingId;
      }

      id = R.id.display_picker;
      ListPickerView displayPicker = ViewBindings.findChildViewById(rootView, id);
      if (displayPicker == null) {
        break missingId;
      }

      id = R.id.export_title;
      TextView exportTitle = ViewBindings.findChildViewById(rootView, id);
      if (exportTitle == null) {
        break missingId;
      }

      id = R.id.rendering_picker;
      ListPickerView renderingPicker = ViewBindings.findChildViewById(rootView, id);
      if (renderingPicker == null) {
        break missingId;
      }

      return new DialogReaderBookPrefsBinding((ScrollView) rootView, actionButton,
          bookPrefsAppPrefsBtn, browsePicker, displayPicker, exportTitle, renderingPicker);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
