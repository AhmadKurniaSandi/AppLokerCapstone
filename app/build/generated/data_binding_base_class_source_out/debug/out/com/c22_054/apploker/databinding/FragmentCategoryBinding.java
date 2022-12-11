// Generated by view binder compiler. Do not edit!
package com.c22_054.apploker.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.SearchView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.c22_054.apploker.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentCategoryBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final ImageButton imageButtonMobile;

  @NonNull
  public final ImageButton imageButtonUx;

  @NonNull
  public final ImageButton imageButtonWebDev;

  @NonNull
  public final SearchView searchBar;

  @NonNull
  public final TextView textView;

  @NonNull
  public final TextView textView2;

  @NonNull
  public final TextView textView3;

  private FragmentCategoryBinding(@NonNull ConstraintLayout rootView,
      @NonNull ImageButton imageButtonMobile, @NonNull ImageButton imageButtonUx,
      @NonNull ImageButton imageButtonWebDev, @NonNull SearchView searchBar,
      @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3) {
    this.rootView = rootView;
    this.imageButtonMobile = imageButtonMobile;
    this.imageButtonUx = imageButtonUx;
    this.imageButtonWebDev = imageButtonWebDev;
    this.searchBar = searchBar;
    this.textView = textView;
    this.textView2 = textView2;
    this.textView3 = textView3;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentCategoryBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentCategoryBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_category, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentCategoryBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.image_button_mobile;
      ImageButton imageButtonMobile = ViewBindings.findChildViewById(rootView, id);
      if (imageButtonMobile == null) {
        break missingId;
      }

      id = R.id.image_button_ux;
      ImageButton imageButtonUx = ViewBindings.findChildViewById(rootView, id);
      if (imageButtonUx == null) {
        break missingId;
      }

      id = R.id.image_button_webDev;
      ImageButton imageButtonWebDev = ViewBindings.findChildViewById(rootView, id);
      if (imageButtonWebDev == null) {
        break missingId;
      }

      id = R.id.search_bar;
      SearchView searchBar = ViewBindings.findChildViewById(rootView, id);
      if (searchBar == null) {
        break missingId;
      }

      id = R.id.textView;
      TextView textView = ViewBindings.findChildViewById(rootView, id);
      if (textView == null) {
        break missingId;
      }

      id = R.id.textView2;
      TextView textView2 = ViewBindings.findChildViewById(rootView, id);
      if (textView2 == null) {
        break missingId;
      }

      id = R.id.textView3;
      TextView textView3 = ViewBindings.findChildViewById(rootView, id);
      if (textView3 == null) {
        break missingId;
      }

      return new FragmentCategoryBinding((ConstraintLayout) rootView, imageButtonMobile,
          imageButtonUx, imageButtonWebDev, searchBar, textView, textView2, textView3);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
