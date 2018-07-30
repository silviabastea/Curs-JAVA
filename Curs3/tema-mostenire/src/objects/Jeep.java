package objects;

public class Jeep extends LandVehicle {

    public Jeep(String name, int maxPassengers, int maxSpeed, int numWheels) {
        super(name, maxPassengers, maxSpeed, numWheels);
    }

    public void soundHorn() {
    }

    @Override
    public String toString() {
        return "Name: " + getName() + ", maximum number of passengers: "
                + getMaxPassengers() + ", maximum speed: " + getMaxSpeed() +
                ", number of wheels: " + getNumWheels() + " .";
    }
}
