package structural_patterns.bridge;

public interface PhoneOS {
    public void upload(String data);

    public void download(String url);

    public void display(String data);
}
