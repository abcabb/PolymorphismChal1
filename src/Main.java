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
    }
}