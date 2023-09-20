package model;

import java.util.ArrayList;
import java.util.Objects;

public class User {
    private String login;
    private String pswd;
    private ArrayList<Music> favourites;

    public boolean verifyLogin(String login, String pswd){
        return Objects.equals(login, this.login) && Objects.equals(pswd, this.pswd);
    }

    public boolean favouriteMusic(Music music){
        this.favourites.add(music);
        return true;
    }

    public boolean listen(Music music){
        return false;
    }

    public boolean createPlaylist(String name){
        Playlist p = new Playlist(name);
        return true;
    }

}
