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

                /**
                 * @position is 0 then user must see under ground map or if it is 1 it should see  dlr map
                 * if did not meet both state it intent to move to next page
                 */

                if (position == 0) {
                    // showing underground Map
                    startActivity(new Intent(this, ZoomableActivity.class)
                            .putExtra("type", "0"));
                } else if (position == 1) {
                    // showing DLR Map
                    startActivity(new Intent(this,ZoomableActivity.class)
                            .putExtra("type","1"));
                } else {
                    startActivity(new Intent(this,HowToGoActivity.class));
                }
            }));
        },100);

    }

    // setting transport array Data

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