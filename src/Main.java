import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {

        String movie = Movie.randomMoviePicker();
        System.out.println(movie);
        String codedMovie = Movie.codedMovie(movie);
        System.out.println(codedMovie);
    }
}
