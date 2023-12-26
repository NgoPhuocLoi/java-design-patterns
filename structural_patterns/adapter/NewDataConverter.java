package structural_patterns.adapter;

import java.util.List;

public interface NewDataConverter {
    public List<LegacyData> convertData(List<NewData> data);
}
