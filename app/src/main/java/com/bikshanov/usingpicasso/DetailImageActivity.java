package com.bikshanov.usingpicasso;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class DetailImageActivity extends AppCompatActivity {

    private ImageView detailImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_image);

        Intent intent = getIntent();

        int position = intent.getExtras().getInt("position");

        ImageAdapter imageAdapter = new ImageAdapter(this);

        detailImageView = (ImageView) findViewById(R.id.detail_imageView);

        Picasso.get()
                .load(imageAdapter.imageUrls[position]).
                placeholder(R.drawable.placeholder)
                .error(R.drawable.error)
                .fit()
                .centerInside()
                .into(detailImageView);

    }
}
