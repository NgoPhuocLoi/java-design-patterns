package behavioral_patterns.visitor;

public class YearlyReport implements ReportVisitor<Long> {

    @Override
    public Long visit(FixedPriceContract contract) {
        return contract.costPerYear;
    }

    @Override
    public Long visit(TimeAndMaterialContract contract) {
        return contract.costPerHour * contract.hour;
    }

    @Override
    public Long visit(SupportedContract contract) {
        return contract.costPerMonth * 12;
    }

}
