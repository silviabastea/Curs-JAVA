package objects;

public class LandVehicle extends Vehicle {

    private int numWheels;

    public LandVehicle(String name, int maxPassengers, int maxSpeed, int numWheels) {
        super(name, maxPassengers, maxSpeed);
        this.numWheels = numWheels;
    }

    public void drive() {
        System.out.println("Drive.");
    }

    public int getNumWheels() {
        return numWheels;
    }
}
