public class main {
    public static void main(String[] args) {
        boolean ans = DecimalComparator.areEqualByThreeDecimalPlaces(3.175, 3.175);
        System.out.println(ans);
        ans = DecimalComparator.areEqualByThreeDecimalPlaces(3.176, 3.175);
        System.out.println(ans);
    }
}
