/**
 * Tekwill Academy
 * Java Fundamentals
 * Exercise Ex12.2 Saying animals
 *
 * @Author Sergiu
 */
public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Cat cat = new Cat();
        Dog dog = new Dog();
        Duck duck = new Duck();

        animal.say();
        cat.say();
        dog.say();
        duck.say();
    }
}