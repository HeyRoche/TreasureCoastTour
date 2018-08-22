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
public class ExploreFragment extends Fragment {


    public ExploreFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        final View rootView = inflater.inflate(R.layout.tour_list, container, false);

        final ArrayList<Tour> tours = new ArrayList<>();
        tours.add(new Tour(getString(R.string.horseback), getString(R.string.horseback_online), R.drawable.horseback));
        tours.add(new Tour(getString(R.string.navy_museum), getString(R.string.navy_museum_online), R.drawable.navy));
        tours.add(new Tour(getString(R.string.sun_the), getString(R.string.sun_online), R.drawable.sunrise_theatre));
        tours.add(new Tour(getString(R.string.bo_garden), getString(R.string.bo_garden_online), R.drawable.mckee));
        tours.add(new Tour(getString(R.string.child_museum), getString(R.string.child_museum_online), R.drawable.kidmusuem));
        tours.add(new Tour(getString(R.string.save_chimp), getString(R.string.chimp_online), R.drawable.chimp));

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