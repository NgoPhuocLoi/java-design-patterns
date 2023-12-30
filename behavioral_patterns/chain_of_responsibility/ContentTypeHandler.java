package behavioral_patterns.chain_of_responsibility;

public class ContentTypeHandler implements HandlerChain {
    private String type;
    public HandlerChain next;

    public ContentTypeHandler(String type) {
        this.type = type;
    }

    @Override
    public String addHandler(String input) {
        String output = "%s\nContent-type: %s".formatted(input, type);

        if (next == null)
            return output;
        return next.addHandler(output);
    }
}
