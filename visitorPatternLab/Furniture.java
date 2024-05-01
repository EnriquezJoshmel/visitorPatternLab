package visitorPatternLab;

public interface Furniture {
    public String getName();

    public String getType();

    public double getSize();

    public double accept(ShippingCostVisitor visitor, double distance);
}
