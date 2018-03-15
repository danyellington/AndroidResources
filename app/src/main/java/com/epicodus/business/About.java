package com.epicodus.business;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class About extends AppCompatActivity {
    @BindView(R.id.webButton)
    Button mWebButton;
    @BindView(R.id.callButton)
    Button mCallButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
        ImageView Button = (ImageView) findViewById(R.id.webButton);
        Button.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("http://www.gmail.com"));
                startActivity(intent);
            }


        });

        Button = (ImageView) findViewById(R.id.callButton);
        Button.setOnClickListener(new View.OnClickListener() {

            public void onClick (View view){
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:0123456789"));
                startActivity(intent);
    }


    });
}
}