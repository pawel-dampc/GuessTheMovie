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


        System.out.println("Scanner -> get number of lines");
        System.out.println("Get random number -> scanner-> choose random movie");
        System.out.println("Constructor???");
        System.out.println("FileNotFoundException w main? Zrobić wyjątek.");
        }
}
