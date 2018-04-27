package com.example.punked.tourguideapp;

import android.support.v4.app.FragmentActivity;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {
    private PublicPlace selectedPublicPlace;
    private GoogleMap mMap;
    private double[] coordinates;
    private String intentDataString = "selectedPublicPlace";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        selectedPublicPlace = (PublicPlace) getIntent().getSerializableExtra(intentDataString);
        coordinates = selectedPublicPlace.getCoordinates();
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;
        LatLng position = new LatLng(coordinates[0], coordinates[1]);
        mMap.addMarker(new MarkerOptions().position(position).title(selectedPublicPlace.getName()));
        mMap.moveCamera(CameraUpdateFactory.zoomTo(15f));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(position));
    }
}
