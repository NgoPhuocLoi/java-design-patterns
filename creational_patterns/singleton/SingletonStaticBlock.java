package creational_patterns.singleton;

public class SingletonStaticBlock {
    private static SingletonStaticBlock instance;

    static {
        instance = new SingletonStaticBlock();
    }

    public static SingletonStaticBlock getInstance() {
        return instance;
    }
}
