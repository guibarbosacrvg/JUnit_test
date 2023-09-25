package model;

public class Music {
    public String name;
    private int averageStars;
    private int userReview;
    private int numReviews;

    public Music(String name){
        this.name = name;
    }

    public int getNumReviews() {
        return numReviews;
    }

    public void setNumReviews(int numReviews) {
        this.numReviews = numReviews;
    }

    public int getAverageStars() {
        return averageStars;
    }

    public void setAverageStars(int averageStars) {
        this.averageStars = averageStars;
    }

    public int getUserReview() {
        return userReview;
    }

    public void setUserReview(int userReview) {
        this.userReview = userReview;
    }
}
