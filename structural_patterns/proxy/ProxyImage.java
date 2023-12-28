package structural_patterns.proxy;

public class ProxyImage implements Image {
    private String filename;
    private RealImage realImage;

    public ProxyImage(String filename) {
        this.filename = filename;
    }

    @Override
    public void display() {
        if (this.realImage == null) {
            this.realImage = new RealImage(this.filename);
        }
        this.realImage.display();
        System.out.println("Proxy image Logging... ");
    }

}
