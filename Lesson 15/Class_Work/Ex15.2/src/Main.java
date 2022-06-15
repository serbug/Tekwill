/**
 * Tekwill Academy
 * Java Fundamentals
 * Exercises Ex15.2 Boxes are not just objects!
 *
 * @Author Sergiu
 */
public class Main {
    public static void main(String[] args) {
        Box<Cake> cakeBox=new Box<>();
        cakeBox.put(new Cake());

        Cake cake = cakeBox.get();

        Box<Chocolate> chocolateBox=new Box<>();

        chocolateBox.put(new Chocolate());

        Chocolate chocolate=chocolateBox.get();

//        Box cakeBox = new Box();
//        Cake cake1 =new Cake();
//        cakeBox.put(new Cake());
//        Cake cake = (Cake) cakeBox.get();
    }
}