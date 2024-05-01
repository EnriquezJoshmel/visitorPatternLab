package visitorPatternLab;

public class MainApp {

    public static void main(String[] args) {
        Furniture furniture1 = new Chair("Kitchen Chair", 46);
        Furniture furniture2 = new Table("Dining Table", 47);
        Furniture furniture3 = new Table("Bedroom Table", 20);
        Furniture furniture4 = new Sofa("Living Room Sofa", 39);

        double furniture1Distance = 23.0;
        double furniture2Distance = 30.0;
        double furniture3Distance = 25.5;
        double furniture4Distance = 18.3;

        ShippingCostVisitor flatRateVisitor = new FlatRateShippingVisitor();

        System.out.println("===================================================================================================");
        System.out.println("The " + furniture1.getName() + " (Size: " + furniture1.getSize() + ") is shipped and will travel " + furniture1Distance + " kilometers."
                + "\nThe shipping fee will cost " + " PHP" + furniture1.accept(flatRateVisitor, furniture1Distance));

        System.out.println("\nThe " + furniture2.getName() + " (Size: " + furniture2.getSize() + ") is shipped and will travel " + furniture2Distance + " kilometers."
                + "\nThe shipping fee will cost " + " PHP" + furniture2.accept(flatRateVisitor, furniture2Distance));

        System.out.println("\nThe " + furniture3.getName() + " (Size: " + furniture3.getSize() + ") is shipped and will travel " + furniture3Distance + " kilometers."
                + "\nThe shipping fee will cost " + " PHP" + furniture3.accept(flatRateVisitor, furniture3Distance));

        System.out.println("\nThe " + furniture4.getName() + " (Size: " + furniture4.getSize() + ") is shipped and will travel " + furniture4Distance + " kilometers."
                + "\nFlat rate shipping is not applicable for sofas.");
        System.out.println("===================================================================================================");



    }
}
