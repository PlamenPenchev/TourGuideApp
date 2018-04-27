package com.example.punked.tourguideapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import java.util.ArrayList;

public class HotelsFragment extends Fragment {
    private ArrayList<PublicPlace> hotels;
    private PublicPlace selectedPublicPlace;
    private PublicPlacesDB instance;
    private String intentDataString = "selectedPublicPlace";

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        instance = PublicPlacesDB.getInstance(this.getContext());
        View rootView = inflater.inflate(R.layout.attractions_list, container,false);
        hotels = instance.getHotels();
        PublicPlaceListAdapter itemsAdapter = new PublicPlaceListAdapter(getActivity(), hotels, R.color.itemBG);
        final ListView listView = (ListView) rootView.findViewById(R.id.public_places_list);
        listView.setAdapter(itemsAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                selectedPublicPlace = (PublicPlace) adapterView.getItemAtPosition(i);
                Intent intent = new Intent(getActivity(), PublicPlaceActivity.class);
                intent.putExtra(intentDataString, selectedPublicPlace);
                startActivity(intent);
            }
        });

        return rootView;
    }
    @Override
    public void onStop() {
        super.onStop();

    }

}
