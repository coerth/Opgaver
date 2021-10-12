package Music_Player_example;

public class Song implements Playable {
    String songTitle;

    public Song(String songTitle) {
        this.songTitle = songTitle;
    }

    @Override
    public String toString() {
        return "Song{" +
                "songTitle='" + songTitle + '\'' +
                '}';
    }

    @Override
    public void play() {

    }

    @Override
    public void pause() {

    }
}
