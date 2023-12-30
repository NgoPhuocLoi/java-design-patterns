package behavioral_patterns.chain_of_responsibility;

public class Client {
    public static void main(String[] args) {

        AuthenticationHandler authHandler = new AuthenticationHandler("Mytoken");
        ContentTypeHandler contentTypeHandler = new ContentTypeHandler("application/json");
        PayloadHandler payloadHandler = new PayloadHandler("Body: myPayload");

        authHandler.next = contentTypeHandler;
        contentTypeHandler.next = payloadHandler;

        String withAuthentication = authHandler.addHandler("Headers with authentication");
        System.out.println(withAuthentication);

        System.out.println("");
        String withoutAuthentication = contentTypeHandler.addHandler("Headers without authentication");
        System.out.println(withoutAuthentication);
    }
}
