package com.example.recyclerview05102020;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;


public class ShopAdapter extends RecyclerView.Adapter<ShopAdapter.ShopViewHolder>{

    List<Shop> mShopList;

    public ShopAdapter(List<Shop> mShopList) {
        this.mShopList = mShopList;
    }

    @NonNull
    @Override
    public ShopViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View v = layoutInflater.inflate(R.layout.item_shop,parent,false);
        return new ShopViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ShopViewHolder holder, int position) {
        Shop shop = mShopList.get(position);
        if (shop.getOnline()){
            holder.mImgOnLine.setImageResource(R.drawable.ic_online);
        }else{
            holder.mImgOnLine.setImageResource(R.drawable.ic_offline);
        }
        holder.mImgBackground.setImageResource(shop.getImage());
        holder.mTvName.setText(shop.getName());
        if (shop.getCountShops() > 1){
            holder.mTvCountShop.setText(shop.getCountShops() + " địa điểm");
        }else{
            holder.mTvCountShop.setText(shop.getAddress());
        }

        holder.mTvSaleOff.setText(shop.getSaleOf());
        holder.mTvPrice.setText("Giá " + shop.getPrice());
        holder.mTvPromotion.setText(shop.getPromotion());
    }

    @Override
    public int getItemCount() {
        return mShopList != null ? mShopList.size() : 0;
    }

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
