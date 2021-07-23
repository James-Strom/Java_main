public class main {
    public static void main(String[] args) {
        BarkingDog.shouldWakeUp(true, 1);
        BarkingDog.shouldWakeUp(false, 6);
        BarkingDog.shouldWakeUp(true, 10);
        System.out.println(BarkingDog.shouldWakeUp(true,10));
    }
}
