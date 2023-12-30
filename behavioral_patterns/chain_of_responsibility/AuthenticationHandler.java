package behavioral_patterns.chain_of_responsibility;

public class AuthenticationHandler implements HandlerChain {

    private String token;
    public HandlerChain next;

    public AuthenticationHandler(String token) {
        this.token = token;
    }

    @Override
    public String addHandler(String input) {
        String output = "%s\nAuthentication: %s".formatted(input, token);

        if (next == null)
            return output;
        return next.addHandler(output);
    }

}
