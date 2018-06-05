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

public class CountryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);
        RecyclerView recyclerView = findViewById(R.id.list);
        Toolbar titleBar = findViewById(R.id.action_bar);
        if (titleBar != null)
            titleBar.setBackgroundColor(getResources().getColor(R.color.genre_country));
        recyclerView.setBackgroundColor(getResources().getColor(R.color.genre_country_light));
        Window window = getWindow();
        window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
        window.setStatusBarColor(getResources().getColor(R.color.genre_country_dark));
        ArrayList<Song> track = new ArrayList<Song>();
        track.add(new Song("You Make It Easy", "Jason Aldean"));
        track.add(new Song("Body Like A Back Road", "Sam Hunt"));
        track.add(new Song("Tequila", "Dan + Shay"));
        track.add(new Song("Up Down (feat. Florida Georgia Line)", "Morgan Wallen"));
        track.add(new Song("Get Along", "Kenny Chesney"));
        track.add(new Song("One Number Away", "Luke Combs"));
        track.add(new Song("In Case You Didn't Know", "Brett Young"));
        track.add(new Song("What Ifs (feat Lauren Alaina)", "Kane Brown"));
        track.add(new Song("When It Rains It Pours", "Luke Combs"));
        track.add(new Song("Everything's Gonna Be Alright", "David Lee Murphy"));
        SongAdapter adapter = new SongAdapter(this, track);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.addItemDecoration(new DividerItemDecoration(this, DividerItemDecoration.VERTICAL));
    }
}
