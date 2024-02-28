import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Movie movie1 = new Movie("Cars2");
        movie1.watchMovie();

        Movie movie2 = new Adventure("Finn and Jack");
        movie2.watchMovie();

        Movie movie3 = new Comedy("Stupid and Idiot");
        movie3.watchMovie();

        Movie newMovie = Movie.getMovie("science fiction", "Star Wars");
        newMovie.watchMovie();

        Scanner scanner = new Scanner(System.in);
        while(true) {
            System.out.println("Enter Movie Type(Adventure, Comedy or Science Fiction) or enter Q to quit");
            String type = scanner.nextLine();
            if("Qq".contains(type)){
                break;
            }
            System.out.println("So, enter the title of your "+ type + " film.");
            String title = scanner.nextLine();
            Movie userMovie = Movie.getMovie(type, title);
            userMovie.watchMovie();
        }
    }
}