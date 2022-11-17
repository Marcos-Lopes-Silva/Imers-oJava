package com.imersaojava.entities;

import com.imersaojava.tools.RatingEmoji;

public class Filme {

    private String title;
    private String rank;
    private String year;
    private String image;
    private String rating;

    public Filme(String title, String rank, String year, String image, String rating) {
        this.title = title;
        this.rank = rank;
        this.year = year;
        this.image = image;
        this.rating = rating;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getImage() {
        return this.image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getRating() {
        RatingEmoji emoji = new RatingEmoji();
        this.rating = emoji.getRating(this.rating);
        return this.rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

}
