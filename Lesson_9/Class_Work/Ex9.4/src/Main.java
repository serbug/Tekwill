public class Main {
    public static void main(String[] args) {
        /* Condition: You are given a class named Movie. Write two constructors for the class.
        *      The first constructor should take three arguments(title,desc,year) and initialize the
        *      corresponding fields.
        *      The second one should take only two arguments (title,year) and initialize title and year.
        *      In this case, the field desc should have a value "empty".
        * */

        Movie movie =new Movie("Superman",1998);

        System.out.println("\nTitle: "+movie.title+"\n Year: "+movie.year);


         //Optional
       // System.out.println(movie.toString());
    }
}