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

        while(i<10) {
            System.out.println("Lenght of movie String " + movie.length());
            System.out.println("You are guessing: " + codedMovie);
            System.out.println("You have guessed (" + i + ") wrong letters.");
            System.out.println("Guess a letter: ");

            String inputGuess = String.valueOf(scanner.next().charAt(0));

            for(int index = 0; index < movie.length(); index++) {
                int charAt = movie.indexOf(inputGuess);
                if (charAt == -1) {
                    System.out.println("No such letter, try again.");
                    System.out.println("");
                    i++;
                }
                else{
                    System.out.println(charAt);
                    int[] guessedChars =
                    while(charAt<movie.length()){

                    }
                }


                /*int charAt = movie.indexOf(inputGuess);
                if (charAt == -1) {
                    System.out.println("No such letter, try again.");
                    System.out.println("");
                    i++;
                } else {
                    System.out.println(charAt);
                }*/
            }


        }
        return null;
    }
}
