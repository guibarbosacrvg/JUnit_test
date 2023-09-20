package model;

import java.util.ArrayList;

public class Playlist {
    public String name;
    ArrayList<Music> songs;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Music> getSongs() {
        return songs;
    }

    public void setSongs(ArrayList<Music> songs) {
        this.songs = songs;
    }

    public Playlist(String name){
        this.name = name;
    }
    public boolean addMusic(Music music){
        this.songs.add(music);
        return false;
    }
}
