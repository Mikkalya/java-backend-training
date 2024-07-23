package Movies;
import java.util.function.DoubleToIntFunction;

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
        //Create an array of Movie class and store Objects of Movie, SpecialMovie and InternationalMovie classes in the array.
        App movies[]=new App[3];
        Movie movie1=new Movie("M1","P1","d1",ofHours(2),2020,"Action");
        SpecialMovie specialMovie1=new SpecialMovie("SM1","SP1","SD1",ofHours(3),2021,"Comedy","SE1","VE1");
        InternationalMovie internationalMovie1=new InternationalMovie("IM1","IP1","ID1",ofHours(2).plusMinutes(30),2021,"Drama","India","Tamil");
        movies[0]=new App(movie1);
        movies[1]=new App(specialMovie1);
        movies[2]=new App(internationalMovie1);
//        for(int i=0;i<3;i++){
//            if(movies[i].isSpecialMovie){
//                System.out.println(movies[i].specialMovie.showDetails()+" "+movies[i].specialMovie.soundEffects+" "+movies[i].specialMovie.visualEffects);
//            }
//            else if(movies[i].isInternationalMovie){
//                System.out.println(movies[i].internationalMovie.showDetails()+" "+movies[i].internationalMovie.country+" "+movies[i].internationalMovie.language);
//            }
//            else{
//                System.out.println(movies[i].movie.showDetails());
//            }
//        }
        //Using a single for loop traverse the above array and call the method showDetails() on all the objects of the array.
        for(int i=0;i<3;i++){
            if(movies[i].isSpecialMovie){
                System.out.println(movies[i].specialMovie.showDetails());
            }
            else if(movies[i].isInternationalMovie){
                System.out.println(movies[i].internationalMovie.showDetails());
            }
            else{
                System.out.println(movies[i].movie.showDetails());
            }
        }
        System.out.println();
        //Check whether it is possible to call the methods of SpecialMovie and InternationalMovie while traversing the array inside the for loop. If not, use typecasting to do this.
        for(int i=0;i<3;i++){
            if(movies[i].isSpecialMovie){
                System.out.print(movies[i].specialMovie.getMovieId()+" "+movies[i].specialMovie.getMovieName()+" "+movies[i].specialMovie.getProducedBy()+" "+movies[i].specialMovie.getDirectedBy()+" "+movies[i].specialMovie.getDuration()+" "+movies[i].specialMovie.getYear()+" "+movies[i].specialMovie.getCategory()+" "+movies[i].specialMovie.soundEffects+" "+movies[i].specialMovie.visualEffects+" ");
            }
            else if(movies[i].isInternationalMovie){
                System.out.print(movies[i].internationalMovie.getMovieId()+" "+movies[i].internationalMovie.getMovieName()+" "+movies[i].internationalMovie.getProducedBy()+" "+movies[i].internationalMovie.getDirectedBy()+" "+movies[i].internationalMovie.getDuration()+" "+movies[i].internationalMovie.getYear()+" "+movies[i].internationalMovie.getCategory()+" "+movies[i].internationalMovie.country+" "+movies[i].internationalMovie.language+" ");
            }
            else{
                System.out.print(movies[i].movie.getMovieId()+" "+movies[i].movie.getMovieName()+" "+movies[i].movie.getProducedBy()+" "+movies[i].movie.getDirectedBy()+" "+movies[i].movie.getDuration()+" "+movies[i].movie.getYear()+" "+movies[i].movie.getCategory()+" ");
            }
            System.out.println(Movie.getMoviesCount());
        }
    }
}