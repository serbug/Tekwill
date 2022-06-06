/**
 * Tekwill Academy
 * Java Fundamentals
 * Exercise Ex12.2 Bank account
 *
 * @Author Sergiu
 */
/*Condition: You are given a class named BankAccount. The class has two fields: number and
balance. Define two classes which inherit from the BankAccount:
● CheckingAccount containing the double field fee.
● SavingAccount containing the double field interestRate.
Each new class should have a constructor with three parameters:
● CheckingAccount(String number, Long balance, double fee)
● SavingAccount(String number, Long balance, double interestRate)
Do not forget to invoke the superclass constructor when creating objects.
*/
public class Main {

    public static void main(String[] args) {

        BankAccount bankAccount = new BankAccount("0000 0000 0000 0000", 12L);

        CheckingAccount checkingAccount = new CheckingAccount(bankAccount.number, bankAccount.balance, 12.65);

        SavingAccount savingAccount = new SavingAccount(bankAccount.number, bankAccount.balance, 3.65);


    }
}
