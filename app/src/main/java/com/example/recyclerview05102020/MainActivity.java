package com.example.recyclerview05102020;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView mRcvShop;
    ShopAdapter mShopAdapter;
    List<Shop> mShopList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mRcvShop = findViewById(R.id.recyclerView);
        mShopList = new ArrayList<>();

        mShopList.add(new Shop("7 - eleven : Cửa hàng tiện lợi",50 ,""));
    }
}