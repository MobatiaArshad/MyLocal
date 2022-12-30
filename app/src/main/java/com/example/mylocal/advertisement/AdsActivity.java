package com.example.mylocal.advertisement;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
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

        /**
         *  setting Recycler Adapter
         */

        adsRec.setAdapter(new AdsAdapter(AdsData()));

        List<String> adapterData = AdsData().stream().map(AdsModel::getCategory).distinct().collect(Collectors.toList());
        adapterData.add(0,"All");

        categoryRec.setAdapter(new AdsCategoryAdapter(adapterData, (position, value) -> {

            /**
             *  calling for recyclerview animation
             */

            adsRec.scheduleLayoutAnimation();

            /*
                sorting list item according to user selection
             */

            if (value.equals("All")) adsRec.setAdapter(new AdsAdapter(AdsData()));
            else adsRec.setAdapter(new AdsAdapter(AdsData().stream().filter(p -> Objects.equals(p.getCategory(), value)).collect(Collectors.toList())));
        }));

    }

    /**
     *
     *  creating array data for advertisement
     */

    public List<AdsModel> AdsData() {
        List<AdsModel> arrayList = new ArrayList<>();
        arrayList.add(new AdsModel(
                "Christmas is Here!!",
                "https://thumbs.dreamstime.com/z/avocado-coffee-greenwich-london-uk-peninsula-june-organic-vegetarian-vegan-products-modern-lifestyle-shop-196218380.jpg",
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
                "https://www.allthingsgreenwich.co.uk/images/the_cutty_sark_gift_shop-1000-(600px).jpg",
                "McDonald’s giving away free food with app deals Monday through Christmas Eve featuring Santa, Rudolph, more",
                "Gift",
                false
        ));
        arrayList.add(new AdsModel(
                "Rustic Chic",
                "https://fastly.4sqi.net/img/general/width960/330762_r-5Ya4mkQdTRcN_u7iLO6O8to1rQNv0grq-Y90Gu2vM.jpg",
                "McDonald’s giving away free food with app deals Monday through Christmas Eve featuring Santa, Rudolph, more",
                "Gift",
                false
        ));
        arrayList.add(new AdsModel(
                "Carrefour",
                "https://lh3.googleusercontent.com/p/AF1QipN0Co5WtWVIrWuq1_3G2l-gPkjtX5N2x1r9r1xe=s680-w680-h510",
                "McDonald’s giving away free food with app deals Monday through Christmas Eve featuring Santa, Rudolph, more",
                "Restaurant/Cafe",
                false
        ));
        return arrayList;
    }
}