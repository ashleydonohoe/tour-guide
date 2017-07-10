package com.adonohoe.tourguide;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Setting listeners for the four tiles that go to the lists
        TextView restaurants = (TextView) findViewById(R.id.restaurants);
        restaurants.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent restaurantsIntent = new Intent(MainActivity.this, RestaurantsActivity.class);
                startActivity(restaurantsIntent);
            }
        });

        TextView entertainment = (TextView) findViewById(R.id.entertainment);
        entertainment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent entertainmentIntent = new Intent(MainActivity.this, EntertainmentActivity.class);
                startActivity(entertainmentIntent);
            }
        });

        TextView shopping = (TextView) findViewById(R.id.shopping);
        shopping.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent shoppingIntent = new Intent(MainActivity.this, ShoppingActivity.class);
                startActivity(shoppingIntent);
            }
        });

        TextView parks = (TextView) findViewById(R.id.parks);
        parks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent parksIntent = new Intent(MainActivity.this, ParksActivity.class);
                startActivity(parksIntent);
            }
        });
    }
}
