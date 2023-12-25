package creational_patterns.singleton;

public class SingletonBillPuge {

    private SingletonBillPuge() {
    }

    private static class InnerStaticClass {
        private static final SingletonBillPuge billPugeInstance = new SingletonBillPuge();
    }

    public static SingletonBillPuge getInstance() {
        return InnerStaticClass.billPugeInstance;
    }
}
