package com.github.dubu.indexheaderrecyclerview.calculation;

import android.graphics.Rect;
import android.view.View;

import static android.view.ViewGroup.LayoutParams;
import static android.view.ViewGroup.MarginLayoutParams;

public class DimensionCalculator {

  public void initMargins(Rect margins, View view) {
    LayoutParams layoutParams = view.getLayoutParams();

    if (layoutParams instanceof MarginLayoutParams) {
      MarginLayoutParams marginLayoutParams = (MarginLayoutParams) layoutParams;
      initMarginRect(margins, marginLayoutParams);
    } else {
        margins.set(0, 0, 0, 0);
    }
  }

  private void initMarginRect(Rect marginRect, MarginLayoutParams marginLayoutParams) {
      marginRect.set(
        marginLayoutParams.leftMargin,
        marginLayoutParams.topMargin,
        marginLayoutParams.rightMargin,
        marginLayoutParams.bottomMargin
    );
  }

}
