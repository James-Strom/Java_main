package academy.learnprogramming;

public class FlourPacker {
    public static boolean canPack(int bigCount, int smallCount, int goal) {
        if (bigCount < 0 || smallCount < 0 || goal < 0) return false;
        int big = 5;
        int total = (big * bigCount) + smallCount;
        if (total < goal) {
            return false;
        } else if (goal == total) {
            return true;
        } else {
            // goal < total therefore there are enough bags
            // issue was big bags since if we need 4kgs a big bag is bigger(5kgs), but bag cannot be split
            // so can the remaining small bags cover the difference
            if (goal % big <= smallCount) {
                return true;
            } else {
                return false;
            }
        }
    }
}
