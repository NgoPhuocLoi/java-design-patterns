package structural_patterns.adapter;

public class LegacyData {
    private float index;
    private String value;

    public LegacyData(float index, String value) {
        this.index = index;
        this.value = value;
    }

    public void displayData() {
        System.out.println(String.format("DATA: [%.2f - %s]", index, value));
    }
}
