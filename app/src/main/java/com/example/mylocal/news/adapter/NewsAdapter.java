package com.example.mylocal.news.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.mylocal.R;
import com.example.mylocal.news.model.NewsData;
import com.example.mylocal.utils.RecClickedPosition;

import java.util.ArrayList;

public class NewsAdapter extends RecyclerView.Adapter<NewsAdapter.VH> {

    ArrayList<NewsData> newsData;
    RecClickedPosition clickedPosition;

    public NewsAdapter(ArrayList<NewsData> newsData, RecClickedPosition clickedPosition) {
        this.newsData = newsData;
        this.clickedPosition = clickedPosition;
    }

    @NonNull
    @Override
    public VH onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new VH(LayoutInflater.from(parent.getContext()).inflate(R.layout.news_rec_lyt,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull VH holder, int position) {
        holder.title.setText(newsData.get(position).getTitle());

        Glide.with(holder.itemView.getContext())
                .asBitmap()
                .load(newsData.get(position).getImg())
                .into(holder.img);

        holder.itemView.setOnClickListener(v -> {
            clickedPosition.clicked(position,newsData.get(position).getLink());
        });
    }

    @Override
    public int getItemCount() {
        return newsData.size();
    }

    static class VH extends RecyclerView.ViewHolder {
        TextView title;
        ImageView img;

        public VH(@NonNull View itemView) {
            super(itemView);
            title = itemView.findViewById(R.id.newTitleTxt);
            img = itemView.findViewById(R.id.newsImg);
        }
    }
}
