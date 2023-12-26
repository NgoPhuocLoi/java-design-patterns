package creational_patterns.prototype;

public class Client {
    public static void main(String[] args) {
        Vehicle c1 = new Car(4, 35000, "Red");
        Vehicle c2 = c1.clone();

        if (c1.isClone(c2)) {
            System.out.println(c1 + " is clone of " + c2);
        }

        if (c2.isClone(c1)) {
            System.out.println(c2 + " is clone of " + c1);
        }

        Vehicle b1 = new Bicycle(2, 10000, true);
        Vehicle b2 = b1.clone();

        if (b1.isClone(b2)) {
            System.out.println(b1 + " is clone of " + b2);
        }

        if (b2.isClone(b1)) {
            System.out.println(b2 + " is clone of " + b1);
        }
    }
}
