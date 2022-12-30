package com.example.mylocal.advertisement.adapter;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.mylocal.R;
import com.example.mylocal.advertisement.model.AdsModel;
import com.stfalcon.imageviewer.StfalconImageViewer;

import java.util.ArrayList;
import java.util.List;

public class AdsAdapter extends RecyclerView.Adapter<AdsAdapter.VH> {

    List<AdsModel> arrayList;

    public AdsAdapter(List<AdsModel> arrayList) {
        this.arrayList = arrayList;
    }

    @NonNull
    @Override
    public VH onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        // pointing to recyclerView layout design
        return new VH(LayoutInflater.from(parent.getContext()).inflate(R.layout.ads_rec_lyt,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull VH holder, int position) {

        // setting image from URL
        Glide.with(holder.itemView.getContext())
                .asBitmap()
                .load(arrayList.get(position).getImage())
                .into(holder.img);

        // Item click in RecyclerView
        holder.itemView.setOnClickListener(v -> {

            // passing the Image Url to Fullscreen library
            new StfalconImageViewer.Builder<AdsModel>(holder.itemView.getContext(),arrayList,(imageView, image) -> {
               Glide.with(holder.itemView.getContext())
                       .asBitmap()
                       .load(image.getImage())
                       .into(imageView);
            }).withStartPosition(position).show();

        });
    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    static class VH extends RecyclerView.ViewHolder {

        TextView title,desc;
        ImageView img;

        public VH(@NonNull View itemView) {
            super(itemView);
            img = itemView.findViewById(R.id.adImg);
        }
    }
}
