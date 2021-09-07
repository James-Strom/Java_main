package academy.learnprogramming;

public class LargestPrime {
    public static int getLargestPrime(int number) {
        if(number <= 1) return -1;

        for (int primeFactor = 2;primeFactor < number;primeFactor++) {
            // A prime number can only go into itself and 1
            if (number%primeFactor ==0) {
                number /= primeFactor;
                //below code added due to 45 not working, reason when 45 divides into 3 = 15,
                // 15 can also go into 3. so the factor 3 must be rerun to ensure it cannot go into the number again and if it can,
                //will repeat the process multiple times.
                primeFactor--;
            }
        }
        return number;

    }
}
