package creational_patterns.prototype;

public abstract class Vehicle {
    private int wheels;
    private long price;

    public Vehicle(int wheels, long price) {
        this.wheels = wheels;
        this.price = price;
    }

    public Vehicle(Vehicle vehicle) {
        if (vehicle != null) {
            this.wheels = vehicle.wheels;
            this.price = vehicle.price;
        }

    }

    public int getWheels() {
        return wheels;
    }

    public long getPrice() {
        return price;
    }

    public abstract Vehicle clone();

    public abstract boolean isClone(Vehicle target);
}
