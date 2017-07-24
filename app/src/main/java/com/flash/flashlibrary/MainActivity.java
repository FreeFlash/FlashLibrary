package com.flash.flashlibrary;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.flash.flashimageloader.GlideImageLoader;
import com.flash.flashimageloader.ImageLoaderOptions;

public class MainActivity extends AppCompatActivity {

    private ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageView = (ImageView) findViewById(R.id.imageView);
        GlideImageLoader.loadImage(imageView,new ImageLoaderOptions.Builder().load("http://img30.360buyimg.com/popshop/jfs/t3115/220/6181687904/114918/9b009b3d/58a1772aN877f4444.jpg").placeHolder(R.mipmap.ic_launcher).errorHolder(R.mipmap.ic_launcher).build());
    }
}
