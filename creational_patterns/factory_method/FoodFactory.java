package creational_patterns.factory_method;

public class FoodFactory {

    public Food getFood(String shape) {
        if (shape == null)
            return null;
        switch (shape) {
            case "Round":
                return new Pizza();
            case "Cylinder":
                return new Burrito();
            default:
                throw new IllegalArgumentException("Invalid shape");
        }
    }
}
