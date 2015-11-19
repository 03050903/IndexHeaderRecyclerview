package com.github.dubu.indexheaderrecyclerview.caching;


import android.support.v7.widget.RecyclerView;
import android.view.View;


public interface HeaderProvider {

  public View getHeader(RecyclerView recyclerView, int position);

  void invalidate();
}
