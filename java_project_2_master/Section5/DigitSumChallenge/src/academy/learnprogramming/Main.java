package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        System.out.println("Sum of digit in number 125 is " + sumDigits( 125));
        System.out.println("Sum of digit in number -125 is " + sumDigits( -125));
        System.out.println("Sum of digit in number 7 is " + sumDigits( 7));
        System.out.println("Sum of digit in number 3432 is " + sumDigits( 3432));
    }

    private static int sumDigits(int number) {
        if (number < 10) {
            return -1;
        }

        int sum = 0;
//        Thinking sum digits
//        125 = 1+2+5=8
//        125 -> 125/10=12->12*10=120->125-120=5
        while (number >0) {
            int digit = number % 10;
            sum += digit;
            number /= 10;
        }
        return sum;
    }
}
