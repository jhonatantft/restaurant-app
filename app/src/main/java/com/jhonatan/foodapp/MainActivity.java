package com.jhonatan.foodapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.jhonatan.foodapp.adapter.JapaneseFoodAdapter;
import com.jhonatan.foodapp.adapter.PopularFoodAdapter;
import com.jhonatan.foodapp.model.JapaneseFood;
import com.jhonatan.foodapp.model.PopularFood;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView popularRecycler, japaneseRecycler;
    PopularFoodAdapter popularFoodAdapter;
    JapaneseFoodAdapter japaneseFoodAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<PopularFood> popularFoodList = new ArrayList<>();
        popularFoodList.add(new PopularFood("Burger King", "$", R.drawable.popularfood1));
        popularFoodList.add(new PopularFood("Saizeriya", "$$", R.drawable.popularfood2));
        popularFoodList.add(new PopularFood("Montana", "$$", R.drawable.popularfood3));
        popularFoodList.add(new PopularFood("Spoleto", "$$", R.drawable.popularfood1));
        popularFoodList.add(new PopularFood("Starbucks", "$$$$", R.drawable.popularfood2));
        popularFoodList.add(new PopularFood("O-TAO", "$$$$$", R.drawable.popularfood3));
        setPopularRecycler(popularFoodList);

        List<JapaneseFood> japaneseFoodList = new ArrayList<>();
        japaneseFoodList.add(new JapaneseFood("O-TAO", "$$$", R.drawable.asiafood1, "4.5", "Restaurante japonês refinado e contemporâneo de iguarias gourmets"));
        japaneseFoodList.add(new JapaneseFood("Temakin", "$$$$$", R.drawable.asiafood2, "4.0", "Trabalhamos com um cardápio sempre atualizado para garantir que nossos clientes tenham muitas opções de pratos e peças"));
        setJapaneseRecycler(japaneseFoodList);

    }

    private void  setPopularRecycler(List<PopularFood> popularFoodList) {

        popularRecycler = findViewById(R.id.popular_recycler);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this, RecyclerView.HORIZONTAL, false);
        popularRecycler.setLayoutManager(layoutManager);
        popularFoodAdapter = new PopularFoodAdapter(this, popularFoodList);
        popularRecycler.setAdapter(popularFoodAdapter);

    }

    private void  setJapaneseRecycler(List<JapaneseFood> japaneseFoodList) {

        japaneseRecycler = findViewById(R.id.details_recycler);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this, RecyclerView.VERTICAL, false);
        japaneseRecycler.setLayoutManager(layoutManager);
        japaneseFoodAdapter = new JapaneseFoodAdapter(this, japaneseFoodList);
        japaneseRecycler.setAdapter(japaneseFoodAdapter);

    }
}