package behavioral_patterns.visitor;

public class FixedPriceContract implements ReportElement {
    public long costPerYear;

    public FixedPriceContract(long costPerYear) {
        this.costPerYear = costPerYear;
    }

    @Override
    public <T> T accept(ReportVisitor<T> visitor) {
        return visitor.visit(this);
    }

}
