import java.util.logging.Logger;

public class Main {
    public static void main(String[] args) {

        Movie movie1 =new Movie("superman","2",1980);
        Movie movie2= new Movie("Superman",1990);


        System.out.println(movie1.toString());
        System.out.println(movie2.toString());
    }

}