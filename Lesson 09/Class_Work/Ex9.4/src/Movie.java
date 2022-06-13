public class Movie {
    String title;
    String desc;
    int year;

    public Movie(String title, String desc, int year) {
        this.title = title;
        this.desc = desc;
        this.year = year;
    }

    public Movie(String title, int year) {
        this.title = title;
        this.year = year;
        this.desc = "empty";
    }

    // Additional method
    @Override
    public String toString() {
        return "Movie{" +
                "title='" + title + '\'' +
                ", desc='" + desc + '\'' +
                ", year=" + year +
                '}';
    }
}
