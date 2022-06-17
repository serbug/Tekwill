/**
 * Tekwill Academy
 * Java Fundamentals
 * Exercise Ex15.3 The first element
 *
 * @Author Sergiu
 */
public class Main {
    public static void main(String[] args) {
       int[] array = new int[]{11,2,3,6};//11
       //int[] array=null;
       int first= ArrayUtils.getFirst(array);

        if (first == 0) {
            System.out.println("null");
        }else{
            System.out.println(first);
        }

    }
}