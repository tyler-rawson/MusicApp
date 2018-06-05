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

public class AlternativeIndieActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);
        RecyclerView recyclerView = findViewById(R.id.list); // define variables for use later
        Toolbar titleBar = findViewById(R.id.action_bar);
        if (titleBar != null)
            titleBar.setBackgroundColor(getResources().getColor(R.color.genre_alternative_indie)); // change titleBar color to make app look better
        recyclerView.setBackgroundColor(getResources().getColor(R.color.genre_alternative_indie_light)); // slightly tint background color to make app look better
        Window window = getWindow();
        window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
        window.setStatusBarColor(getResources().getColor(R.color.genre_alternative_indie_dark)); // change statusBar color to make app look better
        ArrayList<Song> track = new ArrayList<Song>(); // create an array list of songs
        track.add(new Song("Whatever It Takes", "Imagine Dragons")); // add to the arraylist called track that accepts the element songs.
        track.add(new Song("Thunder", "Imagine Dragons"));
        track.add(new Song("Africa", "Weezer"));
        track.add(new Song("High Hopes", "Panic! At The Disco"));
        track.add(new Song("Believer", "Imagine Dragons"));
        track.add(new Song("Delicate", "Taylor Swift"));
        track.add(new Song("Bad At Love", "Halsey"));
        track.add(new Song("Feel It Still", "Portugal. The Man"));
        track.add(new Song("Alone (feat. Big Sean & Stefflon Don)", "Halsey"));
        track.add(new Song("Humility (feat. George Benson", "Gorillaz"));
        SongAdapter adapter = new SongAdapter(this, track); // create a SongAdapter called adapter
        recyclerView.setAdapter(adapter); // set the adapter on the recyclerView
        recyclerView.setLayoutManager(new LinearLayoutManager(this)); // set the layout manager
        recyclerView.addItemDecoration(new DividerItemDecoration(this, DividerItemDecoration.VERTICAL));
    }
}
