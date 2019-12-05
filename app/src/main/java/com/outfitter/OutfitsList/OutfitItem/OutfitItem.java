package com.outfitter.OutfitsList.OutfitItem;

import com.outfitter.OutfitsList.IRecyclerItem;

import java.io.File;

public class OutfitItem implements IRecyclerItem {
    public static final int VIEW_TYPE = 0;
    private File image;

    public OutfitItem(File file) {
        image = file;
    }

    @Override
    public int getViewType() {
        return VIEW_TYPE;
    }

    @Override
    public File getContent() {
        return image;
    }
}
