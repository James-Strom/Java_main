package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

        double valueOne = 20.00;
        double valueTwo = 125.00;
        double result = (valueOne + valueTwo) * 100;
        System.out.println(result);
        double isRemainder = result % 40;
        System.out.println(isRemainder);
        boolean remainder = (isRemainder == 0 ) ? true : false;

        if(remainder == true){
            System.out.println("You have no remainder");
        }
        if(remainder == false) {
            System.out.println("You have remainder of: " + isRemainder);
        }
    }
}
