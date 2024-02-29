public class NextMain {
    public static void main(String[] args) {
        Movie movie1 = Movie.getMovie("ADVENTURE", "ABC");
        movie1.watchMovie();

        Adventure jawsMov = (Adventure) Movie.getMovie("a", "jaws");
        jawsMov.watchMovie();

        Object comedyMov = Movie.getMovie("Comedy", "Airplane");
        Comedy movie2 = (Comedy) comedyMov;
        movie2.watchComedy();

        Object advMov = Movie.getMovie("Adventure", "XYz");
//        advMov.watchMovie(); bu olmaz, çünkü Object class içerisinde böyle bir metod yok
        Movie advenMov = (Movie) advMov;
        advenMov.watchMovie();


        var airplane = Movie.getMovie("Comedy", "Airplane");
        airplane.watchMovie(); // Burada oluyor çünkü var compile time zamanını görebiliyor.

        var plane = new Comedy("Airplane");
        plane.watchComedy();
    }
}
