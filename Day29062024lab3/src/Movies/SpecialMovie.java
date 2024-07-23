package Movies;

import java.time.Duration;

public class SpecialMovie extends Movie {
    String soundEffects;
    String visualEffects;
    SpecialMovie(String movieName, String producedBy, String directedBy, Duration duration,int year,String category, String soundEffects, String visualEffects){
        super(movieName,producedBy,directedBy,duration,year,category);
        this.soundEffects=soundEffects;
        this.visualEffects=visualEffects;
    }

    public String getSoundEffects() {
        return soundEffects;
    }

    public String getVisualEffects() {
        return visualEffects;
    }
}
