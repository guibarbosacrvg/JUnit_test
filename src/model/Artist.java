package model;
import java.util.ArrayList;
import java.util.Date;

public class Artist {
    String artisticName;
    String realName;
    Date dateOfBorn;
    int numMusics;
    int numAlbums;
    ArrayList<Album> albums;


    public boolean addAlbum(Album album){
        albums.add(album);
        return true;
    }
    public ArrayList<Album> getAlbums() {
        return albums;
    }

    public void setAlbums(ArrayList<Album> albums) {
        this.albums = albums;
    }

    public Artist(String artisticName, String realName, Date dateOfBorn, int numMusics, int numAlbums) {
        this.artisticName = artisticName;
        this.realName = realName;
        this.dateOfBorn = dateOfBorn;
        this.numMusics = numMusics;
        this.numAlbums = numAlbums;
    }

    public String getArtisticName() {
        return artisticName;
    }

    public void setArtisticName(String artisticName) {
        this.artisticName = artisticName;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public Date getDateOfBorn() {
        return dateOfBorn;
    }

    public void setDateOfBorn(Date dateOfBorn) {
        this.dateOfBorn = dateOfBorn;
    }

    public int getNumMusics() {
        return numMusics;
    }

    public void setNumMusics(int numMusics) {
        this.numMusics = numMusics;
    }

    public int getNumAlbums() {
        return numAlbums;
    }

    public void setNumAlbums(int numAlbums) {
        this.numAlbums = numAlbums;
    }
}
