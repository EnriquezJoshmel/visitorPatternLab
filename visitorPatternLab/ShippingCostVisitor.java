package visitorPatternLab;

public interface ShippingCostVisitor {
    public double visit1(Chair chair, double distance);

    public double visit2(Table table, double distance);

    public double visit3(Sofa sofa, double distance);
}
