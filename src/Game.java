import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
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
        //System.out.println(movie.indexOf("a"));
        System.out.println("Type your guess: ");
        guess = scanner.nextLine();


        if(movie.contains(guess)) {

            //Checking for multiple instances of guessed character
            List<Integer> indexes = new ArrayList<Integer>();
            //Adds first instance of guessed index
            int index = movie.indexOf(guess);
            //Adds later instances
            while(index >= 0) {
                indexes.add(index);
                index = movie.indexOf(guess, index+1);
            }
            for(int i=0; i < indexes.size(); i++) {
            codedMovie[indexes.get(i)] = guess.charAt(0);
            }
            System.out.println(codedMovie);
        }
        else{
            System.out.println("Bad letter");

        }





    }
}