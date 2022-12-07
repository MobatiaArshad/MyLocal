package com.example.mylocal.touristGuide;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.TextView;

import com.example.mylocal.R;

public class GuideDetailActivity extends AppCompatActivity {

    WebView webView;
    TextView barTitle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guide_detail);

        String htm = getIntent().getStringExtra("data");
        String data = "<html><head><style>img{max-width: 100%; width:auto; height: auto;}</style><meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">"+htm+"</head></html>";

        webView = findViewById(R.id.webView);
        barTitle = findViewById(R.id.barTitle);

        barTitle.setText(getIntent().getStringExtra("title"));
        webView.loadDataWithBaseURL(null, data, "text/html", "utf-8", null);
    }
}