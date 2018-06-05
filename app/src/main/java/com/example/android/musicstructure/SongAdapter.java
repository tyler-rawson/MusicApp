package com.example.android.musicstructure;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class SongAdapter extends ArrayAdapter<Song> {
    public SongAdapter(Activity context, ArrayList<Song> songs) {
        super(context, 0, songs);

    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }
        // get the object at this position in the list
        Song currentSong = getItem(position);
        // create TextView variables, find the views, and assign them for later use
        TextView number = (TextView) listItemView.findViewById(R.id.number);
        TextView songTitle = (TextView) listItemView.findViewById(R.id.textViewPrimary);
        TextView artistName = (TextView) listItemView.findViewById(R.id.textViewSecondary);
        final Drawable playButton = ContextCompat.getDrawable(getContext(), R.drawable.baseline_play_arrow_black_18);
        playButton.setBounds(0, 0, 100, 100);
        number.setCompoundDrawables(null, null, playButton, null);
        // sets the ranking of song
        number.setText(currentSong.getRankingMessage());
        // sets the song title to textViewPrimary
        songTitle.setText(currentSong.getSongTitle());
        // sets the artist name to textViewSecondary
        artistName.setText(currentSong.getArtistName());
        // reset the counter so it doesn't count up endlessly when switching between activities.
        currentSong.resetRankingNumber();
        // return both textViews so it can be displayed as a single ListView item.
        return listItemView;
    }
}
