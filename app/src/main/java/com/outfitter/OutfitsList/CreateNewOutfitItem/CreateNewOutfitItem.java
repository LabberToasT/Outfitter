package com.outfitter.OutfitsList.CreateNewOutfitItem;

import com.outfitter.OutfitsList.IRecyclerItem;

public class CreateNewOutfitItem implements IRecyclerItem {
    public static final int VIEW_TYPE = 1;

    @Override
    public int getViewType() {
        return VIEW_TYPE;
    }

    @Override
    public Object getContent() {
        return null;
    }
}
