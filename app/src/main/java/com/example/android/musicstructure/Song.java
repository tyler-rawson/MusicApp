package com.example.android.musicstructure;

/**
 * {@link Song} represents a song consisting of both a song title and artist name.
 */
public class Song {
    /**
     * The song title will be saved as String mSongTitle.
     */
    private String mSongTitle;

    /**
     * The artists name will be saved as String mArtistName.
     */
    private String mArtistName;

    /**
     * A static int counter variable that gets incremented with each song addition.
     */
    private static int counter;

    /**
     * This string contains the formatted rank of the song. For example; "1. " for the top rated song in that category.
     */
    private String rankingMessage;

    /**
     * A single song is composed of both a song title and artist name.
     *
     * @param SongTitle  is the song title
     * @param ArtistName is the name of the artist
     */
    public Song(String SongTitle, String ArtistName) {
        this.mSongTitle = SongTitle;
        this.mArtistName = ArtistName;
        this.counter += 1; // increment static counter
        this.rankingMessage = counter + ". "; // build the string so words don't run together
    }

    /*Returns the song title*/
    public String getSongTitle() {
        return mSongTitle;
    }

    /*Returns the name of the artist*/
    public String getArtistName() {
        return mArtistName;
    }

    public int getRankingNumber() {
        return counter;
    }

    public String getRankingMessage() {
        return rankingMessage;
    }

    public void resetRankingNumber() {
        counter = 0;
    }
}
