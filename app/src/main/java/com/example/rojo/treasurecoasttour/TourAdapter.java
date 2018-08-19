package com.example.rojo.treasurecoasttour;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class TourAdapter extends ArrayAdapter<Tour> {


    public TourAdapter(Activity context, ArrayList<Tour> tours) {
        super(context, 0, tours);
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        final Tour currentTour = getItem(position);

        TextView tourTextView = (TextView) listItemView.findViewById(R.id.tour_text_view);
        tourTextView.setText(currentTour.getTourHeadline());


        ImageView image = (ImageView) listItemView.findViewById(R.id.imageAll);
        image.setImageResource(currentTour.getImageResourceId());

        return listItemView;
    }
}