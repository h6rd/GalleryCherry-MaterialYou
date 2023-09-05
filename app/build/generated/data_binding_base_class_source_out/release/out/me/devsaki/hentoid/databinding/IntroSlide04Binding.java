// Generated by view binder compiler. Do not edit!
package me.devsaki.hentoid.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
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

public final class IntroSlide04Binding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final MaterialButton skipBtn;

  @NonNull
  public final TextView waitTxt;

  private IntroSlide04Binding(@NonNull LinearLayout rootView, @NonNull MaterialButton skipBtn,
      @NonNull TextView waitTxt) {
    this.rootView = rootView;
    this.skipBtn = skipBtn;
    this.waitTxt = waitTxt;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static IntroSlide04Binding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static IntroSlide04Binding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.intro_slide_04, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static IntroSlide04Binding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.skip_btn;
      MaterialButton skipBtn = ViewBindings.findChildViewById(rootView, id);
      if (skipBtn == null) {
        break missingId;
      }

      id = R.id.wait_txt;
      TextView waitTxt = ViewBindings.findChildViewById(rootView, id);
      if (waitTxt == null) {
        break missingId;
      }

      return new IntroSlide04Binding((LinearLayout) rootView, skipBtn, waitTxt);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
