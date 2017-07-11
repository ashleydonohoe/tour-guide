package com.adonohoe.tourguide;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class EntertainmentActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.location_list);

        // Create list of entertainment places
        ArrayList<Location> entertainmentVenues = new ArrayList<Location>();
        entertainmentVenues.add(new Location(R.string.scene75_name, R.string.scene75_address, R.string.scene_75_phone, R.string.scene_75_desc, R.drawable.scene_75));
        entertainmentVenues.add(new Location(R.string.cinema_name, R.string.cinema_address, R.string.cinema_phone, R.string.cinema_desc, R.drawable.rave_motion_pictures));
        entertainmentVenues.add(new Location(R.string.library_name, R.string.library_address, R.string.library_phone, R.string.library_desc, R.drawable.library));

        LocationAdapter adapter = new LocationAdapter(this, entertainmentVenues);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
    }
}
