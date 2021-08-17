import java.io.FileNotFoundException;
import java.io.IOException;


public class Main {
    public static void main(String[] args) {

        //Picks random movie
        try {
            String filePath = "movies.txt";
            String movie = Movie.randomMoviePicker(filePath);
            System.out.println("!!! Picked movie: " + movie);
            System.out.println("");


            //Greeting
            System.out.println("Welcome to Guess the movie game.");
            System.out.println("Pick a letter and try to reveal the title of the movie. You have 10 guesses.");
            System.out.println("Good luck!");

            //Move to game?
            System.out.println("You're guessing: " + movie.replaceAll("[a-z]","_"));

            Game game = new Game(movie);
            Game.startGame(movie);


            //Game.guess(movie);
            System.out.println("");
            System.out.println("");
            System.out.println("");

        } catch (FileNotFoundException exception){
            System.out.println("File not found!");
            System.exit(1);
        }
    }
}
