package structural_patterns.adapter;

import java.util.List;

public class Client {
    public static void main(String[] args) {
        NewDataGenerator generator = new NewDataGenerator();
        LegacyDataAdapter legacyDataAdapter = new LegacyDataAdapter();

        List<LegacyData> legacyDatas = legacyDataAdapter.convertData(generator.generate());

        for (LegacyData legacyData : legacyDatas) {
            legacyData.displayData();
        }
    }
}
