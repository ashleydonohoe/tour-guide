package com.adonohoe.tourguide;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class ParksActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.location_list);

        // Create list of parks
        ArrayList<Location> parks = new ArrayList<Location>();
        parks.add(new Location(R.string.carriage_way_name, R.string.carriage_way_address, R.string.carriage_way_phone, R.string.carriage_way_desc));
        parks.add(new Location(R.string.finley_name, R.string.finley_address, R.string.finley_phone, R.string.finley_desc));
        parks.add(new Location(R.string.nature_center_name, R.string.nature_center_address, R.string.nature_center_phone, R.string.nature_center_desc, R.drawable.nature_center));
        parks.add(new Location(R.string.miami_meadows_name, R.string.miami_meadows_address, R.string.miami_meadows_phone, R.string.miami_meadows_desc));

        LocationAdapter adapter = new LocationAdapter(this, parks);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
    }
}
