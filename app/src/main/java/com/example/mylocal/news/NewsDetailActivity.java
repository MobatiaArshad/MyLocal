package com.example.mylocal.news;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.example.mylocal.R;
import com.example.mylocal.news.model.NewsData;

public class NewsDetailActivity extends AppCompatActivity {

    TextView title,author,date,description;
    ImageView img,likeBtn,shareBtn;
    NewsData newsData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news_detail);

        newsData = (NewsData) getIntent().getSerializableExtra("data");

        title = findViewById(R.id.newTitleTxt);
        description = findViewById(R.id.newDescTxt);
        author = findViewById(R.id.authorTxt);
        date = findViewById(R.id.dateTxt);
        img = findViewById(R.id.newsImg);
        likeBtn = findViewById(R.id.likeBtn);
        shareBtn = findViewById(R.id.shareIco);

        title.setText(newsData.getTitle());
        description.setText(newsData.getDesc());
        author.setText(newsData.getAuthor());
        date.setText(newsData.getPostedDate());

        Glide.with(this)
                .asBitmap()
                .load(newsData.getImg())
                .into(img);


    }
}