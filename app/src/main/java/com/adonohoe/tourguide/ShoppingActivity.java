package com.adonohoe.tourguide;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class ShoppingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.location_list);

        // Create list of stores
        ArrayList<Location> stores = new ArrayList<Location>();
        stores.add(new Location(R.string.meijer_name, R.string.meijer_address, R.string.meijer_phone, R.string.meijer_desc));
        stores.add(new Location(R.string.kohls_name, R.string.kohls_address, R.string.kohls_phone, R.string.kohls_desc));
        stores.add(new Location(R.string.target_name, R.string.target_address, R.string.target_phone, R.string.target_desc));

        LocationAdapter adapter = new LocationAdapter(this, stores);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
    }
}
