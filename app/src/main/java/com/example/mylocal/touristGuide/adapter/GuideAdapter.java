package com.example.mylocal.touristGuide.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.mylocal.R;
import com.example.mylocal.utils.RecClickedPosition;

import java.util.List;

public class GuideAdapter extends RecyclerView.Adapter<GuideAdapter.VH> {

    List<String> array;
    RecClickedPosition clickedPosition;

    public GuideAdapter(List<String> array, RecClickedPosition clickedPosition) {
        this.array = array;
        this.clickedPosition = clickedPosition;
    }

    @NonNull
    @Override
    public VH onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new VH(LayoutInflater.from(parent.getContext()).inflate(R.layout.guide_rec_lyt,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull VH holder, int position) {
        holder.title.setText(array.get(position));

        holder.itemView.setOnClickListener(v -> {
            clickedPosition.clicked(position,"");
        });
    }

    @Override
    public int getItemCount() {
        return array.size();
    }

    static class VH extends RecyclerView.ViewHolder {
        TextView title;
        public VH(@NonNull View itemView) {
            super(itemView);
            title = itemView.findViewById(R.id.guideTitle);
        }
    }
}
