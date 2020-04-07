package LinkedListChallenge;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Stream;

public class Album {
    private String name;
    private String artist;
    List<Song> songList = new ArrayList<Song>();

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.songList = new ArrayList<Song>();
    }

    public boolean addSong(String title, double duration) {
        if(findSong(title) == null) {
            this.songList.add(new Song(title, duration));
            return true;
        }
        return true;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    private Song findSong(String title) {
        for(Song checkedSong: this.songList) {
            if(checkedSong.getTitle().equals(title)) {
                return checkedSong;
            }
        }
        return null;
    }

    public boolean addToPlayList(int trackNumber, LinkedList<Song> playList) {
        int index = trackNumber - 1;
        if((index > 0) && (index <= this.songList.size())) {
           playList.add(this.songList.get(index));
           return true;
        }
        System.out.println("Thus album does not have a track " + trackNumber);
        return false;
    }
}
