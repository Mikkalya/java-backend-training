package Movies;

import java.time.Duration;

public class InternationalMovie extends Movie {
    String country;
    String language;
    InternationalMovie(String movieName, String producedBy, String directedBy, Duration duration, int year, String category,String country,String language){
        super(movieName,producedBy,directedBy,duration,year,category);
        this.country=country;
        this.language=language;
    }

    public String getCountry() {
        return country;
    }

    public String getLanguage() {
        return language;
    }

    @Override
    public String showDetails(){
        return movieId+" "+movieName+" "+producedBy+" "+directedBy+" "+duration+" "+year+" "+category+" "+moviesCount+" "+country+" "+language;
    }
}
