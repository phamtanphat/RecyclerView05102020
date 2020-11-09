package com.example.recyclerview05102020;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ShopAdapter {


    class ShopViewHolder extends RecyclerView.ViewHolder{
        ImageView mImgOnLine,mImgBackground;
        TextView mTvName,mTvCountShop,mTvSaleOff,mTvPrice,mTvPromotion;

        public ShopViewHolder(@NonNull View itemView) {
            super(itemView);
            mImgBackground = itemView.findViewById(R.id.imageBackground);
            mImgOnLine = itemView.findViewById(R.id.imageOnline);
            mTvName = itemView.findViewById(R.id.textViewNameShop);
            mTvCountShop = itemView.findViewById(R.id.textViewCountShops);
            mTvSaleOff = itemView.findViewById(R.id.textViewSaleOff);
            mTvPrice = itemView.findViewById(R.id.textViewPrice);
            mTvPromotion = itemView.findViewById(R.id.textViewPromtion);
        }
    }
}
