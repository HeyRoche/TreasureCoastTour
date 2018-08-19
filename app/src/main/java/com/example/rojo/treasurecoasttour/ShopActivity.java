package com.example.rojo.treasurecoasttour;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class ShopActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tour_list);

        ArrayList<Tour> tours = new ArrayList<Tour>();
        tours.add(new Tour("Treasure Coast Sqaure", R.drawable.sadmike));
        tours.add(new Tour("Beach Shops", R.drawable.sadmike));
        tours.add(new Tour("Vero Beach Outlet Mall", R.drawable.sadmike));
        tours.add(new Tour("Under the Oaks", R.drawable.sadmike));
        tours.add(new Tour("Farmers Market", R.drawable.sadmike));


        TourAdapter adapter = new TourAdapter(this, tours);
        final ListView listView = findViewById(R.id.list);
        listView.setAdapter(adapter);
    }
}
