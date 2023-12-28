package structural_patterns.facade;

public class Client {
    public static void main(String[] args) {
        NetworkAccessFacade networkAccessFacade = new NetworkAccessFacade();

        networkAccessFacade.access();
    }
}
