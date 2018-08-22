package com.example.rojo.treasurecoasttour;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class EatFragment extends Fragment {

    public EatFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.tour_list, container, false);

        final ArrayList<Tour> tours = new ArrayList<>();
        tours.add(new Tour(getString(R.string.seafood), getString(R.string.seafood_online), R.drawable.chucks));
        tours.add(new Tour(getString(R.string.lemon), getString(R.string.lemon_online), R.drawable.lemon));
        tours.add(new Tour(getString(R.string.river), getString(R.string.river_online), R.drawable.pietro_s));
        tours.add(new Tour(getString(R.string.steak), getString(R.string.braford_online), R.drawable.braford));
        tours.add(new Tour(getString(R.string.maple), getString(R.string.maple_online), R.drawable.maple));


        TourAdapter adapter = new TourAdapter(getActivity(), tours);
        final ListView listView = rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        //Gets position of URLs to display new content when clicked
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Tour tour = tours.get(position);
                String url = tour.getLinkURL();
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse((url)));
                startActivity(intent);
            }
        });

        return rootView;
    }
}