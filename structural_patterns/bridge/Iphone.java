package structural_patterns.bridge;

public class Iphone implements PhoneOS {

    @Override
    public void upload(String data) {
        System.out.println("Iphone uploading data: " + data);
    }

    @Override
    public void download(String url) {
        System.out.println("Iphone downloading from url: " + url);
    }

    @Override
    public void display(String data) {
        System.out.println("Iphone displaying data: " + data);
    }

}
