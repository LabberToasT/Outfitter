package com.outfitter.OutfitsList;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.outfitter.OutfitsList.CreateNewOutfitItem.CreateNewOutfitItem;
import com.outfitter.OutfitsList.OutfitItem.OutfitItem;
import com.outfitter.OutfitsList.CreateNewOutfitItem.CreateNewOutfitViewHolder;
import com.outfitter.OutfitsList.OutfitItem.OutfitViewHolder;
import com.outfitter.R;

import java.util.List;

public class OutfitListAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    private List<IRecyclerItem> items;

    public OutfitListAdapter(List<IRecyclerItem> items) {
        this.items = items;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());

        switch (viewType) {
            case OutfitItem.VIEW_TYPE:
                return new OutfitViewHolder(
                        inflater.inflate(R.layout.outfit_card, parent, false),
                        parent.getContext().getResources()
                );
            case CreateNewOutfitItem.VIEW_TYPE:
                return new CreateNewOutfitViewHolder(
                        inflater.inflate(R.layout.create_new_outfit_card, parent, false)
                );
            default:
                return null; // TODO: I should return some default item
        }
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        IRecyclerItem item = getItem(position);

        AbstractViewHolder viewHolder = (AbstractViewHolder) holder;
        viewHolder.bind(item);// TODO: How can I fix this?
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    @Override
    public int getItemViewType(int position) {
        return getItem(position).getViewType();
    }

    public void add(IRecyclerItem item) {
        items.add(item);

        int position = items.size() - 1;
        notifyItemChanged(position);
    }

    private IRecyclerItem getItem(int position) {
        return items.get(position);
    }
}
