package behavioral_patterns.strategy;

public class Client {
    public static void main(String[] args) {
        String name = "Ngo Phuoc Loi";
        Executor executor = new Executor(new UppercaseStrategy());
        executor.printString(name);

        executor.setStrategy(new LowercaseStrategy());
        executor.printString(name);

        executor.setStrategy(new RandomCaseStrategy());
        executor.printString(name);
    }
}
