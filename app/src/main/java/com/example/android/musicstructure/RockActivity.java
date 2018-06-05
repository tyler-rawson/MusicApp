package com.example.android.musicstructure;

import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ListView;

import java.util.ArrayList;

public class RockActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);
        ListView listView = (ListView) findViewById(R.id.list);
        Toolbar titleBar = (Toolbar) findViewById(R.id.action_bar);
        if (titleBar != null)
            titleBar.setBackgroundColor(getResources().getColor(R.color.genre_rock));
        listView.setBackgroundColor(getResources().getColor(R.color.genre_rock_light));
        Window window = getWindow();
        window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
        window.setStatusBarColor(getResources().getColor(R.color.genre_rock_dark));
        ColorDrawable color = new ColorDrawable(this.getResources().getColor(R.color.genre_rock_dark));
        listView.setDivider(color);
        listView.setDividerHeight(1);
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
        listView.setAdapter(adapter);

    }
}
