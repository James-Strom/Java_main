package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        Animal animal = new Animal("Animal", 1,1,5,5);

        Dog newDog = new Dog("German Shepherd", 10,30,4, 1,50,"Short");
        newDog.eat();
        System.out.println(newDog.getName());
        newDog.walk();
        newDog.run();

    }
}
