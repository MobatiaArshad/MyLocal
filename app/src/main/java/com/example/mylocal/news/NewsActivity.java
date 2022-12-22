package com.example.mylocal.news;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import com.example.mylocal.R;
import com.example.mylocal.news.adapter.NewsAdapter;
import com.example.mylocal.news.model.NewsData;

import java.util.ArrayList;

public class NewsActivity extends AppCompatActivity {

    RecyclerView newsRec;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news);

        newsRec = findViewById(R.id.newsRec);

        new Handler().postDelayed(() -> {
            newsRec.scheduleLayoutAnimation();
            newsRec.setAdapter(new NewsAdapter(newsData(),(position, value) -> startActivity(new Intent(NewsActivity.this,NewsDetailActivity.class)
                    .putExtra("data",newsData().get(position)))));
        },100);


    }

    public ArrayList<NewsData> newsData() {
        ArrayList<NewsData> newsData = new ArrayList<>();
        newsData.add(new NewsData(
                "Argentina lift the world cup after 36 years",
                "Waves of euphoria sweep through Lusail Stadium as La Albiceleste beat France in a dramatic final to become champions for a third time.",
                "https://media.cnn.com/api/v1/images/stellar/prod/221218143251-argentina-team-world-cup-celebrates-121822.jpg?c=original",
                "Dec 18, 2022 | 10:38 AM",
                "Rob Banks",
                "Sports",
                0
        ));
        newsData.add(new NewsData(
                "Brazil pay tribute to ailing Pele after defeating South Korea 4-1 in FIFA World Cup round 16 match",
                "The Brazilian team paid tribute to their country's legendary footballer Pele by dedicating the victory against South Korea in the round of 16 match on Monday. Notably, the 82-year-old football legend is reportedly undergoing treatment for a respiratory problem at a hospital in Sao Paulo. Pele is also suffering from colon cancer.\n" +
                        "The members of Brazil's world cup team unfurled a flag featuring Pele following the match against South Korea at Stadium 974 in Qatar's Doha. The video of the incident is going viral on social media. The Brazil Football Confederation also shared the image on its official Twitter handle.",
                "https://static.tnn.in/photo/msid-96019544,imgsize-143354,updatedat-1670302364828,width-200,height-200,resizemode-75/96019544.jpg",
                "Dec 6, 2022 | 10:38 AM",
                "Rob Banks",
                "Sports",
                0
        ));

        newsData.add(new NewsData(
                "To keep residents warm, Greenwich distributes over 600 winter coats in annual giveaway",
                "The town of Greenwich helped residents prepare for the approaching cold days of winter with its annual coat distribution. \n" +
                        "\n" +
                        "The town gave more than 600 new and gently used coats to 172 families at the three-day event held this week in the Meeting Room at Town Hall.  \n" +
                        "\n" +
                        "Coats were available in a variety of sizes and colors, and for both adults and children. \n \n" +
                        "The coat drive was sponsored by the Board of Human Services, the Greenwich Department of Human Services Fund, St. Paul's and Mothers for Others. \n" +
                        "\n" +
                        "Mothers for Others distributed 5,050 diapers and pull-ups as well as wipes to families with young children.",
                "https://s.hdnux.com/photos/01/30/46/01/23224384/3/1200x0.jpg",
                "Dec 2, 2022 | 8:11 AM",
                "Rebecca Markele",
                "Community",
                0
        ));
        newsData.add(new NewsData(
                "Prince William breaks silence after Prince Harry and Meghan Markle release explosive trailer",
                "The Prince and Princess of Wales have remained silent following the release of Prince Harry and Meghan Markle's bombshell trailer for their upcoming Netflix docuseries.\n" +
                        "\n" +
                        "However, on Tuesday, Prince William released a special message to the Welsh Rugby Union after it was announced Warren Gatland has agreed to return as head coach for the Wales side. \n \n" +
                        "\"Thank you Wayne for everything you've done for @WelshRugbyUnion. Wishing you well for the future,\" the royal tweeted. \"Wishing Warren Gatland the very best of luck for the run into the 6 Nations and Rugby World Cup.\" The message was then signed off with, \"W\".\n" +
                        "\n" +
                        "The tweet comes shortly after Prince William and Princess Kate, both 40, finished their whirlwind tour of Boston. The trip was somewhat marred, however, when the Duke and Duchess of Sussex dropped two teasers for their tell-all documentary.",
                "https://images.hellomagazine.com/imagenes/royalty/20221206158896/prince-william-breaks-silence-after-prince-harry-meghan-markle-trailer/0-771-992/prince-william-kate-middleton-walk-infront-harry-meghan-t.jpg?tx=w_1200",
                "Dec 06, 2022 | 11:15 AM",
                "SHARNAZ SHAHID",
                "Entertainment",
                0
        ));
        newsData.add(new NewsData(
                "Museum of London closes Barbican venue ahead of move",
                "The Museum of London is closing on Sunday evening but it will open its doors once more, in a different location and with a different name.\n" +
                        "\n" +
                        "After 45 years at London Wall, the museum will be relocating to nearby West Smithfield as The London Museum.\n" +
                        "\n" +
                        "It will be hosting a 24-hour event for the first time in its history to bid farewell to its Barbican venue.\n" +
                        "\n" +
                        "The museum plans to reopen in 2026. Its Docklands museum will be still be open during the move.\n" +
                        "\n" +
                        "As part of the farewell celebrations, there will be a score of free events over the weekend, including a DJ workshop, a late-night cinema and a table football competition.",
                "https://ichef.bbci.co.uk/news/976/cpsprodpb/9188/production/_127865273_gettyimages-1245024929.jpg.webp",
                "Dec 03, 2022 | 04:15 PM",
                "SHARNAZ SHAHID",
                "Community",
                0
        ));

        return newsData;
    }
}