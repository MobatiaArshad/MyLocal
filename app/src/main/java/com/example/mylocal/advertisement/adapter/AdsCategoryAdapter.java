package com.example.mylocal.advertisement.adapter;

import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.recyclerview.widget.RecyclerView;

import com.example.mylocal.R;
import com.example.mylocal.utils.RecClickedPosition;

import java.util.List;

public class AdsCategoryAdapter extends RecyclerView.Adapter<AdsCategoryAdapter.VH> {

    List<String> arrayList;
    RecClickedPosition clickedPosition;
    int activePosition = 0;

    public AdsCategoryAdapter(List<String> arrayList, RecClickedPosition clickedPosition) {
        this.arrayList = arrayList;
        this.clickedPosition = clickedPosition;
    }

    @NonNull
    @Override
    public VH onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new VH(LayoutInflater.from(parent.getContext()).inflate(R.layout.ads_category_rec_lyt, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull VH holder, int position) {
        holder.title.setText(arrayList.get(position));

        if (activePosition == position) holder.item.setBackgroundColor(holder.itemView.getContext().getColor(R.color.icon_green));
        else holder.item.setBackgroundColor(holder.itemView.getContext().getColor(R.color.white));

        holder.itemView.setOnClickListener(v -> {
            clickedPosition.clicked(position,arrayList.get(position));
            activePosition = position;
            notifyDataSetChanged();
        });
    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    static class VH extends RecyclerView.ViewHolder {
        TextView title;
        LinearLayoutCompat item;
        public VH(@NonNull View itemView) {
            super(itemView);
            title = itemView.findViewById(R.id.recAdCategoryTxt);
            item = itemView.findViewById(R.id.itemCard);
        }
    }
}
