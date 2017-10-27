package id.developer.agungaprian.recyclerviewlesson;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by agungaprian on 27/10/17.
 */

public class Movie{
    private String title, genre, year;

    public Movie(String title, String genre, String year) {
        this.title = title;
        this.genre = genre;
        this.year = year;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String name) {
        this.title = name;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
}
