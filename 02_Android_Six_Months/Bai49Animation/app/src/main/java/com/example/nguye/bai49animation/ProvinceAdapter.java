package com.example.nguye.bai49animation;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by nguye on 23-Nov-17.
 */

public class ProvinceAdapter extends ArrayAdapter {
    Context context;
    int resource;
    List<String> objects;
    public ProvinceAdapter(@NonNull Context context, int resource, @NonNull List<String> objects) {
        super(context, resource, objects);
        this.context = context;
        this.resource = resource;
        this.objects = objects;

    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = ((Activity) context).getLayoutInflater();
        View row = inflater.inflate(R.layout.item, null);
        TextView textView = row.findViewById(R.id.textView);
        textView.setText(this.objects.get(position));
        Animation animation = AnimationUtils.loadAnimation(this.context, R.anim.hieuunglistview);
        row.startAnimation(animation);
        return row;
    }
}
