package com.example.punked.tourguideapp;


import android.content.Context;

import java.util.ArrayList;

/**
 * Created by Punked on 4/22/2018.
 */

public class PublicPlacesDB {
    private static ArrayList<PublicPlace> hotels = new ArrayList<PublicPlace>();
    private static ArrayList<PublicPlace> parksAndGardens = new ArrayList<PublicPlace>();
    private static ArrayList<PublicPlace> attractions = new ArrayList<PublicPlace>();
    private static PublicPlacesDB single_instance = null;
    private Context context;

    private PublicPlacesDB(Context mContext) {
        this.context = mContext;
        hotels.add(new PublicPlace(context.getString(R.string.international_hotel),
                context.getString(R.string.international_short),
                context.getString(R.string.internaitonal_stars),
                context.getString(R.string.international_description),
                R.drawable.international,28.0406067 ,43.2836842, context.getString(R.string.international_phone), context.getString(R.string.international_email) ));
        hotels.add(new PublicPlace(context.getString(R.string.golden_name),
                context.getString(R.string.golden_short),
                context.getString(R.string.golden_stars),
                context.getString(R.string.golden_description),
                R.drawable.golden_tulip, 27.9030543, 43.20384, context.getString(R.string.golden_phone), context.getString(R.string.golden_email)));
        hotels.add(new PublicPlace(context.getString(R.string.divesta_name),
                context.getString(R.string.divesta_short),
                context.getString(R.string.divesta_stars),
                context.getString(R.string.divesta_description),
                R.drawable.divesta,27.9057793,43.2056082, context.getString(R.string.divesta_phone), context.getString(R.string.divesta_email)));
        hotels.add(new PublicPlace(context.getString(R.string.atlant_name),
                context.getString(R.string.atlant_short),
                context.getString(R.string.atlant_starts),
                context.getString(R.string.atlant_description),
                R.drawable.atlant, 28.0029416, 43.2256311, context.getString(R.string.atlant_phone), context.getString(R.string.atlant_email)));
        hotels.add(new PublicPlace(context.getString(R.string.panorama_name),
                context.getString(R.string.panorama_short),
                context.getString(R.string.panorama_stars),
                context.getString(R.string.panorama_description),
                R.drawable.panorama_hotel,27.9209477,43.1985262, context.getString(R.string.panorama_phone), context.getString(R.string.panorama_email)));

        attractions.add(new PublicPlace(context.getString(R.string.stone_forest_name),
                context.getString(R.string.stone_forest_short),
                context.getString(R.string.stone_forest_extra),
                context.getString(R.string.stone_forest_description),
                R.drawable.stone_forest,27.7042372,43.225921, null,null));
        attractions.add(new PublicPlace(context.getString(R.string.dolphinarium_name),
                context.getString(R.string.dolphinarium_short),
                context.getString(R.string.dolphinarium_extra),
                context.getString(R.string.dolphinarium_description),
                R.drawable.dolphinarium,27.9412794,43.2126672, null,null));
        attractions.add(new PublicPlace(context.getString(R.string.aquarium_name),
                context.getString(R.string.aquarium_short),
                context.getString(R.string.aquarium_extra),
                context.getString(R.string.aquarium_description),
                R.drawable.aquarium, 27.9200671, 43.2013581, null,null));
        attractions.add(new PublicPlace(context.getString(R.string.observatory_name),
                context.getString(R.string.observatory_short),
                context.getString(R.string.observatory_extra),
                context.getString(R.string.observatory_description),
                R.drawable.observatory,27.9225844,43.2022458, null,null));
        attractions.add(new PublicPlace(context.getString(R.string.cathedral_name),
                context.getString(R.string.cathedral_short),
                context.getString(R.string.cathedral_extra),
                context.getString(R.string.cathedral_description),
                R.drawable.cathedral,27.9099724,43.2050934, null,null));
        parksAndGardens.add(new PublicPlace(context.getString(R.string.sea_garden_name),
                context.getString(R.string.sea_garden_short),
                context.getString(R.string.sea_garden_extra),
                context.getString(R.string.sea_garden_description),
                R.drawable.sea_garden,27.9313235,43.207874, null,null));
        parksAndGardens.add(new PublicPlace(context.getString(R.string.asparuhovo_name),
                context.getString(R.string.asparuhovo_short),
                context.getString(R.string.asparuhovo_extra),
                context.getString(R.string.asparuhovo_description),
                R.drawable.park_asparuhovo,27.9057519,43.1808088, null,null));
        parksAndGardens.add(new PublicPlace(context.getString(R.string.zlatni_name),
                context.getString(R.string.zlatni_short),
                context.getString(R.string.zlatni_extra),
                context.getString(R.string.zlatni_description),
                R.drawable.nature_park,28.0285498,43.2879042, null,null));
        parksAndGardens.add(new PublicPlace(context.getString(R.string.botanical_name),
                context.getString(R.string.botanical_short),
                context.getString(R.string.botanical_extra),
                context.getString(R.string.botanical_description),
                R.drawable.garden,28.0030376,43.2339833, null,null));

    }

    public static ArrayList<PublicPlace> getHotels() {
        return hotels;
    }
    public static ArrayList<PublicPlace> getAttractions() {
        return attractions;
    }
    public static ArrayList<PublicPlace> getParksAndGardens() {
        return parksAndGardens;
    }

    public static PublicPlacesDB getInstance(Context context)
    {
        if (single_instance == null) {
            single_instance = new PublicPlacesDB(context.getApplicationContext());
        }

        return single_instance;
    }


}
