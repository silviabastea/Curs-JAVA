package objects;

public class Frigate extends SeaVessel {

    public Frigate(String name, int maxPassengers, int maxSpeed, String displacement) {
        super(name, maxPassengers, maxSpeed, displacement);
    }

    public void fireGun() {
        System.out.println("Fire gun.");
    }

    @Override
    public String toString() {
        return "Name: " + getName() + ", maximum number of passengers: "
                + getMaxPassengers() + ", maximum speed: " + getMaxSpeed()
                + ", displacement: " + getDisplacement() + " .";
    }
}
