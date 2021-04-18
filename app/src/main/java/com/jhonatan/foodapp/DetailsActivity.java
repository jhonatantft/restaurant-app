package com.jhonatan.foodapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.jhonatan.foodapp.adapter.DetailsFoodAdapter;
import com.jhonatan.foodapp.adapter.JapaneseFoodAdapter;
import com.jhonatan.foodapp.model.DetailsFood;
import com.jhonatan.foodapp.model.JapaneseFood;

import java.util.ArrayList;
import java.util.List;

public class DetailsActivity extends AppCompatActivity {

    RecyclerView detailsRecycler;
    DetailsFoodAdapter detailsFoodAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        String franchise;
        if (savedInstanceState == null) {
            Bundle extras = getIntent().getExtras();
            if(extras == null) {
                franchise = null;
            } else {
                franchise = extras.getString("franchise");
            }
        } else {
            franchise = (String) savedInstanceState.getSerializable("franchise");
        }

        String name;
        String address;
        String city;
        String name1;
        String address1;
        String city1;
        String name2;
        String address2;
        String city2;

        if (franchise.equals("Burger King")) {
            name = "Burger King";
            address = "Endereço Burger King 0";
            city = "Cidade 0";
            name1 = "Burger King 1";
            address1 = "Endereço Burger King 1";
            city1 = "Cidade 1";
            name2 = "Burger King 2";
            address2 = "Endereço Burger King 2";
            city2 = "Cidade 2";
        } else if (franchise.equals("Saizeriya")) {
            name = "Saizeriya";
            address = "Endereço Saizeriya 0";
            city = "Cidade 0";
            name1 = "Saizeriya 1";
            address1 = "Endereço Saizeriya 1";
            city1 = "Cidade 1";
            name2 = "Saizeriya 2";
            address2 = "Endereço Saizeriya 2";
            city2 = "Cidade 2";
        } else if (franchise.equals("Montana")) {
            name = "Montana";
            address = "Endereço Montana 0";
            city = "Cidade 0";
            name1 = "Montana 1";
            address1 = "Endereço Montana 1";
            city1 = "Cidade 1";
            name2 = "Montana 2";
            address2 = "Endereço Montana 2";
            city2 = "Cidade 2";
        } else if (franchise.equals("Spoleto")) {
            name = "Spoleto";
            address = "Endereço Spoleto 0";
            city = "Cidade 0";
            name1 = "Spoleto 1";
            address1 = "Endereço Spoleto 1";
            city1 = "Cidade 1";
            name2 = "Spoleto 2";
            address2 = "Endereço Spoleto 2";
            city2 = "Cidade 2";
        } else if (franchise.equals("Starbucks")) {
            name = "Starbucks";
            address = "Endereço Starbucks 0";
            city = "Cidade 0";
            name1 = "Starbucks 1";
            address1 = "Endereço Starbucks 1";
            city1 = "Cidade 1";
            name2 = "Starbucks 2";
            address2 = "Endereço Starbucks 2";
            city2 = "Cidade 2";
        } else if (franchise.equals("O-TAO")) {
            name = "O-TAO";
            address = "Endereço O-TAO 0";
            city = "Cidade 0";
            name1 = "O-TAO 1";
            address1 = "Endereço O-TAO 1";
            city1 = "Cidade 1";
            name2 = "O-TAO 2";
            address2 = "Endereço O-TAO 2";
            city2 = "Cidade 2";
        } else {
            name = "Temakin";
            address = "Córrego Grande";
            city = "Florianópolis";
            name1 = "Temakin 1";
            address1 = "Endereço 1";
            city1 = "Cidade 1";
            name2 = "Temakin 2";
            address2 = "Endereço 2";
            city2 = "Cidade 2";
        }

        List<DetailsFood> detailsFoodList = new ArrayList<>();
        detailsFoodList.add(new DetailsFood(name, address, R.drawable.asiafood1, "4.5", city));
        detailsFoodList.add(new DetailsFood(name1, address1, R.drawable.asiafood1, "4.5", city1));
        detailsFoodList.add(new DetailsFood(name2, address2, R.drawable.asiafood1, "4.5", city2));
        setDetailsRecycler(detailsFoodList);
    }

    private void  setDetailsRecycler(List<DetailsFood> detailsFoodList) {

        detailsRecycler = findViewById(R.id.details_recycler);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this, RecyclerView.VERTICAL, false);
        detailsRecycler.setLayoutManager(layoutManager);
        detailsFoodAdapter = new DetailsFoodAdapter(this, detailsFoodList);
        detailsRecycler.setAdapter(detailsFoodAdapter);

    }
}