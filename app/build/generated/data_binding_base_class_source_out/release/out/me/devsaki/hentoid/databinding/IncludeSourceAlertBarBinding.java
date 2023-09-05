// Generated by view binder compiler. Do not edit!
package me.devsaki.hentoid.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.Group;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;
import me.devsaki.hentoid.R;

public final class IncludeSourceAlertBarBinding implements ViewBinding {
  @NonNull
  private final View rootView;

  @NonNull
  public final ImageView webAlertCloseBtn;

  @NonNull
  public final Group webAlertGroup;

  @NonNull
  public final ImageView webAlertIcon;

  @NonNull
  public final TextView webAlertTxt;

  private IncludeSourceAlertBarBinding(@NonNull View rootView, @NonNull ImageView webAlertCloseBtn,
      @NonNull Group webAlertGroup, @NonNull ImageView webAlertIcon,
      @NonNull TextView webAlertTxt) {
    this.rootView = rootView;
    this.webAlertCloseBtn = webAlertCloseBtn;
    this.webAlertGroup = webAlertGroup;
    this.webAlertIcon = webAlertIcon;
    this.webAlertTxt = webAlertTxt;
  }

  @Override
  @NonNull
  public View getRoot() {
    return rootView;
  }

  @NonNull
  public static IncludeSourceAlertBarBinding inflate(@NonNull LayoutInflater inflater,
      @NonNull ViewGroup parent) {
    if (parent == null) {
      throw new NullPointerException("parent");
    }
    inflater.inflate(R.layout.include_source_alert_bar, parent);
    return bind(parent);
  }

  @NonNull
  public static IncludeSourceAlertBarBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.web_alert_close_btn;
      ImageView webAlertCloseBtn = ViewBindings.findChildViewById(rootView, id);
      if (webAlertCloseBtn == null) {
        break missingId;
      }

      id = R.id.web_alert_group;
      Group webAlertGroup = ViewBindings.findChildViewById(rootView, id);
      if (webAlertGroup == null) {
        break missingId;
      }

      id = R.id.web_alert_icon;
      ImageView webAlertIcon = ViewBindings.findChildViewById(rootView, id);
      if (webAlertIcon == null) {
        break missingId;
      }

      id = R.id.web_alert_txt;
      TextView webAlertTxt = ViewBindings.findChildViewById(rootView, id);
      if (webAlertTxt == null) {
        break missingId;
      }

      return new IncludeSourceAlertBarBinding(rootView, webAlertCloseBtn, webAlertGroup,
          webAlertIcon, webAlertTxt);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
