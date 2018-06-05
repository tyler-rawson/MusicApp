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

public class RockActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);
        RecyclerView recyclerView = findViewById(R.id.list);
        Toolbar titleBar = findViewById(R.id.action_bar);
        if (titleBar != null)
            titleBar.setBackgroundColor(getResources().getColor(R.color.genre_rock));
        recyclerView.setBackgroundColor(getResources().getColor(R.color.genre_rock_light));
        Window window = getWindow();
        window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
        window.setStatusBarColor(getResources().getColor(R.color.genre_rock_dark));
        ArrayList<Song> track = new ArrayList<Song>();
        track.add(new Song("Wait", "Maroon 5"));
        track.add(new Song("What Lovers Do (feat. SZA)", "Maroon 5"));
        track.add(new Song("Zombie", "Bad Wolves"));
        track.add(new Song("Bohemian Rhapsody", "Queen"));
        track.add(new Song("Africa", "Toto"));
        track.add(new Song("Shut Up and Dance", "WALK THE MOON"));
        track.add(new Song("Counting Stars", "OneRepublic"));
        track.add(new Song("Don't Wanna Know (feat. Kendrick Lamar)", "Maroon 5"));
        track.add(new Song("Don't Stop Believin'", "Journey"));
        track.add(new Song("Mr. Brightside", "The Killers"));
        SongAdapter adapter = new SongAdapter(this, track);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.addItemDecoration(new DividerItemDecoration(this, DividerItemDecoration.VERTICAL));
    }
}
