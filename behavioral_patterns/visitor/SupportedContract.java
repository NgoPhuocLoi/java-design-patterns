package behavioral_patterns.visitor;

public class SupportedContract implements ReportElement {
    public long costPerMonth;

    public SupportedContract(long costPerMonth) {
        this.costPerMonth = costPerMonth;
    }

    @Override
    public <T> T accept(ReportVisitor<T> visitor) {
        return visitor.visit(this);
    }

}
