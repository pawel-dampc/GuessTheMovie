import java.util.Arrays;
import java.util.Scanner;

public class Game {

    String movie;
    int chances;

    //Constructor
    Game(String movie){
        this.movie = movie;
        this.chances = 10;
    }

    public static void startGame(String movie) {
        Scanner scanner = new Scanner(System.in);
        String guess = "";
        char[] codedMovie = movie.replaceAll("[a-z]","_").toCharArray();

        //CHEAT TO DELETE
        System.out.println(movie);

        System.out.println("Type your guess: ");
        guess = scanner.nextLine();

        if(movie.contains(guess)){
            System.out.println("Good letter");
            System.out.println(codedMovie);
        }
        else{
            System.out.println("Bad letter");

        }





    }
}