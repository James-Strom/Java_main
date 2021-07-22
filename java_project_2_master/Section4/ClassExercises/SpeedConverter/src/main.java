public class main {
    public static void main(String[] args) {
        long miles = SpeedConverter.toMilesPerHour(1.5);
        System.out.println("Miles = " + miles);

        SpeedConverter.printConversion((1.5));
    }
}
