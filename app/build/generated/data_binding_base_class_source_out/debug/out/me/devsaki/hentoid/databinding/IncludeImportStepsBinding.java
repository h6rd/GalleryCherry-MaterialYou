// Generated by view binder compiler. Do not edit!
package me.devsaki.hentoid.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.button.MaterialButton;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;
import me.devsaki.hentoid.R;

public final class IncludeImportStepsBinding implements ViewBinding {
  @NonNull
  private final View rootView;

  @NonNull
  public final ConstraintLayout importStep1;

  @NonNull
  public final MaterialButton importStep1Button;

  @NonNull
  public final ImageView importStep1Check;

  @NonNull
  public final TextView importStep1Folder;

  @NonNull
  public final TextView importStep1Number;

  @NonNull
  public final TextView importStep1Text;

  @NonNull
  public final ConstraintLayout importStep2;

  @NonNull
  public final ProgressBar importStep2Bar;

  @NonNull
  public final ImageView importStep2Check;

  @NonNull
  public final TextView importStep2Number;

  @NonNull
  public final TextView importStep2Text;

  @NonNull
  public final ConstraintLayout importStep3;

  @NonNull
  public final ProgressBar importStep3Bar;

  @NonNull
  public final ImageView importStep3Check;

  @NonNull
  public final TextView importStep3Number;

  @NonNull
  public final ProgressBar importStep3SubBar;

  @NonNull
  public final TextView importStep3Text;

  @NonNull
  public final ConstraintLayout importStep4;

  @NonNull
  public final ProgressBar importStep4Bar;

  @NonNull
  public final ImageView importStep4Check;

  @NonNull
  public final TextView importStep4Number;

  @NonNull
  public final TextView importStep4Text;

  private IncludeImportStepsBinding(@NonNull View rootView, @NonNull ConstraintLayout importStep1,
      @NonNull MaterialButton importStep1Button, @NonNull ImageView importStep1Check,
      @NonNull TextView importStep1Folder, @NonNull TextView importStep1Number,
      @NonNull TextView importStep1Text, @NonNull ConstraintLayout importStep2,
      @NonNull ProgressBar importStep2Bar, @NonNull ImageView importStep2Check,
      @NonNull TextView importStep2Number, @NonNull TextView importStep2Text,
      @NonNull ConstraintLayout importStep3, @NonNull ProgressBar importStep3Bar,
      @NonNull ImageView importStep3Check, @NonNull TextView importStep3Number,
      @NonNull ProgressBar importStep3SubBar, @NonNull TextView importStep3Text,
      @NonNull ConstraintLayout importStep4, @NonNull ProgressBar importStep4Bar,
      @NonNull ImageView importStep4Check, @NonNull TextView importStep4Number,
      @NonNull TextView importStep4Text) {
    this.rootView = rootView;
    this.importStep1 = importStep1;
    this.importStep1Button = importStep1Button;
    this.importStep1Check = importStep1Check;
    this.importStep1Folder = importStep1Folder;
    this.importStep1Number = importStep1Number;
    this.importStep1Text = importStep1Text;
    this.importStep2 = importStep2;
    this.importStep2Bar = importStep2Bar;
    this.importStep2Check = importStep2Check;
    this.importStep2Number = importStep2Number;
    this.importStep2Text = importStep2Text;
    this.importStep3 = importStep3;
    this.importStep3Bar = importStep3Bar;
    this.importStep3Check = importStep3Check;
    this.importStep3Number = importStep3Number;
    this.importStep3SubBar = importStep3SubBar;
    this.importStep3Text = importStep3Text;
    this.importStep4 = importStep4;
    this.importStep4Bar = importStep4Bar;
    this.importStep4Check = importStep4Check;
    this.importStep4Number = importStep4Number;
    this.importStep4Text = importStep4Text;
  }

  @Override
  @NonNull
  public View getRoot() {
    return rootView;
  }

  @NonNull
  public static IncludeImportStepsBinding inflate(@NonNull LayoutInflater inflater,
      @NonNull ViewGroup parent) {
    if (parent == null) {
      throw new NullPointerException("parent");
    }
    inflater.inflate(R.layout.include_import_steps, parent);
    return bind(parent);
  }

  @NonNull
  public static IncludeImportStepsBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.import_step1;
      ConstraintLayout importStep1 = ViewBindings.findChildViewById(rootView, id);
      if (importStep1 == null) {
        break missingId;
      }

      id = R.id.import_step1_button;
      MaterialButton importStep1Button = ViewBindings.findChildViewById(rootView, id);
      if (importStep1Button == null) {
        break missingId;
      }

      id = R.id.import_step1_check;
      ImageView importStep1Check = ViewBindings.findChildViewById(rootView, id);
      if (importStep1Check == null) {
        break missingId;
      }

      id = R.id.import_step1_folder;
      TextView importStep1Folder = ViewBindings.findChildViewById(rootView, id);
      if (importStep1Folder == null) {
        break missingId;
      }

      id = R.id.import_step1_number;
      TextView importStep1Number = ViewBindings.findChildViewById(rootView, id);
      if (importStep1Number == null) {
        break missingId;
      }

      id = R.id.import_step1_text;
      TextView importStep1Text = ViewBindings.findChildViewById(rootView, id);
      if (importStep1Text == null) {
        break missingId;
      }

      id = R.id.import_step2;
      ConstraintLayout importStep2 = ViewBindings.findChildViewById(rootView, id);
      if (importStep2 == null) {
        break missingId;
      }

      id = R.id.import_step2_bar;
      ProgressBar importStep2Bar = ViewBindings.findChildViewById(rootView, id);
      if (importStep2Bar == null) {
        break missingId;
      }

      id = R.id.import_step2_check;
      ImageView importStep2Check = ViewBindings.findChildViewById(rootView, id);
      if (importStep2Check == null) {
        break missingId;
      }

      id = R.id.import_step2_number;
      TextView importStep2Number = ViewBindings.findChildViewById(rootView, id);
      if (importStep2Number == null) {
        break missingId;
      }

      id = R.id.import_step2_text;
      TextView importStep2Text = ViewBindings.findChildViewById(rootView, id);
      if (importStep2Text == null) {
        break missingId;
      }

      id = R.id.import_step3;
      ConstraintLayout importStep3 = ViewBindings.findChildViewById(rootView, id);
      if (importStep3 == null) {
        break missingId;
      }

      id = R.id.import_step3_bar;
      ProgressBar importStep3Bar = ViewBindings.findChildViewById(rootView, id);
      if (importStep3Bar == null) {
        break missingId;
      }

      id = R.id.import_step3_check;
      ImageView importStep3Check = ViewBindings.findChildViewById(rootView, id);
      if (importStep3Check == null) {
        break missingId;
      }

      id = R.id.import_step3_number;
      TextView importStep3Number = ViewBindings.findChildViewById(rootView, id);
      if (importStep3Number == null) {
        break missingId;
      }

      id = R.id.import_step3_sub_bar;
      ProgressBar importStep3SubBar = ViewBindings.findChildViewById(rootView, id);
      if (importStep3SubBar == null) {
        break missingId;
      }

      id = R.id.import_step3_text;
      TextView importStep3Text = ViewBindings.findChildViewById(rootView, id);
      if (importStep3Text == null) {
        break missingId;
      }

      id = R.id.import_step4;
      ConstraintLayout importStep4 = ViewBindings.findChildViewById(rootView, id);
      if (importStep4 == null) {
        break missingId;
      }

      id = R.id.import_step4_bar;
      ProgressBar importStep4Bar = ViewBindings.findChildViewById(rootView, id);
      if (importStep4Bar == null) {
        break missingId;
      }

      id = R.id.import_step4_check;
      ImageView importStep4Check = ViewBindings.findChildViewById(rootView, id);
      if (importStep4Check == null) {
        break missingId;
      }

      id = R.id.import_step4_number;
      TextView importStep4Number = ViewBindings.findChildViewById(rootView, id);
      if (importStep4Number == null) {
        break missingId;
      }

      id = R.id.import_step4_text;
      TextView importStep4Text = ViewBindings.findChildViewById(rootView, id);
      if (importStep4Text == null) {
        break missingId;
      }

      return new IncludeImportStepsBinding(rootView, importStep1, importStep1Button,
          importStep1Check, importStep1Folder, importStep1Number, importStep1Text, importStep2,
          importStep2Bar, importStep2Check, importStep2Number, importStep2Text, importStep3,
          importStep3Bar, importStep3Check, importStep3Number, importStep3SubBar, importStep3Text,
          importStep4, importStep4Bar, importStep4Check, importStep4Number, importStep4Text);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
