package visitorPatternLab;

public interface ShippingCostVisitor {
    public double visit(Chair chair, double distance);

    public double visit(Table table, double distance);

    public double visit(Sofa sofa, double distance);
}