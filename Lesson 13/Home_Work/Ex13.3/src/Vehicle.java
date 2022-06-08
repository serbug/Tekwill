class Vehicle {
    protected String licensePlate;

    public Vehicle(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "licensePlate=" + licensePlate +
                '}';
    }
}
