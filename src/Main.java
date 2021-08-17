import java.io.FileNotFoundException;
import java.io.IOException;


public class Main {
    public static void main(String[] args) {

        //Picks random movie
        try {
            String filePath = "movies.txt";
            String movie = Movie.randomMoviePicker(filePath);



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
