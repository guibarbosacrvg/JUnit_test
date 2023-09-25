package model;

import java.util.ArrayList;
import java.util.Objects;

public class User {
    private String login;
    private String pswd;
    private ArrayList<Music> favourites;

    public User(String login, String pwsd){
        this.login = login;
        this.pswd = pwsd;
    }

    public boolean verifyLogin(String login, String pswd){
        return Objects.equals(login, this.login) && Objects.equals(pswd, this.pswd);
    }

    public boolean favouriteMusic(Music music){
        this.favourites.add(music);
        boolean result = UserDAO.save(this);
        if(result == false){
            this.favourites.remove(music);
        }
        return result;
    }

    public boolean listen(Music music){
        return false;
    }

    public boolean createPlaylist(String name){
        Playlist p = new Playlist(name);
        return true;
    }

}
