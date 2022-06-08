/**
 * Tekwill Academy
 * Java Fundamentals
 * Exercises Ex13.3 Convert vehicles and cars to string
 *
 * @Author Sergiu
 */

/*Condition: There are two classes Vehicle and Car. The second class extends the first one.
Override toString in both classes to return a string representation of vehicles and cars.
If an object is Vehicle, the overridden method toString must return something like: Vehicle{licensePlate=ABC123}
If an object is Car, the overridden method toString must return something like:
Car{licensePlate=ABC123,numberOfSeats=4}
*/
public class Main {
    public static void main(String[] args) {

        Vehicle vehicle = new Vehicle("ABC123");
        Car car = new Car(vehicle.licensePlate, 4);

        System.out.println(vehicle);
        System.out.println(car);
    }
}