package com.example.android.bai098viewpaper;

import android.app.Activity;
import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

/**
 * Created by nhvn on 11/7/17.
 */

public class ViewPaperAdapter extends PagerAdapter {
    private Context context;
    private int[] arrImage;
    public ViewPaperAdapter(Context context, int[] arrImage){
        this.context = context;
        this.arrImage = arrImage;
    }

    @Override
    public int getCount() {
        return arrImage.length;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == object;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView((View) object);
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        LayoutInflater inflater = LayoutInflater.from(this.context);
        View view = inflater.inflate(R.layout.viewpaper_item, container, false);
        ImageView imageView = view.findViewById(R.id.imgView);
        imageView.setImageResource(arrImage[position]);
        container.addView(view);
        return view;
    }
}
