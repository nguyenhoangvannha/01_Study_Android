package com.example.nguye.bai32projectthucte;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.TabHost;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ListView lvSongs;
    private ArrayList<SongModel> songs;
    private SongsAdapter songsAdapter;
    private ListView lvSongsLiked;
    private ArrayList<SongModel> songsLiked;
    private SongsAdapter songsLikedAdapter;

    TabHost tabHost;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initComponents();
        addEvents();
    }

    private void addEvents() {
        tabHost.setOnTabChangedListener(new TabHost.OnTabChangeListener() {
            @Override
            public void onTabChanged(String s) {
                if(s.equalsIgnoreCase("t1")){
                    onTab1Listener();
                }
                if(s.equalsIgnoreCase("t2")){
                    onTab2Listener();
                }
            }
        });
    }

    private void onTab2Listener() {
        songsLiked.clear();
        for(SongModel song: songs){
            if(song.isLike()){
                songsLiked.add(song);
            }
        }
        songsLikedAdapter.notifyDataSetChanged();
    }

    private void onTab1Listener() {

    }

    private void initComponents() {

        tabHost = findViewById(R.id.tabhost);
        tabHost.setup();

        TabHost.TabSpec tab1 = tabHost.newTabSpec("t1");
        tab1.setContent(R.id.tab1);
        tab1.setIndicator("", getResources().getDrawable(R.drawable.music));
        tabHost.addTab(tab1);

        TabHost.TabSpec tab2 = tabHost.newTabSpec("t2");
        tab2.setContent(R.id.tab2);
        tab2.setIndicator("", getResources().getDrawable(R.drawable.love));
        tabHost.addTab(tab2);

        lvSongs = findViewById(R.id.lv_songs);
        songs = new ArrayList<SongModel>();
        songsAdapter = new SongsAdapter(this, songs);
        lvSongs.setAdapter(songsAdapter);

        lvSongsLiked = findViewById(R.id.lv_songs_liked);
        songsLiked = new ArrayList<SongModel>();
        songsLikedAdapter = new SongsAdapter(this, songsLiked);
        lvSongsLiked.setAdapter(songsLikedAdapter);

        initDatas();

    }

    private void initDatas() {
        songs.add(new SongModel("00001","Xuân này con không về","Chế Linh", true));
        songs.add(new SongModel("00002","Lòng mẹ","Ngọc Sơn", false));
        songs.add(new SongModel("00003","Em của quá khứ","Bằng cường", false));
        songs.add(new SongModel("00004","Không phải dạng vừa đâu","Sơn Tùng MTP", false));
        songs.add(new SongModel("00005","Hoa cỏ mùa xuân","Mai Linh", true));
        songs.add(new SongModel("00006","Lòng mẹ","Ngọc Sơn", false));
        songs.add(new SongModel("00007","Em gái mưa","Lệ Quyên", false));
        songs.add(new SongModel("00008","Lá cờ","Tạ Quang Thắng", false));
        songsAdapter.notifyDataSetChanged();
    }

}
