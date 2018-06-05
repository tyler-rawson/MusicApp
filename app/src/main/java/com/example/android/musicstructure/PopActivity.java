package com.example.android.musicstructure;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.Window;
import android.view.WindowManager;

import java.util.ArrayList;

public class PopActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);
        RecyclerView recyclerView = findViewById(R.id.list);
        Toolbar titleBar = findViewById(R.id.action_bar);
        if (titleBar != null)
            titleBar.setBackgroundColor(getResources().getColor(R.color.genre_pop));
        recyclerView.setBackgroundColor(getResources().getColor(R.color.genre_pop_light));
        Window window = getWindow();
        window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
        window.setStatusBarColor(getResources().getColor(R.color.genre_pop_dark));
        ArrayList<Song> track = new ArrayList<Song>();
        track.add(new Song("Meant to Be (feat. Florida Georgia Line)", "Bebe Rexha"));
        track.add(new Song("No Tears Left To Cry", "Ariana Grande"));
        track.add(new Song("Mine", "Bazzi"));
        track.add(new Song("Havana (feat Young Thug)", "Camila Cabello"));
        track.add(new Song("In My Blood", "Shawn Mendes"));
        track.add(new Song("Perfect", "Ed Sheeran"));
        track.add(new Song("FAKE LOVE", "BTS"));
        track.add(new Song("New Rules", "Dua Lipa"));
        track.add(new Song("FRIENDS", "Anne-Marie"));
        track.add(new Song("IDGAF", "Dua Lipa"));
        SongAdapter adapter = new SongAdapter(this, track);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.addItemDecoration(new DividerItemDecoration(this, DividerItemDecoration.VERTICAL));
    }
}
