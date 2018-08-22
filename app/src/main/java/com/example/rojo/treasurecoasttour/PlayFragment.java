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
public class PlayFragment extends Fragment {


    public PlayFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        final View rootView = inflater.inflate(R.layout.tour_list, container, false);

        final ArrayList<Tour> tours = new ArrayList<>();
        tours.add(new Tour(getString(R.string.park), getString(R.string.park_online), R.drawable.beach));
        tours.add(new Tour(getString(R.string.strike),getString(R.string.strike_zone_online),  R.drawable.bowl));
        tours.add(new Tour(getString(R.string.sailfish),getString(R.string.sailfish_online),  R.drawable.sailfish));
        tours.add(new Tour(getString(R.string.skydive),getString(R.string.sky_online),  R.drawable.sky));
        tours.add(new Tour(getString(R.string.airboat),getString(R.string.airboat_online), R.drawable.airboat));

        TourAdapter adapter = new TourAdapter(getActivity(), tours);
        final ListView listView = rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

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