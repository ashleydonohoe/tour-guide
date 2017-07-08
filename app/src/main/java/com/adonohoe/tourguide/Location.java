package com.adonohoe.tourguide;

/**
 * Created by ashleydonohoe on 7/7/17.
 */

public class Location {
    private String mLocationName;
    private String mLocationAddress;

    public Location(String locationName, String locationAddress) {
        mLocationName = locationName;
        mLocationAddress = locationAddress;
    }

    public String getLocationName() {
        return mLocationName;
    }

    public String getLocationAddress() {
        return mLocationAddress;
    }
}
