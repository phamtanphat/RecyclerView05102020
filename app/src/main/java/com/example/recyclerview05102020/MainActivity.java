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

        mShopList.add(new Shop("7 - eleven : Cửa hàng tiện lợi",50 ,"" ,"Tối thiểu 20k",10,"Deal giảm tới 15k",R.drawable.hinh7eleven,true));
        mShopList.add(new Shop("Big C",30 ,"" ,"Tối thiểu 20k",15,"Deal giảm tới 15k",R.drawable.hinhbigc,false));
        mShopList.add(new Shop("Circle K",20 ,"" ,"Tối thiểu 10k",20,"Deal giảm tới 15k",R.drawable.hinhcirclek,true));
        mShopList.add(new Shop("Cooky market",1 ,"198 Nguyễn Văn Nghi, P.7, Gò Vấp, TP. HCM" ,"Tối thiểu 20k",10,"Deal giảm tới 15k",R.drawable.hinhcookymarket,true));
        mShopList.add(new Shop("Coop - food",15 ,"" ,"Tối thiểu 30k",10,"Deal giảm tới 15k",R.drawable.hinhcoop_food,false));
    }
}