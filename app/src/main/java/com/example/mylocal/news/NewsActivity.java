package com.example.mylocal.news;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.webkit.WebSettings;
import android.webkit.WebView;

import com.example.mylocal.R;
import com.example.mylocal.news.adapter.NewsAdapter;
import com.example.mylocal.news.model.NewsData;

import java.util.ArrayList;

public class NewsActivity extends AppCompatActivity {

//    RecyclerView newsRec;
    WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news);

//        newsRec = findViewById(R.id.newsRec);

//        new Handler().postDelayed(() -> {
//            newsRec.scheduleLayoutAnimation();
//            newsRec.setAdapter(new NewsAdapter(newsData(),(position, value) -> startActivity(new Intent(Intent.ACTION_VIEW,
//                    Uri.parse(value)))));
//        },100);

        webView = findViewById(R.id.webView);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.getSettings().setDomStorageEnabled(true);
        webView.getSettings().setLoadsImagesAutomatically(true);
        webView.getSettings().setMixedContentMode(WebSettings.MIXED_CONTENT_ALWAYS_ALLOW);
        webView.loadUrl("https://www.mylondon.news/all-about/greenwich");

    }

    public ArrayList<NewsData> newsData() {
        ArrayList<NewsData> newsData = new ArrayList<>();
        newsData.add(new NewsData(
                "ART: London’s best pantomimes 2022 to book now, from McKellen’s Mother Goose to Robin Hood at Greenwich",
                "https://static.standard.co.uk/2022/11/25/08/PANTO.jpg?width=1024&auto=webp&quality=50&crop=968%3A645%2Csmart",
                "https://www.standard.co.uk/culture/theatre/london-best-pantomimes-2022-ian-mckellen-mother-goose-cinderella-robin-hood-jack-beanstalk-b1042028.html"

        ));

        newsData.add(new NewsData(
                "SCIENCE: Geminid meteor shower set to illuminate night skies",
                "https://ichef.bbci.co.uk/news/976/cpsprodpb/12FD2/production/_119787777_1a2b6ee4-e255-4ab4-b4fd-f08b16ca0ae8.jpg.webp",
                "https://www.standard.co.uk/tech/science/royal-observatory-greenwich-earth-sun-b1046471.html"

        ));
        newsData.add(new NewsData(
                "TOWN: Wetherspoons to open new riverside beer garden at Greenwich O2",
                "https://static.standard.co.uk/s3fs-public/thumbnails/image/2019/02/26/15/o2arena2602a.jpg?width=1024&auto=webp&quality=50&crop=968%3A645%2Csmart",
                "https://www.standard.co.uk/news/london/wetherspoons-greenwich-o2-pub-opening-b1041713.html"

        ));

        return newsData;
    }
}