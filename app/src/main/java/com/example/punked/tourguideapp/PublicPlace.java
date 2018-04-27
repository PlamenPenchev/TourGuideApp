package com.example.punked.tourguideapp;

import java.io.Serializable;

/**
 * Created by Punked on 4/22/2018.
 */

public class PublicPlace implements Serializable {
    private String name;
    private String shortInfo;
    private String extraInfo;
    private int imageID;
    private String description;
    private double longtitude;
    private double latitude;
    private String phone;
    private String email;

    public PublicPlace(String name, String shortInfo, String extraInfo, String description ) {
        this.name = name;
        this.shortInfo = shortInfo;
        this.extraInfo = extraInfo;
        this.description = description;
    }

    public PublicPlace(String name, String shortInfo, String extraInfo, String description, int imageID, double longtitude, double latitude, String phone, String email) {
        this.name = name;
        this.shortInfo = shortInfo;
        this.extraInfo = extraInfo;
        this.description = description;
        this.imageID = imageID;
        this.longtitude = longtitude;
        this.latitude = latitude;
        this.phone = phone;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getShortInfo() {
        return shortInfo;
    }

    public String getExtraInfo() {
        return  extraInfo;
    }

    public String getDescription() {
        return description;
    }

    public String getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }

    public int getImageID() {
        return imageID;
    }

    public double[] getCoordinates() {
        double[] coordinates = {latitude,longtitude};
        return  coordinates;
    }

}
