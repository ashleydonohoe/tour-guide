package com.adonohoe.tourguide;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

// Code adapted from Miwok app
public class LocationAdapter extends ArrayAdapter<Location> {

    private static final String LOG_TAG = LocationAdapter.class.getSimpleName();

    // custom constructor
    public LocationAdapter(Activity context, ArrayList<Location> locations) {
        super(context, 0, locations);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.location_list_item, parent, false);

        }

        // Get the Location object located at this position in the list
        Location currentLocation = getItem(position);

        // Get ImageView and set the image if there is one for that Location
        ImageView locationImageView = (ImageView) listItemView.findViewById(R.id.location_image_view);
        if(currentLocation.hasImage()) {
            locationImageView.setImageResource(currentLocation.getImageResourceId());
        } else {
            locationImageView.setVisibility(View.GONE);
        }

        // Find the TextView with the id location_name_text_view and set text to be the location's name
        TextView locationNameTextView = (TextView) listItemView.findViewById(R.id.location_name_text_view);
        locationNameTextView.setText(currentLocation.getLocationName());

        // Find the TextView with the id location_address_text_view and set text to be the location's address
        TextView locationAddressTextView = (TextView) listItemView.findViewById(R.id.location_address_text_view);
        locationAddressTextView.setText(currentLocation.getLocationAddress());

        // Find the TextView with the id location_phone_number_text_view and set text to be the location's phone number
        TextView locationPhoneNumberTextView = (TextView) listItemView.findViewById(R.id.location_phone_number_text_view);
        locationPhoneNumberTextView.setText(currentLocation.getLocationPhoneNumber());

        // Find the TextView with the id location_description_text_view and set text to be the location's description
        TextView locationDescriptionTextView = (TextView) listItemView.findViewById(R.id.location_description_text_view);
        locationDescriptionTextView.setText(currentLocation.getLocationDescription());

        // Return the list item layout
        return listItemView;
    }

}
