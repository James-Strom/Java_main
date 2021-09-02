package academy.learnprogramming;

public class SumOddRange {

    public static boolean isOdd(int number) {
        if (number%2==1) {
            return true;
        } else {
            return false;
        }
    }

    public static int sumOdd (int start, int end) {

        int sumTotal = 0;

        if (start < 1 || end < start) {
            return -1;
        }

        for (int i = start; i <= end; i++) {
            if (isOdd(i)) {
                sumTotal += i;
            }
        }
        return sumTotal;
    }
}
