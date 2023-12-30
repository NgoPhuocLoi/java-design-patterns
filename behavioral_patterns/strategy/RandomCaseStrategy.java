package behavioral_patterns.strategy;

import java.util.Random;

public class RandomCaseStrategy implements PrintStrategy {
    @Override
    public String formatString(String input) {
        Random random = new Random();
        StringBuilder formatedResult = new StringBuilder("");
        for (int i = 0; i < input.length(); i++) {
            formatedResult.append(random.nextBoolean() ? input.toUpperCase().charAt(i) : input.toLowerCase().charAt(i));
        }
        return formatedResult.toString();
    }
}
