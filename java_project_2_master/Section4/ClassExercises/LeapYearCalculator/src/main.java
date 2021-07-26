public class main {
    public static void main(String[] args) {
        System.out.printf("-120 is a leap year %b%n", (LeapYear.isLeapYear(-120)));
        System.out.printf("100 is a leap year %b%n", (LeapYear.isLeapYear(100)));
        System.out.printf("1924 is a leap year %b%n", (LeapYear.isLeapYear(1924)));
        System.out.printf("1800 is a leap year %b%n", (LeapYear.isLeapYear(1800)));
        System.out.printf("2000 is a leap year %b%n", (LeapYear.isLeapYear(2000)));
    }
}
