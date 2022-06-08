/**
 * Tekwill Academy
 * Java Fundamentals
 * Exercise Ex13.2 Publication and its subclasses
 *
 * @Author Sergiu
 */
public class Main {
    public static void main(String[] args) {
        Publication publication = new Publication("The new era");
        Newspaper newspaper = new Newspaper("Football results", "Sport news");
        Article article = new Article("Why the Sun is hot", "Dr James Smith");
        Announcement announcement = new Announcement("Will sell a house", 30);


        Publication[] publications = {publication, newspaper, article, announcement};

        printPublication(publications);

    }

    public static void printPublication(Publication[] publications) {
        for (Publication publication : publications) {
            System.out.println(publication.getInfo());
        }
    }
}
