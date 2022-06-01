/**
 * Tekwill Academy
 * Java Fundamentals
 * Exercise Ex10.2 Patient needs a doctor
 *
 * @Author Sergiu
 */

/*Condition: Here's a class named Patient. It has one string field name. You want to create a
method that would allow your patient to call for a doctor. Add the method say that
prints the message containing the name of a patient (instead of "...") and their
request for a doctor: Hello, my name is ..., I need a doctor.
This method doesn't take any parameters and doesn't return anything.
*/
public class Main {

    public static void main(String[] args) {
        Patient patient = new Patient();

        patient.say();

    }
}
