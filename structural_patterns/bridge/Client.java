package structural_patterns.bridge;

public class Client {
    public static void main(String[] args) {
        App a1 = new Facebook(new Iphone());
        App a2 = new Instagram(new Android());

        a1.run();
        a2.run();
    }
}
