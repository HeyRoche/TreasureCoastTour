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
public class ShopFragment extends Fragment {


    public ShopFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        final View rootView = inflater.inflate(R.layout.tour_list, container, false);

        final ArrayList<Tour> tours = new ArrayList<>();
        tours.add(new Tour(getString(R.string.treasure_square), getString(R.string.treasure_square_online),
                R.drawable.treasurecoastsquare));
        tours.add(new Tour(getString(R.string.beach_shops),getString(R.string.beach_shops_online), R.drawable.beach));
        tours.add(new Tour(getString(R.string.outlet_mall),  getString(R.string.outlet_mall_onlne), R.drawable.outlet_mall));
        tours.add(new Tour(getString(R.string.under_oaks), getString(R.string.under_oaks_online), R.drawable.under_oaks));
        tours.add(new Tour(getString(R.string.f_market),getString(R.string.f_market_online), R.drawable.farmers));

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