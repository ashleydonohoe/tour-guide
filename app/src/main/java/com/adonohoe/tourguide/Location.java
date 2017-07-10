package com.adonohoe.tourguide;

public class Location {
    // private variables
    private int mLocationName;
    private int mLocationAddress;
    private int mLocationDescription;
    private int mLocationPhoneNumber;
    // used technique of checking if location has an image taken from Miwok app
    private int mImageResourceId = NO_IMAGE_PROVIDED;
    private static final int NO_IMAGE_PROVIDED = -1;

    // Constructor without image
    public Location(int locationName, int locationAddress, int locationPhoneNumber, int locationDescription) {
        mLocationName = locationName;
        mLocationAddress = locationAddress;
        mLocationDescription = locationDescription;
        mLocationPhoneNumber = locationPhoneNumber;
    }

    // Constructor with image
    public Location(int locationName, int locationAddress, int locationPhoneNumber, int locationDescription, int imgResourceId) {
        mLocationName = locationName;
        mLocationAddress = locationAddress;
        mLocationDescription = locationDescription;
        mLocationPhoneNumber = locationPhoneNumber;
        mImageResourceId = imgResourceId;
    }

    // Gets location name
    public int getLocationName() {
        return mLocationName;
    }

    // Gets location address
    public int getLocationAddress() {
        return mLocationAddress;
    }

    // Get location phone number
    public int getLocationPhoneNumber() {
        return mLocationPhoneNumber;
    }

    // Get location description
    public int getLocationDescription() {
        return mLocationDescription;
    }

    // Get image resource; adapted from Miwok app
    public int getImageResourceId() {
        return mImageResourceId;
    }

    // Check if image exists for Location; adapted from Miwok app
    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }
}
