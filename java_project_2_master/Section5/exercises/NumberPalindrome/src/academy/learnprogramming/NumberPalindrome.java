package academy.learnprogramming;

public class NumberPalindrome {

    public static boolean isPalindrome(int number) {
        int numReverse = 0;
        int lastDigit;
        int num = number;
        while (num != 0) {
            lastDigit = 0;
            lastDigit = num % 10;
            numReverse *= 10;
            numReverse += lastDigit;
            num /= 10;
        }
        if (numReverse == number) {
            return true;
        } else {
            return false;
        }
    }
}

