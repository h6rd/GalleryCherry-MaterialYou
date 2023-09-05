// Generated by view binder compiler. Do not edit!
package me.devsaki.hentoid.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;
import me.devsaki.hentoid.R;

public final class FragmentPinDialogBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final Barrier barrierNumpad;

  @NonNull
  public final TextView button0;

  @NonNull
  public final TextView button1;

  @NonNull
  public final TextView button2;

  @NonNull
  public final TextView button3;

  @NonNull
  public final TextView button4;

  @NonNull
  public final TextView button5;

  @NonNull
  public final TextView button6;

  @NonNull
  public final TextView button7;

  @NonNull
  public final TextView button8;

  @NonNull
  public final TextView button9;

  @NonNull
  public final ImageButton buttonBackspace;

  @NonNull
  public final ImageView imagePlaceholder1;

  @NonNull
  public final ImageView imagePlaceholder2;

  @NonNull
  public final ImageView imagePlaceholder3;

  @NonNull
  public final ImageView imagePlaceholder4;

  @NonNull
  public final View line1;

  @NonNull
  public final View line2;

  @NonNull
  public final View line3;

  @NonNull
  public final View line4;

  @NonNull
  public final View spacer;

  @NonNull
  public final TextView textHeader;

  private FragmentPinDialogBinding(@NonNull ConstraintLayout rootView,
      @NonNull Barrier barrierNumpad, @NonNull TextView button0, @NonNull TextView button1,
      @NonNull TextView button2, @NonNull TextView button3, @NonNull TextView button4,
      @NonNull TextView button5, @NonNull TextView button6, @NonNull TextView button7,
      @NonNull TextView button8, @NonNull TextView button9, @NonNull ImageButton buttonBackspace,
      @NonNull ImageView imagePlaceholder1, @NonNull ImageView imagePlaceholder2,
      @NonNull ImageView imagePlaceholder3, @NonNull ImageView imagePlaceholder4,
      @NonNull View line1, @NonNull View line2, @NonNull View line3, @NonNull View line4,
      @NonNull View spacer, @NonNull TextView textHeader) {
    this.rootView = rootView;
    this.barrierNumpad = barrierNumpad;
    this.button0 = button0;
    this.button1 = button1;
    this.button2 = button2;
    this.button3 = button3;
    this.button4 = button4;
    this.button5 = button5;
    this.button6 = button6;
    this.button7 = button7;
    this.button8 = button8;
    this.button9 = button9;
    this.buttonBackspace = buttonBackspace;
    this.imagePlaceholder1 = imagePlaceholder1;
    this.imagePlaceholder2 = imagePlaceholder2;
    this.imagePlaceholder3 = imagePlaceholder3;
    this.imagePlaceholder4 = imagePlaceholder4;
    this.line1 = line1;
    this.line2 = line2;
    this.line3 = line3;
    this.line4 = line4;
    this.spacer = spacer;
    this.textHeader = textHeader;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentPinDialogBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentPinDialogBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_pin_dialog, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentPinDialogBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.barrier_numpad;
      Barrier barrierNumpad = ViewBindings.findChildViewById(rootView, id);
      if (barrierNumpad == null) {
        break missingId;
      }

      id = R.id.button_0;
      TextView button0 = ViewBindings.findChildViewById(rootView, id);
      if (button0 == null) {
        break missingId;
      }

      id = R.id.button_1;
      TextView button1 = ViewBindings.findChildViewById(rootView, id);
      if (button1 == null) {
        break missingId;
      }

      id = R.id.button_2;
      TextView button2 = ViewBindings.findChildViewById(rootView, id);
      if (button2 == null) {
        break missingId;
      }

      id = R.id.button_3;
      TextView button3 = ViewBindings.findChildViewById(rootView, id);
      if (button3 == null) {
        break missingId;
      }

      id = R.id.button_4;
      TextView button4 = ViewBindings.findChildViewById(rootView, id);
      if (button4 == null) {
        break missingId;
      }

      id = R.id.button_5;
      TextView button5 = ViewBindings.findChildViewById(rootView, id);
      if (button5 == null) {
        break missingId;
      }

      id = R.id.button_6;
      TextView button6 = ViewBindings.findChildViewById(rootView, id);
      if (button6 == null) {
        break missingId;
      }

      id = R.id.button_7;
      TextView button7 = ViewBindings.findChildViewById(rootView, id);
      if (button7 == null) {
        break missingId;
      }

      id = R.id.button_8;
      TextView button8 = ViewBindings.findChildViewById(rootView, id);
      if (button8 == null) {
        break missingId;
      }

      id = R.id.button_9;
      TextView button9 = ViewBindings.findChildViewById(rootView, id);
      if (button9 == null) {
        break missingId;
      }

      id = R.id.button_backspace;
      ImageButton buttonBackspace = ViewBindings.findChildViewById(rootView, id);
      if (buttonBackspace == null) {
        break missingId;
      }

      id = R.id.image_placeholder_1;
      ImageView imagePlaceholder1 = ViewBindings.findChildViewById(rootView, id);
      if (imagePlaceholder1 == null) {
        break missingId;
      }

      id = R.id.image_placeholder_2;
      ImageView imagePlaceholder2 = ViewBindings.findChildViewById(rootView, id);
      if (imagePlaceholder2 == null) {
        break missingId;
      }

      id = R.id.image_placeholder_3;
      ImageView imagePlaceholder3 = ViewBindings.findChildViewById(rootView, id);
      if (imagePlaceholder3 == null) {
        break missingId;
      }

      id = R.id.image_placeholder_4;
      ImageView imagePlaceholder4 = ViewBindings.findChildViewById(rootView, id);
      if (imagePlaceholder4 == null) {
        break missingId;
      }

      id = R.id.line_1;
      View line1 = ViewBindings.findChildViewById(rootView, id);
      if (line1 == null) {
        break missingId;
      }

      id = R.id.line_2;
      View line2 = ViewBindings.findChildViewById(rootView, id);
      if (line2 == null) {
        break missingId;
      }

      id = R.id.line_3;
      View line3 = ViewBindings.findChildViewById(rootView, id);
      if (line3 == null) {
        break missingId;
      }

      id = R.id.line_4;
      View line4 = ViewBindings.findChildViewById(rootView, id);
      if (line4 == null) {
        break missingId;
      }

      id = R.id.spacer;
      View spacer = ViewBindings.findChildViewById(rootView, id);
      if (spacer == null) {
        break missingId;
      }

      id = R.id.text_header;
      TextView textHeader = ViewBindings.findChildViewById(rootView, id);
      if (textHeader == null) {
        break missingId;
      }

      return new FragmentPinDialogBinding((ConstraintLayout) rootView, barrierNumpad, button0,
          button1, button2, button3, button4, button5, button6, button7, button8, button9,
          buttonBackspace, imagePlaceholder1, imagePlaceholder2, imagePlaceholder3,
          imagePlaceholder4, line1, line2, line3, line4, spacer, textHeader);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
