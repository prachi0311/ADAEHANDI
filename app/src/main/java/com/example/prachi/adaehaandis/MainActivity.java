package com.example.prachi.adaehaandis;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.MenuItem;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private TextView mTextMessage;
    ArrayList<String> links;
    imageadapter adapter;
    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
//            switch (item.getItemId()) {
//                case R.id.navigation_profile:
//                    mTextMessage.setText("profile");
//                    return true;
//                case R.id.navigation_notification:
//                    mTextMessage.setText("notification");
//                    return true;
//                case R.id.navigation_home:
//                    mTextMessage.setText("home");
//                    return true;
//                case R.id.navigation_services:
//                    mTextMessage.setText("services");
//                case R.id.navigation_FAQs:
//                    mTextMessage.setText("FAQS");
//
//           }
            return true;
        }

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ActionBar actionBar=getSupportActionBar();
        actionBar.setTitle("ADA E HANNDI");
       // mTextMessage = (TextView) findViewById(R.id.message);
        RecyclerView imagerecycle=(RecyclerView)findViewById(R.id.recyclerviewgalleryphotos);
        links=new ArrayList<>();

        links.add(0,"https://bigapplecurry.files.wordpress.com/2012/11/istock_000019639558_medium.jpg");
        links.add(1,"https://static.pexels.com/photos/70497/pexels-photo-70497.jpeg");
        links.add(2,"https://bigapplecurry.files.wordpress.com/2012/11/istock_000019639558_medium.jpg");
        links.add(3,"http://www.lotusindianrestaurant.ca/images/img-slide-3.jpg");
       // RecyclerView recyclerView=(RecyclerView) findViewById(R.id.castrecycleview);
        imagerecycle.setHasFixedSize(true);
        RecyclerView.LayoutManager layoutManager= new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL,false);
        adapter=new imageadapter(links,this);
        imagerecycle.setAdapter(adapter);
        imagerecycle.setLayoutManager(layoutManager);
        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);

    }

}
