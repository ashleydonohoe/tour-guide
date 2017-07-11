package com.adonohoe.tourguide;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class RestaurantsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.location_list);

        // Create list of restaurants
        ArrayList<Location> restaurants = new ArrayList<Location>();
        restaurants.add(new Location(R.string.red_robin_name, R.string.red_robin_address, R.string.red_robin_phone, R.string.red_robin_desc));
        restaurants.add(new Location(R.string.texas_roadhouse_name, R.string.texas_roadhouse_address, R.string.texas_roadhouse_phone, R.string.texas_roadhouse_desc));
        restaurants.add(new Location(R.string.gold_star_name, R.string.gold_star_address, R.string.gold_star_phone, R.string.gold_star_desc));

        LocationAdapter adapter = new LocationAdapter(this, restaurants);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
    }
}
