package com.example.fishservicesystem;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView mRecyclerView;
    List<FoodData> myFoodList;
    FoodData mFoodData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mRecyclerView=(RecyclerView) findViewById(R.id.recyclerView);

        GridLayoutManager gridLayoutManager=new GridLayoutManager(MainActivity.this,1);
        mRecyclerView.setLayoutManager(gridLayoutManager);
       myFoodList =new ArrayList<>();


       mFoodData =new FoodData("ROHU","FRESH WATER FISH","Rs.850",R.drawable.fish1);
        myFoodList.add(mFoodData);
       mFoodData =new FoodData("CALABASH","RIVER FISH","Rs.1050",R.drawable.f2);
        myFoodList.add(mFoodData);
       mFoodData =new FoodData("ROCKFISH","MARINE WATER FISH","Rs.50",R.drawable.f3);
        myFoodList.add(mFoodData);
       mFoodData =new FoodData("TARPON","SEA WATER FISH","Rs.950",R.drawable.f4);
        myFoodList.add(mFoodData);

       MyAdapter myAdapter=new MyAdapter(MainActivity.this,myFoodList);
       mRecyclerView.setAdapter(myAdapter);
    }

}