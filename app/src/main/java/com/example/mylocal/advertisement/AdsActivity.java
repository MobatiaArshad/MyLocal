package com.example.mylocal.advertisement;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Build;
import android.os.Bundle;

import com.example.mylocal.R;
import com.example.mylocal.advertisement.adapter.AdsAdapter;
import com.example.mylocal.advertisement.adapter.AdsCategoryAdapter;
import com.example.mylocal.advertisement.model.AdsModel;
import com.example.mylocal.utils.RecClickedPosition;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class AdsActivity extends AppCompatActivity {

    RecyclerView categoryRec,adsRec;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ads);

        categoryRec = findViewById(R.id.categoryRec);
        adsRec = findViewById(R.id.adsRec);
        adsRec.scheduleLayoutAnimation();

        adsRec.setAdapter(new AdsAdapter(AdsData()));

        List<String> adapterData = AdsData().stream().map(AdsModel::getCategory).distinct().collect(Collectors.toList());
        adapterData.add(0,"All");

        categoryRec.setAdapter(new AdsCategoryAdapter(adapterData, (position, value) -> {
            adsRec.scheduleLayoutAnimation();
            if (value.equals("All")) adsRec.setAdapter(new AdsAdapter(AdsData()));
            else adsRec.setAdapter(new AdsAdapter(AdsData().stream().filter(p -> Objects.equals(p.getCategory(), value)).collect(Collectors.toList())));
        }));

    }

    public List<AdsModel> AdsData() {
        List<AdsModel> arrayList = new ArrayList<>();
        arrayList.add(new AdsModel(
                "Christmas is Here!!",
                "https://www.gannett-cdn.com/presto/2020/12/10/USAT/0db5d522-3bf6-4cbc-8c3a-84e271e6aad3-VPC_MCDONALDS_FREE_CHRISTMAS_MEALS_DESK_THUMB.jpg?width=1280&height=720&fit=crop&format=pjpg&auto=webp",
                "McDonald’s giving away free food with app deals Monday through Christmas Eve featuring Santa, Rudolph, more",
                "Restaurant/Cafe",
                true
        ));
        arrayList.add(new AdsModel(
                "Midpoint Restaurant",
                "https://media-cdn.tripadvisor.com/media/photo-s/12/39/ca/5b/midpoint-restaurant.jpg",
                "The safety of our customers and staff remains our highest priority and we have taken the necessary measures to help you feel as safe and comfortable as ever.",
                "Restaurant/Cafe",
                false
        ));
        arrayList.add(new AdsModel(
                "Made in Greenwich",
                "https://www.allthingsgreenwich.co.uk/images/made_in_greenwich-926-(600px).jpg",
                "McDonald’s giving away free food with app deals Monday through Christmas Eve featuring Santa, Rudolph, more",
                "Gift",
                false
        ));
        arrayList.add(new AdsModel(
                "Rustic Chic",
                "https://www.allthingsgreenwich.co.uk/images/rusticchic-1144-(600px).jpg",
                "McDonald’s giving away free food with app deals Monday through Christmas Eve featuring Santa, Rudolph, more",
                "Gift",
                false
        ));
        arrayList.add(new AdsModel(
                "IKEA",
                "https://static.dezeen.com/uploads/2019/02/ikea-greenwich-sustainable-store_dezeen_1704_hero_0.jpg",
                "McDonald’s giving away free food with app deals Monday through Christmas Eve featuring Santa, Rudolph, more",
                "Grocery",
                false
        ));
        arrayList.add(new AdsModel(
                "ALDI",
                "https://ichef.bbci.co.uk/news/976/cpsprodpb/37AF/production/_122755241_aldi-shopandgo-2.jpg",
                "McDonald’s giving away free food with app deals Monday through Christmas Eve featuring Santa, Rudolph, more",
                "Grocery",
                false
        ));
        arrayList.add(new AdsModel(
                "7Eleven",
                "https://www.claruscommerce.com/wp-content/uploads/2019/12/how-did-7eleven-nearly-triple-its-loyalty-program-membership-0x0.jpg",
                "McDonald’s giving away free food with app deals Monday through Christmas Eve featuring Santa, Rudolph, more",
                "Grocery",
                false
        ));
        arrayList.add(new AdsModel(
                "Carrefour",
                "https://etimg.etb2bimg.com/photo/93708754.cms",
                "McDonald’s giving away free food with app deals Monday through Christmas Eve featuring Santa, Rudolph, more",
                "Grocery",
                false
        ));
        return arrayList;
    }
}