package id.developer.agungaprian.popularmovieapp.model;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by agungaprian on 18/11/17.
 */

public class MovieModel implements Parcelable {
    private String originalTitle;
    private String posterPath;
    private String overView;
    private Double voteAverage;
    private String releaseDate;
    private String backdropPath;
    private int id;

    public MovieModel() {
    }

    protected MovieModel(Parcel in) {
        originalTitle = in.readString();
        posterPath = in.readString();
        overView = in.readString();
        releaseDate = in.readString();
        backdropPath = in.readString();
        id = in.readInt();
        voteAverage = in.readDouble();
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(originalTitle);
        dest.writeString(posterPath);
        dest.writeString(overView);
        dest.writeString(releaseDate);
        dest.writeString(backdropPath);
        dest.writeInt(id);
        dest.writeDouble(voteAverage);
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public static final Creator<MovieModel> CREATOR = new Creator<MovieModel>() {
        @Override
        public MovieModel createFromParcel(Parcel in) {
            return new MovieModel(in);
        }

        @Override
        public MovieModel[] newArray(int size) {
            return new MovieModel[size];
        }
    };

    public String getOriginalTitle() {
        return originalTitle;
    }

    public void setOriginalTitle(String originalTitle) {
        this.originalTitle = originalTitle;
    }

    public String getPosterPath() {
        final String TMDB_POSTER_BASE_URL = "https://image.tmdb.org/t/p/w185";
        return TMDB_POSTER_BASE_URL + posterPath;
    }

    public void setPosterPath(String posterPath) {
        this.posterPath = posterPath;
    }

    public String getOverView() {
        return overView;
    }

    public void setOverView(String overView) {
        this.overView = overView;
    }

    public Double getVoteAverage() {
        return voteAverage;
    }

    public void setVoteAverage(Double voteAverage) {
        this.voteAverage = voteAverage;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    public String getBackdropPath() {
        final String TMDB_BACKDROP_BASE_URL = "https://image.tmdb.org/t/p/w500";
        return TMDB_BACKDROP_BASE_URL + backdropPath;
    }

    public void setBackdropPath(String backdropPath) {
        this.backdropPath = backdropPath;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public static Creator<MovieModel> getCREATOR() {
        return CREATOR;
    }
}
