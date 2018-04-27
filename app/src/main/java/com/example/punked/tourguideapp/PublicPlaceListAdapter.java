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

public class PublicPlaceListAdapter extends ArrayAdapter {
    private int colorID;
    public PublicPlaceListAdapter(Activity context, ArrayList<PublicPlace> wordsArray, int colorID){
        super(context,0,wordsArray);
        this.colorID = colorID;
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent){
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }
        PublicPlace currentPublicPlace = (PublicPlace) getItem(position);
        TextView nameTextView = listItemView.findViewById(R.id.public_place_list_name);
        nameTextView.setText(currentPublicPlace.getName());
        TextView shortInfoTextView = listItemView.findViewById(R.id.public_place_list_short_info);
        shortInfoTextView.setText(currentPublicPlace.getShortInfo());
        TextView extraInfoTextView = listItemView.findViewById(R.id.public_place_list_extra_info);
        extraInfoTextView.setText(currentPublicPlace.getExtraInfo());
        ImageView image = listItemView.findViewById(R.id.public_place_list_image);
        image.setImageResource(currentPublicPlace.getImageID());
        View containerView = listItemView.findViewById(R.id.list_item);
        int color = ContextCompat.getColor(getContext(), colorID);
        containerView.setBackgroundColor(color);
        return listItemView;
    }
}
