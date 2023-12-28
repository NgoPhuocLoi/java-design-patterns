package structural_patterns.composite;

public class Client {
    public static void main(String[] args) {
        Composite computer = new Composite("Computer");
        Equipment processor = new Equipment("Processor", 1000);
        Equipment hdd = new Equipment("Hard drive", 250);
        Composite memory = new Composite("Memory");
        Equipment rom = new Equipment("Read only memmory", 75);
        Equipment ram = new Equipment("Random access memory", 100);

        memory.add(rom).add(ram);

        computer.add(processor).add(hdd).add(memory);

        System.out.println(computer.getPrice());
    }
}
