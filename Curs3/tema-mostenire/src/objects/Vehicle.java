package objects;

public class Vehicle implements Comparable<Vehicle> {
    private String name;
    private int maxPassengers;
    private int maxSpeed;

    public Vehicle() {
    }

    public Vehicle(String name, int maxPassengers, int maxSpeed) {
        this.name = name;
        this.maxPassengers = maxPassengers;
        this.maxSpeed = maxSpeed;
    }

    public String getName() {
        return name;
    }

    public int getMaxPassengers() {
        return maxPassengers;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    @Override
    public int compareTo(Vehicle v) {
        int cmp;
        return cmp = name.compareTo(v.name);
    }

    @Override
    public String toString() {
        return "Name: " + name + ", maximum number of passengers: " + maxPassengers + ", maximum speed: " + maxSpeed + " .";
    }


}
