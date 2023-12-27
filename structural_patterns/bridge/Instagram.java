package structural_patterns.bridge;

public class Instagram implements App {
    private PhoneOS os;

    public Instagram(PhoneOS os) {
        this.os = os;
    }

    @Override
    public void run() {
        this.os.display("IG data");
        this.os.download("instagram.com");
        this.os.upload("IG avatar");
    }
}
