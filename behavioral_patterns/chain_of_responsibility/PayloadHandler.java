package behavioral_patterns.chain_of_responsibility;

public class PayloadHandler implements HandlerChain {
    private String payload;
    public HandlerChain next;

    public PayloadHandler(String payload) {
        this.payload = payload;
    }

    @Override
    public String addHandler(String input) {
        String output = "%s\n%s".formatted(input, payload);

        if (next == null)
            return output;
        return next.addHandler(output);
    }
}
