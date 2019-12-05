package com.outfitter.OutfitsList;

import android.view.View;

import androidx.recyclerview.widget.RecyclerView;

import com.outfitter.OutfitsList.IRecyclerItem;

public abstract class AbstractViewHolder<T extends IRecyclerItem> extends RecyclerView.ViewHolder {
    public AbstractViewHolder(View itemView) {
        super(itemView);
    }

    public abstract void bind(T item) throws IllegalArgumentException;
}
