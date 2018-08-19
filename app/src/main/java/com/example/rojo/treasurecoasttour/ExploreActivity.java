package com.example.rojo.treasurecoasttour;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class ExploreActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tour_list);

        ArrayList<Tour> tours = new ArrayList<Tour>();
        tours.add(new Tour("Tours on Horseback", R.drawable.sadmike));
        tours.add(new Tour("Navy Seal Museum", R.drawable.sadmike));
        tours.add(new Tour("Sunrise Theatre", R.drawable.sadmike));
        tours.add(new Tour("McKee Botanical Garden", R.drawable.sadmike));
        tours.add(new Tour("Children's Museum", R.drawable.sadmike));
        tours.add(new Tour("Save the Chimps", R.drawable.sadmike));



        TourAdapter adapter = new TourAdapter(this, tours);
        final ListView listView = findViewById(R.id.list);
        listView.setAdapter(adapter);



    }
}
