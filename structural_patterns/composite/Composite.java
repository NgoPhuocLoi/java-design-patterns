package structural_patterns.composite;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class Composite extends Equipment {
    private List<Equipment> equipments = new ArrayList<>();

    public Composite(String name) {
        super(name, 0);
    }

    public Composite add(Equipment e) {
        this.equipments.add(e);
        return this;
    }

    @Override
    public Integer getPrice() {
        return equipments.stream().flatMapToInt(e -> IntStream.of(e.getPrice())).sum();
    }
}
