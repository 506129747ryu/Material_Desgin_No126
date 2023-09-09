package com.tutorial.realestate.Activity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;
import com.tutorial.realestate.Domain.ItemsDomain;
import com.tutorial.realestate.R;

public class DetailActivity extends AppCompatActivity {
    private TextView titleTxt, addressTxt, priceTxt, bedTxt, bathTxt,wifiTxt, descriptionTxt;
    private ItemsDomain item;
    private ImageView pic;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        initView();
        setVariable();
    }

    private void setVariable() {
        item = (ItemsDomain) getIntent().getSerializableExtra("object");

        titleTxt.setText(item.getTitle());
        addressTxt.setText(item.getAddress());
        priceTxt.setText("$"+item.getPrice());
        bedTxt.setText(item.getBed()+"Bed");
        bathTxt.setText(item.getBath()+"Bath");
        descriptionTxt.setText(item.getDescription());

        if(item.isWifi()){
            wifiTxt.setText("Wi-Fi");
        }else{
            wifiTxt.setText("No Wi-Fi");
        }

        int drawableResourceId = getResources().getIdentifier(item.getPic(), "drawable", getPackageName());

        Glide.with(this)
                .load(drawableResourceId)
                .into(pic);
    }


    private void initView() {
        titleTxt = findViewById(R.id.titleTxt);
        addressTxt = findViewById(R.id.addressTxt);
        priceTxt = findViewById(R.id.priceTxt);
        bedTxt = findViewById(R.id.bedTxt);
        bathTxt = findViewById(R.id.bathTxt);
        wifiTxt = findViewById(R.id.wifiTxt);
        descriptionTxt = findViewById(R.id.descriptionTxt);
        pic = findViewById(R.id.pic);
    }


}
