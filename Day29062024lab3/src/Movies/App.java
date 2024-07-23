package Movies;
import java.time.Duration;
import static java.time.Duration.*;
public class App {
    Movie movie;
    SpecialMovie specialMovie;
    InternationalMovie internationalMovie;
    boolean isSpecialMovie;
    boolean isInternationalMovie;
    App(Movie movie){
        this.movie=movie;

    }
    App(SpecialMovie specialMovie){
        this.isSpecialMovie=true;
        this.specialMovie=specialMovie;
    }
    App(InternationalMovie internationalMovie){
        this.isInternationalMovie=true;
        this.internationalMovie=internationalMovie;
    }
    public static void main(String[] args) {
        App movies[]=new App[3];
        Movie movie1=new Movie("M1","P1","d1",ofHours(2),2020,"Action");
        SpecialMovie specialMovie1=new SpecialMovie("SM1","SP1","SD1",ofHours(3),2021,"Comedy","SE1","VE1");
        InternationalMovie internationalMovie1=new InternationalMovie("IM1","IP1","ID1",ofHours(2).plusMinutes(30),2021,"Drama","India","Tamil");
        movies[0]=new App(movie1);
        movies[1]=new App(specialMovie1);
        movies[2]=new App(internationalMovie1);
        for(int i=0;i<3;i++){
            if(movies[i].isSpecialMovie){
                System.out.println(movies[i].specialMovie.showDetails()+" "+movies[i].specialMovie.soundEffects+" "+movies[i].specialMovie.visualEffects);
            }
            else if(movies[i].isInternationalMovie){
                System.out.println(movies[i].internationalMovie.showDetails()+" "+movies[i].internationalMovie.country+" "+movies[i].internationalMovie.language);
            }
            else{
                System.out.println(movies[i].movie.showDetails());
            }
        }
    }
}
