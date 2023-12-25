package creational_patterns.singleton;

public class SingletonTest {
    public static void main(String[] args) {
        SingletonEager singletonEager1 = SingletonEager.getInstance();
        SingletonEager singletonEager2 = SingletonEager.getInstance();

        System.out.println(singletonEager1);
        System.out.println(singletonEager2);

        SingletonStaticBlock singletonStaticBlock1 = SingletonStaticBlock.getInstance();
        SingletonStaticBlock singletonStaticBlock2 = SingletonStaticBlock.getInstance();

        System.out.println(singletonStaticBlock1);
        System.out.println(singletonStaticBlock2);

        SingletonLazy singletonLazy1 = SingletonLazy.getInstance();
        SingletonLazy singletonLazy2 = SingletonLazy.getInstance();

        System.out.println(singletonLazy1);
        System.out.println(singletonLazy2);

        SingletonThreadSafe singletonThreadSafe1 = SingletonThreadSafe.getInstance();
        SingletonThreadSafe singletonThreadSafe2 = SingletonThreadSafe.getInstance();

        System.out.println(singletonThreadSafe1);
        System.out.println(singletonThreadSafe2);

        SingletonBillPuge singletonBillPuge1 = SingletonBillPuge.getInstance();
        SingletonBillPuge singletonBillPuge2 = SingletonBillPuge.getInstance();

        System.out.println(singletonBillPuge1);
        System.out.println(singletonBillPuge2);
    }
}
