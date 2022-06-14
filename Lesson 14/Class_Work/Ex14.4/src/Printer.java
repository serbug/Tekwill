public interface Printer {
    default void print(){
        System.out.println("\nThis is a default message");
    };
}
