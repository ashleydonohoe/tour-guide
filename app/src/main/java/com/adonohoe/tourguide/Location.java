package com.adonohoe.tourguide;

/**
 * Created by ashleydonohoe on 7/7/17.
 */

public class Location {
    // private variables
    private String mLocationName;
    private String mLocationAddress;
    private String mLocationPhoneNumber;

    // Constructor
    public Location(String locationName, String locationAddress, String locationPhoneNumber) {
        mLocationName = locationName;
        mLocationAddress = locationAddress;
        mLocationPhoneNumber = locationPhoneNumber;
    }

    // Gets location name
    public String getLocationName() {
        return mLocationName;
    }

    // Gets location address
    public String getLocationAddress() {
        return mLocationAddress;
    }
}
