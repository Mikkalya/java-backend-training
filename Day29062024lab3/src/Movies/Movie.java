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
        this(movieName,producedBy);
        this.directedBy=directedBy;
        this.duration=duration;
        this.year=year;
        this.category=category;
        moviesCount++;
        movieId+=(movieName+"_"+moviesCount);
    }
    Movie(String movieName,String producedBy){
        if(movieName.isEmpty()||movieName==null){
            throw new IllegalArgumentException("Movie name should not be null");
        }
        if(producedBy.isEmpty()||producedBy==null){
            throw new IllegalArgumentException("Produced by should not be null");
        }
        this.movieName=movieName;
        this.producedBy=producedBy;

//        moviesCount++;
//        movieId+=(movieName+"_"+moviesCount);
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
