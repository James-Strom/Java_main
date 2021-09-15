package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

        Car test1 = new Car("Mercedes", "Normal", 4, 5, 5, false);
        System.out.println(test1.getSize());

        Porsche test2 = new Porsche("911", "Sport", 5, 4, 8, true, true);
        System.out.println(test2.getCurrentDirection());

        Outlander test3 = new Outlander (36);
        test3.accelerate(10);
        test3.accelerate(10);
        test3.accelerate(10);
        test3.steer(30);
        test3.accelerate(-30);


    }
}