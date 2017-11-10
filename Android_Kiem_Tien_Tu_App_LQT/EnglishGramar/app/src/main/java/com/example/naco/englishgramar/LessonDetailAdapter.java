package com.example.naco.englishgramar;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;

import java.util.ArrayList;

/**
 * Created by nguye on 10-Nov-17.
 */

public class LessonDetailAdapter extends PagerAdapter {
    private Context context;
    private ArrayList<LessonModel> lessons;

    public LessonDetailAdapter(Context context, ArrayList<LessonModel> lessons) {
        this.context = context;
        this.lessons = lessons;
    }

    @Override
    public int getCount() {
        return lessons.size();
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == object;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView((View)object);
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        LayoutInflater inflater = LayoutInflater.from(this.context);
        View view = inflater.inflate(R.layout.lesson_detail_item, container, false);
        WebView webView = view.findViewById(R.id.web_view);
        String url = "file:///android_asset/" + lessons.get(position).getName() + ".html";
        url = url.replace(" ", "%20");
        webView.loadUrl(url);
        webView.getSettings().setBuiltInZoomControls(true);
        container.addView(view);
        return view;
    }
}
