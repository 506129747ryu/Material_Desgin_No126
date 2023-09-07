package com.tutorial.realestate.Activity;

import android.content.ClipData;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.tutorial.realestate.Adapter.ItemsAdapter;
import com.tutorial.realestate.Domain.ItemsDomain;
import com.tutorial.realestate.R;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView.Adapter adapterPopular, adapterNew;
    private RecyclerView recyclerViewPopular, recyclerViewNew;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initRecyclerView();
    }

    private void initRecyclerView() {
        ArrayList<ItemsDomain> ItemsArraylist = new ArrayList<>();

        String str = "This 2 bed/ 1bath home boasts an enormous, \nopen-living plan, accented by striking \narchitectural features an high-end finishes. \nFeel inspired by open sight lines that \nembrace the outdoors, crowned by stunning\ncoffered ceilings.";
        ItemsArraylist.add(new ItemsDomain("House with a great view", "San Francisco, CA 94110", str, 2, 1, 841456, "pic1", true));
        ItemsArraylist.add(new ItemsDomain("House with a great view", "San Francisco, CA 94110", str, 3, 1, 65490, "pic2", true));
        ItemsArraylist.add(new ItemsDomain("House with a great view", "San Francisco, CA 94110", str, 3, 1, 841456, "pic3", true));

        recyclerViewPopular = findViewById(R.id.viewPopular);
        recyclerViewNew = findViewById(R.id.viewNew);

        recyclerViewPopular.setLayoutManager(new LinearLayoutManager(
                this,
                LinearLayoutManager.HORIZONTAL,
                false
        ));

        recyclerViewNew.setLayoutManager(new LinearLayoutManager(
                this,
                LinearLayoutManager.HORIZONTAL,
                false
        ));

        adapterNew = new ItemsAdapter(ItemsArraylist);
        adapterPopular = new ItemsAdapter(ItemsArraylist);

        recyclerViewNew.setAdapter(adapterNew);
        recyclerViewNew.setAdapter(adapterPopular);

    }
}
