package com.outfitter.OutfitsList;

import androidx.annotation.NonNull;

public interface IRecyclerItem {
    @NonNull
    String toString();

    boolean equals(Object obj);

    int getViewType();

    Object getContent();
}
