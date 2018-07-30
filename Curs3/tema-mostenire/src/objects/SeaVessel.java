package objects;

public class SeaVessel extends Vehicle {

    private String displacement;

    public SeaVessel(String name, int maxPassengers, int maxSpeed, String displacement) {
        super(name, maxPassengers, maxSpeed);
        this.displacement = displacement;
    }

    public void launch() {
    }

    public String getDisplacement() {
        return displacement;
    }

    @Override
    public String toString() {
        return "Name: " + getName() + ", maximum number of passengers: "
                + getMaxPassengers() + ", maximum speed: " + getMaxSpeed()
                + ", displacement: " + displacement + " .";
    }
}
