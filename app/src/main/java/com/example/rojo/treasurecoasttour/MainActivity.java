package com.example.rojo.treasurecoasttour;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //CardView is selected once selected the matching fragment xml will be displayed
        CardView eatView = (CardView) findViewById(R.id.cardEat);
        eatView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent eatAct = new Intent(MainActivity.this, EatActivity.class);
                startActivity(eatAct);
            }
        });


        //CardView is selected once selected the matching fragment xml will be displayed
        CardView playView = (CardView) findViewById(R.id.cardPlay);
        playView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent playAct = new Intent(MainActivity.this, PlayActivity.class);
                startActivity(playAct);
            }
        });

        //CardView is selected once selected the matching fragment xml will be displayed
        CardView shopView = (CardView) findViewById(R.id.cardShop);
        shopView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent shopView = new Intent(MainActivity.this, ShopActivity.class);
                startActivity(shopView);
            }
        });

        //CardView is selected once selected the matching fragment xml will be displayed
        CardView exploreView = (CardView) findViewById(R.id.cardExplore);
        exploreView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent exploreAct = new Intent(MainActivity.this, ExploreActivity.class);
                startActivity(exploreAct);
            }
        });

   }
}
