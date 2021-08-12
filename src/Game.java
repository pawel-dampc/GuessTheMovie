import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.Scanner;

public class Game {

    public static String guess(String codedMovie, String movie) throws IOException {
        int i = 0;
        Scanner scanner = new Scanner(System.in);

        //CHEAT TO DELETE
        System.out.println(movie);

        System.out.println("You are guessing: " + codedMovie);
        System.out.println("You have guessed (" + i + ") wrong letters.");
        System.out.println("Guess a letter: ");


        String inputGuess = String.valueOf(scanner.next().charAt(0));
        int charAt = movie.indexOf(inputGuess);
        System.out.println(charAt);
        return null;
    }
}
