package visitorPatternLab;

public class MainApp {

    public static void main(String[] args) {
        Furniture furniture1 = new Chair("Kitchen Chair", 19);
        Furniture furniture2 = new Table("Dining Table", 72);
        Furniture furniture3 = new Table("Bedroom Table", 32);
        Furniture furniture4 = new Sofa("Living Room Sofa", 76);

        double furniture1Distance = 3.0;
        double furniture2Distance = 10.0;
        double furniture3Distance = 0.5;
        double furniture4Distance = 9.0;

        ShippingCostVisitor flatRateVisitor = new FlatRateShippingVisitor();

        System.out.println("===================================================================================================");
        System.out.println("The " + furniture1.getName() + " is shipped and will travel " + furniture1Distance + " kilometers."
                + "\nThe shipping fee will cost " + furniture1.accept(flatRateVisitor, furniture1Distance) + " PHP\n");

        System.out.println("The " + furniture2.getName() + " is shipped and will travel " + furniture2Distance + " kilometers."
                + "\nThe shipping fee will cost " + furniture2.accept(flatRateVisitor, furniture2Distance) + " PHP\n");

        System.out.println("The " + furniture3.getName() + " is shipped and will travel " + furniture3Distance + " kilometers."
                + "\nThe shipping fee will cost " + furniture3.accept(flatRateVisitor, furniture3Distance) + " PHP\n");

        System.out.println("The " + furniture4.getName() + " is shipped and will travel " + furniture4Distance + " kilometers."
                + "\nFlat rate shipping is not applicable for sofas. Please use a different cost calculator.");
        System.out.println("===================================================================================================");


    }
}
