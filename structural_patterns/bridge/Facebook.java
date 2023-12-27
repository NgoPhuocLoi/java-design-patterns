package structural_patterns.bridge;

public class Facebook implements App {

    private PhoneOS os;

    public Facebook(PhoneOS os) {
        this.os = os;
    }

    @Override
    public void run() {
        this.os.display("Fb data");
        this.os.download("facebook.com");
        this.os.upload("FB avatar");
    }

}
