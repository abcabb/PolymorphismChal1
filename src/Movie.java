public class Movie {

    private String title;

    public Movie(String title){
        this.title = title;
    }

    public void watchMovie(){
        String instanceType = this.getClass().getSimpleName();
        System.out.println(title +" is a " + instanceType + " movie.");
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