package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

        double numberPoundsValue = 215;
        double poundConversion = 0.45359237;
        double numberKilogramsValue = numberPoundsValue * poundConversion;
        System.out.println(numberKilogramsValue + " kg");

        double pi = 3.1415927d;
        double anotherNum = 3_000_000.4_567_890d;
        System.out.println(pi);
        System.out.println(anotherNum);
    }
}
