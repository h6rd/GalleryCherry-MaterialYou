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

public final class ItemExpandableBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final ImageView ivReorder;

  @NonNull
  public final TextView materialDrawerDescription;

  @NonNull
  public final ImageView materialDrawerIcon;

  @NonNull
  public final TextView materialDrawerName;

  private ItemExpandableBinding(@NonNull ConstraintLayout rootView, @NonNull ImageView ivReorder,
      @NonNull TextView materialDrawerDescription, @NonNull ImageView materialDrawerIcon,
      @NonNull TextView materialDrawerName) {
    this.rootView = rootView;
    this.ivReorder = ivReorder;
    this.materialDrawerDescription = materialDrawerDescription;
    this.materialDrawerIcon = materialDrawerIcon;
    this.materialDrawerName = materialDrawerName;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ItemExpandableBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ItemExpandableBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.item_expandable, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ItemExpandableBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.ivReorder;
      ImageView ivReorder = ViewBindings.findChildViewById(rootView, id);
      if (ivReorder == null) {
        break missingId;
      }

      id = R.id.material_drawer_description;
      TextView materialDrawerDescription = ViewBindings.findChildViewById(rootView, id);
      if (materialDrawerDescription == null) {
        break missingId;
      }

      id = R.id.material_drawer_icon;
      ImageView materialDrawerIcon = ViewBindings.findChildViewById(rootView, id);
      if (materialDrawerIcon == null) {
        break missingId;
      }

      id = R.id.material_drawer_name;
      TextView materialDrawerName = ViewBindings.findChildViewById(rootView, id);
      if (materialDrawerName == null) {
        break missingId;
      }

      return new ItemExpandableBinding((ConstraintLayout) rootView, ivReorder,
          materialDrawerDescription, materialDrawerIcon, materialDrawerName);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
