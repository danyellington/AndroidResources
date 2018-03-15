package com.epicodus.business;


import android.content.Context;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;

public class CityAdapter extends ArrayAdapter {
    private Context mContext;
    private String[] mCities;


    public CityAdapter(Context mContext, int resource, String[] mCities) {
        super(mContext, resource);
        this.mContext = mContext;
        this.mCities = mCities;
    }

        @Override
        public Object getItem (int position){
        String cities = mCities[position];

        return String.format("%s \nGet Weather in: %s", cities);
    }

        @Override
        public int getCount () {
        return mCities.length;
    }
    }
