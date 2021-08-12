import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.File;

public class Movie {

    public static String randomMoviePicker() throws FileNotFoundException {

        File moviesFile = new File("movies.txt");
        Scanner fileScanner = new Scanner(moviesFile);

        //Check total number of movies in file & generate a random number.
        int numberOfMovies = 0;
        while (fileScanner.hasNextLine()) {
            String line = fileScanner.nextLine();
            numberOfMovies++;
        }
        int randomNumber = (int) (Math.random() * numberOfMovies +1);

        //Picks a movie based on random number
        Scanner fileScanner2 = new Scanner(moviesFile);
        String movie = null;
        for(int i = 0; i < randomNumber; i++){
            movie = fileScanner2.nextLine();
        }
        System.out.println(movie);

        return movie;

        }

    //TODO constructor??
    //FIXME FileNotFoundException w main
}
