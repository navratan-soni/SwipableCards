package com.nuffwritten.swipablecards.ui;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by navratan on 2019-10-14
 */
public class ListAdapter extends RecyclerView.Adapter<ListAdapter.ItemVireHolder> {

    @NonNull
    @Override
    public ItemVireHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull ItemVireHolder itemVireHolder, int i) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public static class ItemVireHolder extends RecyclerView.ViewHolder {

        public ItemVireHolder(@NonNull View itemView) {
            super(itemView);
        }
    }

}
