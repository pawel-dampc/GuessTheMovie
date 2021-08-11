import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.File;

public class Movie {

    public static void randomMoviePicker() throws FileNotFoundException {

        File moviesFile = new File("movies.txt");
        Scanner fileScanner = new Scanner(moviesFile);

        while (fileScanner.hasNextLine()) {
            String line = fileScanner.nextLine();
            System.out.println(line);
        }

        //TODO while loop - return number of movies
        //TODO roll random number from 1 to nr of movies
        //TODO pick random movie using random number
        //TODO method for hiding movie name

        //TODO constructor??
        //FIXME FileNotFoundException w main
        }
}
