package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

        Car test1 = new Car("Right-side","Normal", 4, 100);
        System.out.println(test1.getSpeed());

	    Porsche test2 = new Porsche("Right-side", "ABS",4,100,50);
        System.out.println(test2.getTurbo());
        System.out.println(test2.getSpeed());
        test2.horsePower(100);
    }
}
