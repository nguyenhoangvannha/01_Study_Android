package com.example.nguye.bai32projectthucte;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by nguye on 18-Nov-17.
 */

public class SongsAdapter extends BaseAdapter {
    private Context context;
    private ArrayList<SongModel> songs;
    private SongModel song;
    public SongsAdapter(Context context, ArrayList<SongModel> songs) {
        this.context = context;
        this.songs = songs;
    }

    @Override
    public int getCount() {
        return songs.size();
    }

    @Override
    public Object getItem(int i) {
        return songs.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        View rowView = null;
        song = songs.get(i);
        if(view == null){
            LayoutInflater inflater = ((Activity) context).getLayoutInflater();
            rowView = inflater.inflate(R.layout.song_item, viewGroup, false);
            ViewHolder viewHolder = new ViewHolder();
            viewHolder.txtID = rowView.findViewById(R.id.txt_song_id);
            viewHolder.txtName = rowView.findViewById(R.id.txt_song_name);
            viewHolder.txtSinger = rowView.findViewById(R.id.txt_song_singer);
            viewHolder.btnLike = rowView.findViewById(R.id.btn_song_like);
            viewHolder.btnDislike = rowView.findViewById(R.id.btn_song_dislike);
            viewHolder.btnLike.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    onLike();
                }
            });
            viewHolder.btnDislike.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    onDisLike();
                }
            });
            rowView.setTag(viewHolder);

        } else {
            rowView = view;
        }
        ViewHolder holder = (ViewHolder) rowView.getTag();
        holder.txtID.setText(songs.get(i).getId());
        holder.txtName.setText(songs.get(i).getName());
        holder.txtSinger.setText(songs.get(i).getSinger());
        if(songs.get(i).isLike()){
            holder.btnLike.setVisibility(View.INVISIBLE);
            holder.btnDislike.setVisibility(View.VISIBLE);
        } else if (songs.get(i).isLike() == false){
            holder.btnLike.setVisibility(View.VISIBLE);
            holder.btnDislike.setVisibility(View.INVISIBLE);
        }
        return rowView;
    }

    private void onDisLike() {
        song.setLike(false);
    }

    private void onLike() {
        song.setLike(true);
    }

    class ViewHolder{
        TextView txtID;
        TextView txtName;
        TextView txtSinger;
        ImageButton btnLike;
        ImageButton btnDislike;
    }
}
