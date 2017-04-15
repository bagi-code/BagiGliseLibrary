package com.bagicode.www.bagigliselibrary;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //you can read it guys :D
        //add then go code

        // insialisasi imageview
        ImageView imageView = (ImageView) findViewById(R.id.imageView);

//        Glide.with(this)
//                .load("http://i.imgur.com/DvpvklR.png")
//                .into(imageView);

        // will test url in browser
        // url work and go and imageView in xml layout

        // go run
        // i am sorry, i am forget permission internet
        // go add manifest
        // run again

        //change url maybe file so big and my internet so low

        String imgUrl = "http://api.androidhive.info/images/glide/medium/deadpool.jpg";

//        ImageView imageView = (ImageView) view.findViewById(R.id.thumbnail);

        Glide.with(this).load(imgUrl)
                .thumbnail(0.5f)
                .crossFade()
                .diskCacheStrategy(DiskCacheStrategy.ALL)
                .into(imageView);

        // my internet so bad guys :3
        // my opini glide better than picasso
        // load. . download.. cache etc
        // anf dont forget glide support gif and picasso no
        // ok guys, see you next time :D

        // read url
        // https://inthecheesefactory.com/blog/get-to-know-glide-recommended-by-google/en
        // http://www.androidhive.info/2016/04/android-glide-image-library-building-image-gallery-app/
    }
}
