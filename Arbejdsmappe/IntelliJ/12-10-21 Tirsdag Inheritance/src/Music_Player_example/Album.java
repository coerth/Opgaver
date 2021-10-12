package Music_Player_example;

import java.util.ArrayList;

public class Album implements Playable {
    String albumTitle;
    ArrayList<Song> songArrayList = new ArrayList<Song>();

    public Album(String albumTitle) {
        this.albumTitle = albumTitle;
    }

    public String getAlbumTitle() {
        return albumTitle;
    }

    public ArrayList<Song> getSongArrayList() {
        return songArrayList;
    }

    public void addSong(Song songToAdd){
        songArrayList.add(songToAdd);
    }

    @Override
    public String toString() {
        return "Album{" +
                "albumTitle='" + albumTitle + '\'' +
                '}';
    }

    @Override
    public void play() {

    }

    @Override
    public void pause() {

    }
}
