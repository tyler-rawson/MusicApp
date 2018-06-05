package com.example.android.musicstructure;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.annotation.NonNull;
import android.support.v4.content.ContextCompat;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

public class SongAdapter extends RecyclerView.Adapter<SongAdapter.ViewHolder> {
    private Context context;
    private List<Song> songs;

    public SongAdapter(Context context, List<Song> songs) {
        this.context = context; // save these for later use
        this.songs = songs;
    }

    @NonNull
    @Override
    public SongAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        //onCreate will inflate views that can later be recycled by onBind
        return new ViewHolder(LayoutInflater.from(context).inflate(
                R.layout.list_item, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull final ViewHolder holder, final int position) {
        //onBind will utilize views that have already been created
        final Song currentSong = songs.get(position); // get the object at this position in the list
        final Drawable playButton = ContextCompat.getDrawable(context, R.drawable.baseline_play_arrow_black_18);
        assert playButton != null; // we do not want a null playButton
        playButton.setBounds(0, 0, 100, 100);
        holder.number.setCompoundDrawables(null, null, playButton, null); // sets the ranking of song
        holder.number.setText(currentSong.getRankingMessage());
        holder.songTitle.setText(currentSong.getSongTitle()); // sets the song title to textViewPrimary
        holder.artistName.setText(currentSong.getArtistName()); // sets the artist name to textViewSecondary
        currentSong.resetRankingNumber(); // reset the counter so it doesn't count up endlessly when switching between activities.
        holder.parentview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, currentSong.getSongTitle(), Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        if (songs == null) return 0; //if songs is null return zero
        else return this.songs.size(); // else return the size
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        // create variables
        private TextView number;
        private TextView songTitle;
        private TextView artistName;
        private View parentview;

        public ViewHolder(@NonNull View view) {
            // find the views and assign for later use
            super(view); // use constructor of super
            this.parentview = view; // store parentview for onClickListener
            this.number = view.findViewById(R.id.number);
            this.songTitle = view.findViewById(R.id.textViewPrimary);
            this.artistName = view.findViewById(R.id.textViewSecondary);
        }
    }

}

