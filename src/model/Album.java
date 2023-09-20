package model;

public class Album {
    String title;
    int releaseYear;
    int numMusics;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public int getNumMusics() {
        return numMusics;
    }

    public void setNumMusics(int numMusics) {
        this.numMusics = numMusics;
    }

    public Album(String title, int releaseYear, int numMusics){
        this.title = title;
        this.releaseYear = releaseYear;
        this.numMusics = numMusics;
    }

    int getNumMusic(){
        return this.numMusics;
    }
}
