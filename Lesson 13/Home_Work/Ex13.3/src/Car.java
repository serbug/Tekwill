class Car extends Vehicle {
    protected int numberOfSeats;

    public Car(String licensePlate, int numberOfSeats) {
        super(licensePlate);
        this.numberOfSeats = numberOfSeats;
    }

    @Override
    public String toString() {
        return "Car{" +
                "licensePlate=" + licensePlate +
                ", numberOfSeats=" + numberOfSeats +
                '}';
    }
}