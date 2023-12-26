package structural_patterns.adapter;

import java.util.ArrayList;
import java.util.List;

public class LegacyDataAdapter implements NewDataConverter {

    @Override
    public List<LegacyData> convertData(List<NewData> data) {
        List<LegacyData> result = new ArrayList<>();
        for (NewData newData : data) {
            result.add(new LegacyData(newData.getAmount(), Integer.toString(newData.getPosition())));
        }
        return result;
    }

}
