package com.example.mylocal.transport.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.mylocal.R;
import com.example.mylocal.transport.model.TransportModel;
import com.example.mylocal.utils.RecClickedPosition;

import java.util.ArrayList;

public class TransportAdapter extends RecyclerView.Adapter<TransportAdapter.MyVH> {

    ArrayList<TransportModel> arrayList;
    RecClickedPosition clickedPosition;

    public TransportAdapter(ArrayList<TransportModel> arrayList, RecClickedPosition clickedPosition) {
        this.arrayList = arrayList;
        this.clickedPosition = clickedPosition;
    }

    @NonNull
    @Override
    public MyVH onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new MyVH(LayoutInflater.from(parent.getContext()).inflate(R.layout.transport_rec_lyt,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull MyVH holder, int position) {
        holder.title.setText(arrayList.get(position).getTitle());
    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    static class MyVH extends RecyclerView.ViewHolder{
        TextView title;

        public MyVH(@NonNull View itemView) {
            super(itemView);
            title = itemView.findViewById(R.id.transportTxt);
        }
    }

}

