package com.outfitter.OutfitsList.OutfitItem;

import android.content.res.Resources;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.annotation.DimenRes;

import com.outfitter.OutfitsList.AbstractViewHolder;
import com.outfitter.R;
import com.squareup.picasso.Picasso;

import java.io.File;

public class OutfitViewHolder extends AbstractViewHolder<OutfitItem> {
    private ImageView outfit;
    private Button share;
    private Button like;
    private Resources resources;

    public OutfitViewHolder(View itemView, Resources resources) {
        super(itemView);

        outfit = itemView.findViewById(R.id.outfit_card_image);
        share = itemView.findViewById(R.id.outfit_card_share);
        like = itemView.findViewById(R.id.outfit_card_like);
        this.resources = resources;
    }

    @Override
    public void bind(OutfitItem item) throws IllegalArgumentException {
        setOutfitImage(item.getContent());

        bindLikeOnClick();

        bindShareOnClick();
    }

    private void bindShareOnClick() {
        share.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i(OutfitViewHolder.class.getSimpleName(), "User clicked share on OutfitCard");
            }
        });
    }

    private void bindLikeOnClick() {
        like.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i(OutfitViewHolder.class.getSimpleName(), "User clicked like on OutfitCard");
            }
        });
    }

    private void setOutfitImage(File outfitSrc) {
        Picasso.get()
                .load(outfitSrc)
                .resize(getDimen(R.dimen.outfit_card_width), getDimen(R.dimen.outfit_card_height))
                .into(outfit);
    }

    private int getDimen(@DimenRes int dimenRes) {
        int dimen = (int) resources.getDimension(dimenRes);
        int density = (int) resources.getDisplayMetrics().density;

        return dimen / density;
    }
}
