public class Movie {

    private String title;

    public Movie(String title){
        this.title = title;
    }

    public void watchMovie(){
        String instanceType = this.getClass().getSimpleName();
        System.out.println(title +" is a " + instanceType + " movie.");
    }

    public static Movie getMovie(String type, String title){
        return switch(type.toUpperCase().charAt(0)){
            case 'A' -> new Adventure(title);
            case 'C' -> new Comedy(title);
            case 'S' -> new ScienceFiction(title);
            default -> new Movie(title);
        };
    }
}

class Adventure extends Movie{
    public Adventure(String title) {
        super(title);
    }

    public void watchMovie(){
        super.watchMovie();
        System.out.printf(".. %s%n".repeat(3),
                "Pleasent Scene",
                "Scary Music",
                "Something Bad Happens");
    }
}

class Comedy extends Movie{
    public Comedy(String title) {
        super(title);
    }

    public void watchMovie(){
        super.watchMovie();
        System.out.printf(".. %s%n".repeat(3),
                "Funny Scene",
                "Hilarious Music",
                "Something So Awkward Happens");
    }
}

class ScienceFiction extends Movie{
    public ScienceFiction(String title) {
        super(title);
    }

    public void watchMovie(){
        super.watchMovie();
        System.out.printf(".. %s%n".repeat(3),
                "Fantastic Scene",
                "Beautiful Music",
                "Something Strange Happens");
    }
}