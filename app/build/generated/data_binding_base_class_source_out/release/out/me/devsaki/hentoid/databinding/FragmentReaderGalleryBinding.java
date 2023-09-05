// Generated by view binder compiler. Do not edit!
package me.devsaki.hentoid.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;
import me.devsaki.hentoid.R;
import me.devsaki.hentoid.views.ListPickerView;

public final class FragmentReaderGalleryBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final ConstraintLayout chapterEditHelpBanner;

  @NonNull
  public final TextView chapterEditHelpTxt;

  @NonNull
  public final ListPickerView chapterSelector;

  @NonNull
  public final Barrier horizontalBarrier;

  @NonNull
  public final RecyclerView recyclerView;

  @NonNull
  public final Toolbar selectionToolbar;

  @NonNull
  public final Toolbar toolbar;

  private FragmentReaderGalleryBinding(@NonNull ConstraintLayout rootView,
      @NonNull ConstraintLayout chapterEditHelpBanner, @NonNull TextView chapterEditHelpTxt,
      @NonNull ListPickerView chapterSelector, @NonNull Barrier horizontalBarrier,
      @NonNull RecyclerView recyclerView, @NonNull Toolbar selectionToolbar,
      @NonNull Toolbar toolbar) {
    this.rootView = rootView;
    this.chapterEditHelpBanner = chapterEditHelpBanner;
    this.chapterEditHelpTxt = chapterEditHelpTxt;
    this.chapterSelector = chapterSelector;
    this.horizontalBarrier = horizontalBarrier;
    this.recyclerView = recyclerView;
    this.selectionToolbar = selectionToolbar;
    this.toolbar = toolbar;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentReaderGalleryBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentReaderGalleryBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_reader_gallery, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentReaderGalleryBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.chapter_edit_help_banner;
      ConstraintLayout chapterEditHelpBanner = ViewBindings.findChildViewById(rootView, id);
      if (chapterEditHelpBanner == null) {
        break missingId;
      }

      id = R.id.chapter_edit_help_txt;
      TextView chapterEditHelpTxt = ViewBindings.findChildViewById(rootView, id);
      if (chapterEditHelpTxt == null) {
        break missingId;
      }

      id = R.id.chapter_selector;
      ListPickerView chapterSelector = ViewBindings.findChildViewById(rootView, id);
      if (chapterSelector == null) {
        break missingId;
      }

      id = R.id.horizontal_barrier;
      Barrier horizontalBarrier = ViewBindings.findChildViewById(rootView, id);
      if (horizontalBarrier == null) {
        break missingId;
      }

      id = R.id.recyclerView;
      RecyclerView recyclerView = ViewBindings.findChildViewById(rootView, id);
      if (recyclerView == null) {
        break missingId;
      }

      id = R.id.selection_toolbar;
      Toolbar selectionToolbar = ViewBindings.findChildViewById(rootView, id);
      if (selectionToolbar == null) {
        break missingId;
      }

      id = R.id.toolbar;
      Toolbar toolbar = ViewBindings.findChildViewById(rootView, id);
      if (toolbar == null) {
        break missingId;
      }

      return new FragmentReaderGalleryBinding((ConstraintLayout) rootView, chapterEditHelpBanner,
          chapterEditHelpTxt, chapterSelector, horizontalBarrier, recyclerView, selectionToolbar,
          toolbar);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
