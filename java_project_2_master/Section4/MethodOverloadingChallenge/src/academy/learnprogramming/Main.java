package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        calcFeetAndInchesToCentimeters (6,0);
        calcFeetAndInchesToCentimeters (6,-2);
        calcFeetAndInchesToCentimeters(78);
        calcFeetAndInchesToCentimeters(-2);
    }
    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
        if(feet >= 0 && (inches <= 12 && inches>=0)) {
            double centimeters = (feet * (12 * 2.54)) + (inches * 2.54);
            System.out.println(feet + "ft " + inches + " inches = " + centimeters + "cm");
            return centimeters;
        } else {
            System.out.println("Invalid feet or inches.");
            return -1;
        }
    }

    public static double calcFeetAndInchesToCentimeters(double inches) {
        if(inches>=0) {
            double feet = (int) inches /12;
            double remainingInches = (int) inches % 12;
            System.out.println(inches + " = " + feet + " feet and " + remainingInches +" inches");
            return calcFeetAndInchesToCentimeters(feet, remainingInches);
        } else {
            System.out.println("Invalid inches.");
            return -1;
        }
    }
}
