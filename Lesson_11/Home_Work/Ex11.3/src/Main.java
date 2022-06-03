/**
 * Tekwill Academy
 * Java Fundamentals
 * Exercise Ex11.3 Currencies
 *
 * @Author Sergiu
 */

/*Condition: Declare an enum Currency. It should include the following currency codes (according
to ISO 4217):
● USD — United States dollar
● EUR — Euro
● GBP — Pound sterling
● RUB — Russian ruble
● UAH — Ukrainian hryvnia
● KZT — Kazakhstani tenge
● CAD — Canadian dollar
● JPY — Japanese yen
● CNY — Chinese yuan
You must include all of the codes presented above and nothing else.*/
public class Main {
    public static void main(String[] args) {
        for (Currencies value : Currencies.values()) {
            System.out.println(value);
        }
    }
}