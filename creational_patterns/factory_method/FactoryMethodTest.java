package creational_patterns.factory_method;

public class FactoryMethodTest {
    public static void main(String[] args) {

        FoodFactory foodFactory = new FoodFactory();

        Food roundFood = foodFactory.getFood("Round");
        Food cylinderFood = foodFactory.getFood("Cylinder");

        System.out.println(roundFood.getShape());
        System.out.println(cylinderFood.getShape());

        try {
            foodFactory.getFood("Weird");
        } catch (IllegalArgumentException e) {
            // TODO: handle exception
            System.out.println(e.getMessage());
        }
    }

}
