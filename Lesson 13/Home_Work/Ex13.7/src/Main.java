/**
 * Tekwill Academy
 * Java Fundamentals
 * Exercises Ex13.7 Convert persons and patients to string
 *
 * @Author Sergiu
 */

/*Condition: Here are two classes Person and Patient. The second class extends the first one.
Override toString in both classes to return a string representation of persons and
patients. If an object is Person, the overridden method toString must return something like:
Person{name=Case Maxwell,age=30}
If an object is Patient, the overridden method toString must return something
like: Patient{name=John Purcell,age=30,height=182}
*/
public class Main {
    public static void main(String[] args) {

        Person person = new Person("Case Maxwell", 30);
        Patient patient = new Patient("John Purcell", 30, 182);

        System.out.println(person);
        System.out.println(patient);
    }
}