package com.adonohoe.tourguide;

public class Location {
    // private variables
    private String mLocationName;
    private String mLocationAddress;
    private String mLocationDescription;
    private String mLocationPhoneNumber;
    // used technique of checking if location has an image taken from Miwok app
    private int mImageResourceId = NO_IMAGE_PROVIDED;
    private static final int NO_IMAGE_PROVIDED = -1;

    // Constructor without image
    public Location(String locationName, String locationAddress, String locationDescription, String locationPhoneNumber) {
        mLocationName = locationName;
        mLocationAddress = locationAddress;
        mLocationDescription = locationDescription;
        mLocationPhoneNumber = locationPhoneNumber;
    }

    // Constructor with image
    public Location(String locationName, String locationAddress, String locationDescription, String locationPhoneNumber, int imgResourceId) {
        mLocationName = locationName;
        mLocationAddress = locationAddress;
        mLocationDescription = locationDescription;
        mLocationPhoneNumber = locationPhoneNumber;
        mImageResourceId = imgResourceId;
    }

    // Gets location name
    public String getLocationName() {
        return mLocationName;
    }

    // Gets location address
    public String getLocationAddress() {
        return mLocationAddress;
    }

    // Get location phone number
    public String getLocationPhoneNumber() {
        return mLocationPhoneNumber;
    }

    // Get location description
    public String getLocationDescription() {
        return mLocationDescription;
    }

    // Get image resource; adapted from Miwok app
    public int getmImageResourceId() {
        return mImageResourceId;
    }

    // Check if image exists for Location; adapted from Miwok app
    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }
}
