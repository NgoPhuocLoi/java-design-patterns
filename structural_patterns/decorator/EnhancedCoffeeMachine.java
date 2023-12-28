package structural_patterns.decorator;

/**
 * EnhancedCoffeeMachine
 */
public class EnhancedCoffeeMachine implements CoffeeMachine {
    private NormalCoffeeMachine normalCoffeeMachine;

    public EnhancedCoffeeMachine(NormalCoffeeMachine normalCoffeeMachine) {
        this.normalCoffeeMachine = normalCoffeeMachine;
    }

    // Override behavior
    @Override
    public void makeSmallCoffee() {
        System.out.println("Enhanced coffee machine making a small coffee");
    }

    // Unaltered behavior

    @Override
    public void makeLargeCoffee() {
        this.normalCoffeeMachine.makeLargeCoffee();
    }

    // Extended bahavior

    public void makeMilkCoffee() {
        this.normalCoffeeMachine.makeSmallCoffee();
        System.out.println("Adding milk");
    }
}