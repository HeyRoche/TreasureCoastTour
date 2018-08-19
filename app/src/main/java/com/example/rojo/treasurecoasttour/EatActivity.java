package com.example.rojo.treasurecoasttour;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

public class EatActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tour_list);


        final ArrayList<Tour> tours = new ArrayList<Tour>();
        tours.add(new Tour("Chuck's Seafood", R.drawable.sadmike));
        tours.add(new Tour("Lemon Tree", R.drawable.sadmike));
        tours.add(new Tour("Pietro's on the River", R.drawable.sadmike));
        tours.add(new Tour("The Bradford Steakhouse", R.drawable.sadmike));
        tours.add(new Tour("11 Maple Street", R.drawable.sadmike));


        TourAdapter adapter = new TourAdapter(this, tours);
        final ListView listView = findViewById(R.id.list);
        listView.setAdapter(adapter);


        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Tour tour = tours.get(position);

                if (position == 0) {
                    Button buttonView = (Button) findViewById(R.id.learnBtn);
                    buttonView.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            String url = "www.tcpalm.com";

                            Intent intent = new Intent(Intent.ACTION_VIEW);
                            intent.setData(Uri.parse(url));
                            startActivity(intent);
                        }
                    });


                }
            }
        });
    }
}