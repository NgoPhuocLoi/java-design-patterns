package behavioral_patterns.visitor;

public interface ReportVisitor<T> {
    T visit(FixedPriceContract contract);

    T visit(TimeAndMaterialContract contract);

    T visit(SupportedContract contract);

}
