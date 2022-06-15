public class Main {
    public static void main(String[] args) {
        Money money = new Money(100, "USD");
        Money money1 = new Money(100, "USD");
        Money money2 = new Money(50, "EU");

        System.out.println(money.equals(money1));
        System.out.println(money1.equals(money1));
        System.out.println(money1.equals(money2));

        System.out.println(money.hashCode());
        System.out.println(money1.hashCode());
        System.out.println(money2.hashCode());


    }
}