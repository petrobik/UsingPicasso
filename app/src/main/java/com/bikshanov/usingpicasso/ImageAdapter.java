package com.bikshanov.usingpicasso;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class ImageAdapter extends BaseAdapter {

    private Context context;

    public String[] imageUrls = {
            "https://cdn.gratisography.com/photos/437H.jpg",
            "https://cdn.gratisography.com/photos/438H.jpg",
            "https://cdn.gratisography.com/photos/439H.jpg",
            "https://cdn.gratisography.com/photos/440H.jpg",
            "https://cdn.gratisography.com/photos/441H.jpg",
            "https://cdn.gratisography.com/photos/442H.jpg",
            "https://cdn.gratisography.com/photos/443H.jpg",
            "https://cdn.gratisography.com/photos/444H.jpg",
            "https://cdn.gratisography.com/photos/445H.jpg",
            "https://cdn.gratisography.com/photos/446H.jpg"
    };

    public ImageAdapter(Context context) {
        this.context = context;

//        inflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return imageUrls.length;
    }

    @Override
    public Object getItem(int i) {
        return imageUrls[i];
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            LayoutInflater inflater = LayoutInflater.from(context);
            view = inflater.inflate(R.layout.gridview_item, viewGroup, false);
        }

        Picasso.get()
                .load(imageUrls[i]).
                placeholder(R.drawable.placeholder)
                .error(R.drawable.error)
                .fit()
                .centerCrop()
                .into((ImageView) view);

        return view;
    }
}
