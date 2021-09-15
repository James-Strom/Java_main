package academy.learnprogramming;

public class Main {

//    public static void main(String[] args) {
//        Dimensions dimensions = new Dimensions(20, 20, 5);
//        Case theCase = new Case("220B", "Dell", "240", dimensions);
//
//        Monitor theMonitor = new Monitor("27inch Beast", "Acer", 27, new Resolution(2540, 1440));
//
//        Motherboard theMotherboard = new Motherboard("Bj-200", "Asus", 4, 6, "v2.44");
//
//        PC thePc = new PC(theCase, theMonitor, theMotherboard);
//        thePc.powerUp();
//    }

    public static void main(String[] args) {
        Wall wall1 = new Wall("West");
        Wall wall2 = new Wall("East");
        Wall wall3 = new Wall("North");
        Wall wall4 = new Wall("South");

        Ceiling celing = new Ceiling(12, 55);

        Bed bed = new Bed("Modern", 4, 10,2,0);

        Lamp lamp = new Lamp("Classic", true, 60);

        Bedroom bedroom= new Bedroom("Bob", wall1, wall2,wall3,wall4,celing,bed,lamp);
        bedroom.makeBed();
        bedroom.getLamp().turnOn();

    }
}
