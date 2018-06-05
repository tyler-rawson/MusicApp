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

public class DanceElectronicActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);
        RecyclerView recyclerView = findViewById(R.id.list);
        Toolbar titleBar = findViewById(R.id.action_bar);
        if (titleBar != null)
            titleBar.setBackgroundColor(getResources().getColor(R.color.genre_dance_electronic));
        recyclerView.setBackgroundColor(getResources().getColor(R.color.genre_dance_electronic_light));
        Window window = getWindow();
        window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
        window.setStatusBarColor(getResources().getColor(R.color.genre_alternative_indie_dark));
        ArrayList<Song> track = new ArrayList<Song>();
        track.add(new Song("The Middle", "Zedd"));
        track.add(new Song("One Kiss", "Calvin Harris & Dua Lipa"));
        track.add(new Song("FRIENDS", "Anne-Marie"));
        track.add(new Song("Silence (feat Khalid)", "Marshmello"));
        track.add(new Song("Solo (feat. Demi Lovato)", "Clean Bandit"));
        track.add(new Song("Something Just Like This", "The Chainsmokers"));
        track.add(new Song("Closer (feat. Halsey)", "The Chainsmokers"));
        track.add(new Song("Stay", "Zedd & Alessia Cara"));
        track.add(new Song("Don't Let Me down (feat. Daya)", "The Chainsmokers"));
        track.add(new Song("This Is What You Came For (feat. Rihanna)", "Calvin Harris"));
        SongAdapter adapter = new SongAdapter(this, track);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.addItemDecoration(new DividerItemDecoration(this, DividerItemDecoration.VERTICAL));
    }
}
