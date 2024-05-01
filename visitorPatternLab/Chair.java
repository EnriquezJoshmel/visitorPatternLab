package visitorPatternLab;

public class Chair implements Furniture {

    private final String name;
    private final double size;

    public Chair(String name, double size) {
        this.name = name;
        this.size = size;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getType() {
        return "Chair";
    }

    @Override
    public double getSize() {
        return size;
    }

    @Override
    public double accept(ShippingCostVisitor visitor, double distance) {
        return visitor.visit(this, distance);
    }
}


