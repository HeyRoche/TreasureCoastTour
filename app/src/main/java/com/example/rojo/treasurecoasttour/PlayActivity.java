package com.example.rojo.treasurecoasttour;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class PlayActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tour_list);

        ArrayList<Tour> tours = new ArrayList<Tour>();
        tours.add(new Tour("Florida State Parks", R.drawable.sadmike));
        tours.add(new Tour("Strike Zone", R.drawable.sadmike));
        tours.add(new Tour("Sailfish Splash Waterpark", R.drawable.sadmike));
        tours.add(new Tour("SkyDive Sebastian", R.drawable.sadmike));
        tours.add(new Tour("Airboat Tours", R.drawable.sadmike));


        TourAdapter adapter = new TourAdapter(this, tours);
        final ListView listView = findViewById(R.id.list);
        listView.setAdapter(adapter);
    }
}
