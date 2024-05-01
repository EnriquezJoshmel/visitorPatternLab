package visitorPatternLab;

public class Sofa implements Furniture {

    private final String name;
    private final double size;

    public Sofa(String name, double size) {
        this.name = name;
        this.size = size;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getType() {
        return "Sofa";
    }

    @Override
    public double getSize() {
        return size;
    }

    @Override
    public double accept(ShippingCostVisitor visitor, double distance) {
        if (this.getType().equals("Sofa")) {
            // Call SofaShippingVisitor
        } else {
            return visitor.visit(this, distance);
        }
        return distance;
    }
}