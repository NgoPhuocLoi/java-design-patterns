package structural_patterns.proxy;

public class Client {
    public static void main(String[] args) {
        Image image = new ProxyImage("myimage.png");

        image.display();
        System.out.println("");
        image.display();
    }
}
