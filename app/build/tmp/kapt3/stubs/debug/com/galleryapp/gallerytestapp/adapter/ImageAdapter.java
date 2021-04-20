package com.galleryapp.gallerytestapp.adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0002\u001a\u001bB\u0005\u00a2\u0006\u0002\u0010\u0003J\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0006J\u0006\u0010\f\u001a\u00020\nJ\b\u0010\r\u001a\u00020\u000eH\u0016J\u001c\u0010\u000f\u001a\u00020\n2\n\u0010\u0010\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u000eH\u0016J\u001c\u0010\u0012\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u000eH\u0016J&\u0010\u0016\u001a\u00020\n2\u0016\u0010\u0017\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u00182\u0006\u0010\u0019\u001a\u00020\bR\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001c"}, d2 = {"Lcom/galleryapp/gallerytestapp/adapter/ImageAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/galleryapp/gallerytestapp/adapter/ImageAdapter$ViewHolder;", "()V", "imageList", "Ljava/util/ArrayList;", "", "onImageClickListener", "Lcom/galleryapp/gallerytestapp/adapter/ImageAdapter$OnImageClickListener;", "addItem", "", "url", "clear", "getItemCount", "", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "update", "list", "Lkotlin/collections/ArrayList;", "onClickListener", "OnImageClickListener", "ViewHolder", "app_debug"})
public final class ImageAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.galleryapp.gallerytestapp.adapter.ImageAdapter.ViewHolder> {
    private java.util.ArrayList<java.lang.String> imageList;
    private com.galleryapp.gallerytestapp.adapter.ImageAdapter.OnImageClickListener onImageClickListener;
    
    public final void update(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<java.lang.String> list, @org.jetbrains.annotations.NotNull()
    com.galleryapp.gallerytestapp.adapter.ImageAdapter.OnImageClickListener onClickListener) {
    }
    
    public final void addItem(@org.jetbrains.annotations.NotNull()
    java.lang.String url) {
    }
    
    public final void clear() {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.galleryapp.gallerytestapp.adapter.ImageAdapter.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.galleryapp.gallerytestapp.adapter.ImageAdapter.ViewHolder holder, int position) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    public ImageAdapter() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&\u00a8\u0006\b"}, d2 = {"Lcom/galleryapp/gallerytestapp/adapter/ImageAdapter$OnImageClickListener;", "", "onImageClick", "", "image", "", "position", "", "app_debug"})
    public static abstract interface OnImageClickListener {
        
        public abstract void onImageClick(@org.jetbrains.annotations.NotNull()
        java.lang.String image, int position);
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b\u00a8\u0006\t"}, d2 = {"Lcom/galleryapp/gallerytestapp/adapter/ImageAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Lcom/galleryapp/gallerytestapp/adapter/ImageAdapter;Landroid/view/View;)V", "bind", "", "image", "", "app_debug"})
    public final class ViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        
        public final void bind(@org.jetbrains.annotations.NotNull()
        java.lang.String image) {
        }
        
        public ViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View itemView) {
            super(null);
        }
    }
}