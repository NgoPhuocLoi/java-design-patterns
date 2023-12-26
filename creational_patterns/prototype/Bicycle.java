package creational_patterns.prototype;

public class Bicycle extends Vehicle {
    private boolean cityBike;

    public Bicycle(int wheels, long price, boolean cityBike) {
        super(wheels, price);
        this.cityBike = cityBike;
    }

    public Bicycle(Bicycle bicycle) {
        super(bicycle);
        this.cityBike = bicycle.cityBike;
    }

    public boolean isCityBike() {
        return this.cityBike;
    }

    @Override
    public Vehicle clone() {
        return new Bicycle(this);
    }

    @Override
    public boolean isClone(Vehicle target) {
        if (!(target instanceof Bicycle))
            return false;
        Bicycle bicycle = (Bicycle) target;
        return this.getWheels() == bicycle.getWheels() && this.getPrice() == bicycle.getPrice()
                && this.isCityBike() == bicycle.isCityBike();
    }

}
