public class Article extends Publication {
    private String author;

    public Article(String title, String author) {
        super(title);
        this.author = author;
    }

    @Override
    public String getDetails() {
        return "(author - " + author+")";
    }
}