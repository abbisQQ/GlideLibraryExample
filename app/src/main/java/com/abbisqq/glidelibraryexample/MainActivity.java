package com.abbisqq.glidelibraryexample;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class MainActivity extends AppCompatActivity {

    private ImageView im1,im2,im3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        im1 = (ImageView)findViewById(R.id.image_view_one);
        im2 = (ImageView)findViewById(R.id.image_view_two);
        im3 = (ImageView)findViewById(R.id.image_view_three);


        Glide.with(this).load("https://static.pexels.com/photos/2324/skyline-buildings-new-york-skyscrapers.jpg")
                .animate(R.anim.testing_again).into(im1);

        Glide.with(this).load("https://static.pexels.com/photos/141635/pexels-photo-141635.jpeg")
                .animate(R.anim.testing_animation).into(im2);


        Glide.with(this).load("https://static.pexels.com/photos/1828/city-cars-road-traffic.jpg")
                .animate(R.anim.testing_again).into(im3);

    }
}
