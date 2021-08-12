import java.io.FileNotFoundException;
import java.io.IOException;


public class Main {
    public static void main(String[] args) throws IOException {

        String movie = Movie.randomMoviePicker();
        String codedMovie = Movie.codedMovie(movie);


        //GREETING
        System.out.println("Welcome to Guess the movie game.");
        System.out.println("Pick a letter and try to reveal the title of the movie. You have 10 guesses.");
        System.out.println("Good luck!");

        Game.guess(codedMovie, movie);

    }
}
