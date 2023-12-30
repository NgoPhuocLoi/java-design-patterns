package behavioral_patterns.strategy;

public class UppercaseStrategy implements PrintStrategy {
    @Override
    public String formatString(String input) {
        return input.toUpperCase();
    }
}
