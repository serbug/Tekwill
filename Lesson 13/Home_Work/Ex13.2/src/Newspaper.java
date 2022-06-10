public class Newspaper extends Publication {
    private String source;


    public Newspaper(String title, String source) {
        super(title);
        this.source = source;

    }

    @Override
    public String getDetails() {
        return "(source - " + source+")";
    }

}