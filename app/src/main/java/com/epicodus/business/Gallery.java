package com.epicodus.business;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;

import com.squareup.picasso.Picasso;

public class Gallery extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gallery);
    }

//    @Override public void getView(int position, View convertView, ViewGroup parent) {
//        SquaredImageView view = (SquaredImageView) convertView;
//        if (view == null) {
//            view = new SquaredImageView(context);
//        }
//        String url = getItem(position);
//
//        Picasso.get().load(url).into(view);
//    }
}
