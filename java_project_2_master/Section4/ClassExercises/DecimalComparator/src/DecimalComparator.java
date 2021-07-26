public class DecimalComparator {
    public static boolean areEqualByThreeDecimalPlaces (double num1, double num2) {
        int numCheck1 = (int)(num1 * 1000);
        int numCheck2 = (int)(num2 * 1000);
        if(numCheck1 - numCheck2 == 0) {
            return true;
        } else {
            return false;
        }

    }
}
