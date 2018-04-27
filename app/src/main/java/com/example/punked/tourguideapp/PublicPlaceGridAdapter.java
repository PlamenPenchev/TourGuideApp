package com.example.punked.tourguideapp;

import android.app.Activity;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Punked on 4/22/2018.
 */

public class PublicPlaceGridAdapter extends ArrayAdapter {
    private int colorID;
    public PublicPlaceGridAdapter(Activity context, ArrayList<PublicPlace> wordsArray, int colorID){
        super(context,0,wordsArray);
        this.colorID = colorID;
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent){
        View gridItemView = convertView;
        if(gridItemView == null) {
            gridItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.grid_item, parent, false);
        }
        PublicPlace currentPublicPlace = (PublicPlace) getItem(position);
        TextView nameTextView = gridItemView.findViewById(R.id.grid_name);
        nameTextView.setText(currentPublicPlace.getName());
        TextView shortInfoTextView = gridItemView.findViewById(R.id.grid_short_info);
        shortInfoTextView.setText(currentPublicPlace.getShortInfo());
        TextView extraInfoTextView = gridItemView.findViewById(R.id.grid_extra_info);
        extraInfoTextView.setText(currentPublicPlace.getExtraInfo());
        ImageView image = gridItemView.findViewById(R.id.grid_item_image);
        image.setImageResource(currentPublicPlace.getImageID());
        View containerView = gridItemView.findViewById(R.id.grid_item);
        int color = ContextCompat.getColor(getContext(), colorID);
        containerView.setBackgroundColor(color);
        return gridItemView;
    }
}
