// Generated by view binder compiler. Do not edit!
package me.devsaki.hentoid.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;
import me.devsaki.hentoid.R;

public final class ActivityDrawerEditBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final RecyclerView drawerEditList;

  @NonNull
  public final TextView drawerEditOkBtn;

  @NonNull
  public final Toolbar toolbar;

  private ActivityDrawerEditBinding(@NonNull ConstraintLayout rootView,
      @NonNull RecyclerView drawerEditList, @NonNull TextView drawerEditOkBtn,
      @NonNull Toolbar toolbar) {
    this.rootView = rootView;
    this.drawerEditList = drawerEditList;
    this.drawerEditOkBtn = drawerEditOkBtn;
    this.toolbar = toolbar;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityDrawerEditBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityDrawerEditBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_drawer_edit, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityDrawerEditBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.drawer_edit_list;
      RecyclerView drawerEditList = ViewBindings.findChildViewById(rootView, id);
      if (drawerEditList == null) {
        break missingId;
      }

      id = R.id.drawer_edit_ok_btn;
      TextView drawerEditOkBtn = ViewBindings.findChildViewById(rootView, id);
      if (drawerEditOkBtn == null) {
        break missingId;
      }

      id = R.id.toolbar;
      Toolbar toolbar = ViewBindings.findChildViewById(rootView, id);
      if (toolbar == null) {
        break missingId;
      }

      return new ActivityDrawerEditBinding((ConstraintLayout) rootView, drawerEditList,
          drawerEditOkBtn, toolbar);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
