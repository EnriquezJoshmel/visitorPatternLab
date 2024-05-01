package visitorPatternLab;

public class FlatRateShippingVisitor implements ShippingCostVisitor {

    private final double baseCost = 10;

    @Override
    public double visit(Chair chair, double distance) {
        return baseCost;
    }

    @Override
    public double visit(Table table, double distance) {
        return baseCost;
    }

    @Override
    public double visit(Sofa sofa, double distance) {
        throw new UnsupportedOperationException("Flat rate not applicable for Sofa");
    }
}
