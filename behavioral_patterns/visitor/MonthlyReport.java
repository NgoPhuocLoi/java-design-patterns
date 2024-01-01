package behavioral_patterns.visitor;

public class MonthlyReport implements ReportVisitor<Long> {

    @Override
    public Long visit(FixedPriceContract contract) {
        return contract.costPerYear / 12;
    }

    @Override
    public Long visit(TimeAndMaterialContract contract) {
        return contract.costPerHour * contract.hour;
    }

    @Override
    public Long visit(SupportedContract contract) {
        return contract.costPerMonth;
    }

}
