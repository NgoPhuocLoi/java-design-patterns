package structural_patterns.adapter;

import java.util.List;

public class NewDataGenerator {

    public List<NewData> generate() {
        return List.of(
                new NewData(1, 10),
                new NewData(2, 20),
                new NewData(3, 30));
    }
}
