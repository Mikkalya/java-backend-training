package Movies;

import java.time.Duration;

public class Movie {
    String movieName;
    String producedBy;
    String directedBy;
    Duration duration;
    int year;
    String category;
    static int moviesCount;
    String movieId="";
    Movie(String movieName,String producedBy,String directedBy,Duration duration,int year,String category){
        this.movieName=movieName;
        this.directedBy=directedBy;
        this.producedBy=producedBy;
        this.duration=duration;
        this.year=year;
        this.category=category;
        moviesCount++;
        movieId+=(movieName+"_"+moviesCount);
    }

    public String getMovieName() {
        return movieName;
    }

    public String getProducedBy() {
        return producedBy;
    }

    public String getDirectedBy() {
        return directedBy;
    }

    public Duration getDuration() {
        return duration;
    }

    public int getYear() {
        return year;
    }

    public String getCategory() {
        return category;
    }

    public static int getMoviesCount() {
        return moviesCount;
    }

    public String getMovieId() {
        return movieId;
    }
    public String showDetails(){
        return movieId+" "+movieName+" "+producedBy+" "+directedBy+" "+duration+" "+year+" "+category+" "+moviesCount;
    }
}
