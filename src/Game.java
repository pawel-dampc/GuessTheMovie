import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Game {

    String movie;


    //Constructor
    Game(String movie){
        this.movie = movie;
    }

    public static void startGame(String movie) {
        int chances = 10;
        Scanner scanner = new Scanner(System.in);
        String guess = "";
        ArrayList<String> alreadyGuessed = new ArrayList();
        char[] codedMovie = movie.replaceAll("[a-z]", "_").toCharArray();

        //Greeting
        System.out.println("Welcome to Guess the movie game.");
        System.out.println("Pick a letter and try to reveal the title of the movie. You have 10 guesses.");
        System.out.println("Good luck!");
        System.out.println();
        System.out.println("You're guessing: " + movie.replaceAll("[a-z]","_"));

        //System.out.println("You're guessing: " + codedMovie); WTF THIS DOESN'T WORK??

        //CHEAT TO DELETE
        System.out.println(movie);

        while (chances > 0) {
            System.out.println("You have " + chances + " more guesses.");
            System.out.println("Type your guess: ");

            guess = scanner.nextLine();
            guess = guess.toLowerCase();

            //CHECK IF CHARACTER ALREADY GUESSED
            if (alreadyGuessed.contains(guess)) {
                System.out.println("You already guessed that character!");
                System.out.println("List of already guessed chars: " + alreadyGuessed);
            } else {
                alreadyGuessed.add(guess);

                //GOOD GUESS
                if (movie.contains(guess)) {
                    //MULTIPLE INSTANCES
                    ArrayList<Integer> indexes = new ArrayList<Integer>();
                    int index = movie.indexOf(guess);

                    while (index >= 0) {
                        indexes.add(index);
                        index = movie.indexOf(guess, index + 1);
                    }
                    for (int i = 0; i < indexes.size(); i++) {
                        codedMovie[indexes.get(i)] = guess.charAt(0);
                    }
                    System.out.println(codedMovie);
                } else {
                    System.out.println("Bad letter");
                }
            }
        }
    }





    }
