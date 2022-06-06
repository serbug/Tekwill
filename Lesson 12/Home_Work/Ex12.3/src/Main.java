/**
 * Tekwill Academy
 * Java Fundamentals
 * Exercise Ex12.3 Employees
 *
 * @Author Sergiu
 */

/*Condition: Develop a class hierarchy of employees. The hierarchy should include three classes:
● Employee is the base class. It includes three fields (name, email and integer
variable experience), one constructor with three arguments and three getters:
getName(), getEmail(), getExperience().
● Developer is a subclass. It includes fields from the base class and two additional
fields (mainLanguage, skills), one constructor with five arguments and two
getters: getMainLanguage(), getSkills().
● DataAnalyst is another subclass. It includes fields from the base class and two
additional fields (phd, methods), one constructor with five arguments and two
getters: isPhd(), getMethods().
*/
public class Main {

    public static void main(String[] args) {
        String[] skills = {"git", "Scala", "JBoss", "UML"};
        Developer developer = new Developer("Mary", "mary@mail.com", 3, "Java", skills);
        String[] methods = {"neural networks", "decision tree", "bayesian algorithms"};
        DataAnalyst analyst = new DataAnalyst("John", "john@gmail.com", 2, true, methods);

        System.out.println(developer.toString());

        System.out.println(analyst.toString());
    }
}
