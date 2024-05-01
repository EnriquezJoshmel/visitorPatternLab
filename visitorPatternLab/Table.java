package visitorPatternLab;

public class Table implements Furniture {

    private final String name;
    private final double size;

    public Table(String name, double size) {
        this.name = name;
        this.size = size;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getType() {
        return "Table";
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