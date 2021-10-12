package Music_Player_example;

import java.util.ArrayList;

public class Artist implements Playable {
    private String artistName;
    private ArrayList<Album> albumArrayList = new ArrayList<Album>();

    public Artist(String artistName) {
        this.artistName = artistName;
    }

    public String getArtistName() {
        return artistName;
    }

    public ArrayList<Album> getAlbumArrayList() {
        return albumArrayList;
    }

    void addAlbum(Album albumToAdd){
        albumArrayList.add(albumToAdd);
    }

    @Override
    public String toString() {
        return "Artist{" +
                "artistName='" + artistName + '\'' +
                ", albumArrayList=" + albumArrayList +
                '}';
    }

    @Override
    public void play() {

    }

    @Override
    public void pause() {

    }
}
