package structural_patterns.composite;

public class Equipment {
    private String name;
    private Integer price;

    public Equipment(String name, Integer price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public Integer getPrice() {
        return price;
    }

}
