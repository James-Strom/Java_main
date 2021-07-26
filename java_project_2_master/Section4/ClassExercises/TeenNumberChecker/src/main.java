public class main {
    public static void main(String[] args) {
        boolean check = TeenNumberChecker.isTeen(20);
        System.out.println(check);
        check = TeenNumberChecker.isTeen(13);
        System.out.println(check);
        check = TeenNumberChecker.hasTeen(12,20,25);
        System.out.println(check);
        check = TeenNumberChecker.hasTeen(13,20,25);
        System.out.println(check);
    }
}
