package behavioral_patterns.visitor;

public class TimeAndMaterialContract implements ReportElement {
    public long costPerHour;
    public int hour;

    public TimeAndMaterialContract(long costPerHour, int hour) {
        this.costPerHour = costPerHour;
        this.hour = hour;
    }

    @Override
    public <T> T accept(ReportVisitor<T> visitor) {
        return visitor.visit(this);
    }
}
