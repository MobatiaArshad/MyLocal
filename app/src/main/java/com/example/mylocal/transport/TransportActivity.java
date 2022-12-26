package com.example.mylocal.transport;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import com.example.mylocal.R;
import com.example.mylocal.transport.adapter.TransportAdapter;
import com.example.mylocal.transport.model.TransportModel;
import com.example.mylocal.utils.RecClickedPosition;

import java.util.ArrayList;

public class TransportActivity extends AppCompatActivity {

    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transport);

        recyclerView = findViewById(R.id.transportRec);

        new Handler().postDelayed(() -> {
            recyclerView.scheduleLayoutAnimation();
            recyclerView.setAdapter(new TransportAdapter(transportData(), (position, value) -> {
                if (position == 0) {
                    startActivity(new Intent(this, ZoomableActivity.class)
                            .putExtra("type", "0"));
                } else if (position == 1) {
                    startActivity(new Intent(this,ZoomableActivity.class)
                            .putExtra("type","1"));
                } else {
                    startActivity(new Intent(this,HowToGoActivity.class));
                }
            }));
        },100);

    }

    public ArrayList<TransportModel> transportData() {
        ArrayList<TransportModel> arrayList = new ArrayList<>();
        arrayList.add(new TransportModel(
           "See underground stops"
        ));
        arrayList.add(new TransportModel(
           "See the DLR stops"
        ));
        arrayList.add(new TransportModel(
           "How to go?"
        ));

        return arrayList;
    }
}