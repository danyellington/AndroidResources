package com.epicodus.business;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import butterknife.BindView;
import butterknife.ButterKnife;

public class Gallery extends AppCompatActivity implements View.OnClickListener {
    @BindView(R.id.aboutButton)
    Button mAboutButton;



    private String[] cities = new String[]{"Portland", "New York", "Tokyo", "London", "Paris", "Berlin", "Dubai", "Rio", "Toronto", "Reykjavik", "Cairo", "Beijing", "Delhi"

    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gallery);
        ButterKnife.bind(this);
        mAboutButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Intent intent = new Intent(Gallery.this, About.class);
        startActivity(intent);
    }

}