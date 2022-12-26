package com.example.mylocal.transport;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.mylocal.R;
import com.github.chrisbanes.photoview.PhotoView;

public class ZoomableActivity extends AppCompatActivity {

    PhotoView photoView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_zoomable);

        photoView = findViewById(R.id.zoomView);

        if (getIntent().getStringExtra("type").equals("0")) {
            photoView.setImageResource(R.drawable.under_ground);
        } else {
            photoView.setImageResource(R.drawable.dlr_map);
        }

    }
}