package com.example.punked.tourguideapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class PublicPlaceActivity extends AppCompatActivity {
    private PublicPlace selectedPublicPlace;
    private Button goToMapsButton;
    private TextView titleTextView;
    private TextView descriptionTextView;
    private TextView phone;
    private TextView email;
    private ImageView detailedImageView;
    private String intentDataString = "selectedPublicPlace";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_public_place);
        selectedPublicPlace = (PublicPlace) getIntent().getSerializableExtra(intentDataString);
        goToMapsButton = findViewById(R.id.detailed_activity_location_button);
        titleTextView = findViewById(R.id.detailed_activity_title);
        descriptionTextView = findViewById(R.id.detailed_activity_description);
        detailedImageView = findViewById(R.id.detailed_activity_image);
        titleTextView.setText(selectedPublicPlace.getName());
        descriptionTextView.setText(selectedPublicPlace.getDescription());
        detailedImageView.setImageResource(selectedPublicPlace.getImageID());
        phone = findViewById(R.id.phone);
        System.out.println(selectedPublicPlace.getPhone());
        if (selectedPublicPlace.getPhone() != null) {
            phone.setText(selectedPublicPlace.getPhone());
            phone.setVisibility(View.VISIBLE);
        }
        if (selectedPublicPlace.getEmail() != null) {
            email = findViewById(R.id.email);
            email.setText(selectedPublicPlace.getEmail());
            email.setVisibility(View.VISIBLE);
        }

        goToMapsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(PublicPlaceActivity.this, MapsActivity.class);
                intent.putExtra(intentDataString, selectedPublicPlace);
                startActivity(intent);
            }
        });
    }
}
