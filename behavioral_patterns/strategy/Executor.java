package behavioral_patterns.strategy;

public class Executor {
    private PrintStrategy printStrategy;

    public Executor(PrintStrategy initialStrategy) {
        this.printStrategy = initialStrategy;
    }

    public void setStrategy(PrintStrategy strategy) {
        this.printStrategy = strategy;
    }

    public void printString(String s) {
        System.out.println(printStrategy.formatString(s));
    }
}
