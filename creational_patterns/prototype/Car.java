package creational_patterns.prototype;

public class Car extends Vehicle {
    private String color;

    public Car(int wheels, long price, String color) {
        super(wheels, price);
        this.color = color;
    }

    public Car(Car car) {
        super(car);
        this.color = car.color;
    }

    @Override
    public Vehicle clone() {
        return new Car(this);
    }

    @Override
    public boolean isClone(Vehicle target) {
        if (!(target instanceof Car))
            return false;
        Car car = (Car) target;
        return this.getWheels() == car.getWheels() && this.getPrice() == car.getPrice() && this.color == car.getColor();
    }

    public String getColor() {
        return color;
    }

}
