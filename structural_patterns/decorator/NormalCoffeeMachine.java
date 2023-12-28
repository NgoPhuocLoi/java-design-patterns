package structural_patterns.decorator;

public class NormalCoffeeMachine implements CoffeeMachine {

    @Override
    public void makeSmallCoffee() {
        System.out.println(this.getClass() + " making small coffee");
    }

    @Override
    public void makeLargeCoffee() {
        System.out.println(this.getClass() + " making large coffee");
    }

}
