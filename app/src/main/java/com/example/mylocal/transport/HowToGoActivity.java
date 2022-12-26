package com.example.mylocal.transport;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;

import com.example.mylocal.R;
import com.example.mylocal.transport.adapter.TransportAdapter;
import com.example.mylocal.transport.model.TransportModel;

import java.util.ArrayList;

public class HowToGoActivity extends AppCompatActivity {

    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_how_to_go);

        recyclerView = findViewById(R.id.howToGoRec);

        new Handler().postDelayed(() -> {
            recyclerView.scheduleLayoutAnimation();
            recyclerView.setAdapter(new TransportAdapter(transportData(), (position, value) -> {

                String uri = null;

                switch (position) {
                    case 0:
                        uri = "https://www.google.com/maps/dir/Cutty+Sark,+London/Big+Ben,+London/@51.4949074,-0.1045715,13z/data=!3m1!4b1!4m14!4m13!1m5!1m1!1s0x487602856e55ff63:0xec72e42ef07d595d!2m2!1d-0.0109182!2d51.4817904!1m5!1m1!1s0x487604c38c8cd1d9:0xb78f2474b9a45aa9!2m2!1d-0.1246254!2d51.5007292!3e3";
                        break;
                    case 1:
                        uri = "https://www.google.com/maps/dir/Cutty+Sark,+London/Tower+Bridge,+Tower+Bridge+Rd,+London+SE1+2UP/@51.4981762,-0.0785901,13z/data=!3m2!4b1!5s0x487603461c01f6e7:0x399d0f3fbe9f54f5!4m14!4m13!1m5!1m1!1s0x487602856e55ff63:0xec72e42ef07d595d!2m2!1d-0.0109182!2d51.4817904!1m5!1m1!1s0x487603438b65db49:0x9e78421a085a6f2d!2m2!1d-0.0753565!2d51.5054564!3e3";
                        break;
                    case 2:
                        uri = "https://www.google.com/maps/dir/Cutty+Sark,+London/Westminster,+London/@51.4938193,-0.113138,13z/data=!3m2!4b1!5s0x487603461c01f6e7:0x399d0f3fbe9f54f5!4m14!4m13!1m5!1m1!1s0x487602856e55ff63:0xec72e42ef07d595d!2m2!1d-0.0109182!2d51.4817904!1m5!1m1!1s0x487604ddae95b455:0xcd1d64863bc57f40!2m2!1d-0.1356583!2d51.4974948!3e3";
                        break;
                    case 3:
                        uri = "https://www.google.com/maps/dir/Cutty+Sark,+London/Buckingham+Palace,+London/@51.494803,-0.113138,13z/data=!3m2!4b1!5s0x487603461c01f6e7:0x399d0f3fbe9f54f5!4m14!4m13!1m5!1m1!1s0x487602856e55ff63:0xec72e42ef07d595d!2m2!1d-0.0109182!2d51.4817904!1m5!1m1!1s0x48760520cd5b5eb5:0xa26abf514d902a7!2m2!1d-0.14189!2d51.501364!3e3";
                        break;
                    case 4:
                        uri = "https://www.google.com/maps/dir/Cutty+Sark,+London/Soho,+London/@51.4994938,-0.1094885,13z/data=!3m2!4b1!5s0x487603461c01f6e7:0x399d0f3fbe9f54f5!4m14!4m13!1m5!1m1!1s0x487602856e55ff63:0xec72e42ef07d595d!2m2!1d-0.0109182!2d51.4817904!1m5!1m1!1s0x487604d49f4b7f9b:0xe44e57cc537e5dd2!2m2!1d-0.1365486!2d51.5136143!3e3";
                        break;
                }


                Intent intent = new Intent(android.content.Intent.ACTION_VIEW, Uri.parse(uri));
                startActivity(Intent.createChooser(intent, "Select an application"));

            }));
        },100);


    }

    public ArrayList<TransportModel> transportData() {
        ArrayList<TransportModel> arrayList = new ArrayList<>();
        arrayList.add(new TransportModel(
                "To Big Ben"
        ));
        arrayList.add(new TransportModel(
                "Tower Bridge"
        ));
        arrayList.add(new TransportModel(
                "To Westminster"
        ));
        arrayList.add(new TransportModel(
                "To Buckingham Palace"
        ));
        arrayList.add(new TransportModel(
                "To SOHO"
        ));

        return arrayList;
    }

}