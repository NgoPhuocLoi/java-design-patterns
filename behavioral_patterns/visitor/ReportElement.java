package behavioral_patterns.visitor;

public interface ReportElement {

    <T> T accept(ReportVisitor<T> visitor);
}
