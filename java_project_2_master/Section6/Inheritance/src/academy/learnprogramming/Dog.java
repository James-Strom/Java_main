package academy.learnprogramming;

public class Dog extends Animal {

    private int eyes;
    private int legs;
    private int tail;
    private int teeth;
    private String coat;


    public Dog(String name, int size, int weight, int legs, int tail, int teeth, String coat) {
        super(name, 1, 1, size, weight);
        this.eyes = eyes;
        this.teeth = teeth;
        this.legs = legs;
        this.tail = tail;
        this.coat = coat;
    }

    @Override
    public void eat() {
        System.out.println("Dog.eat() called");
        chew();
        super.eat();
    }

    private void chew() {
        System.out.println("Dog.chew() called");

    }

    public void walk() {
        System.out.println("Dog.walk() called");
        super.move(8);
    }

    public void run() {
        System.out.println("Dog.run() called");
        move(25);
    }

    private void moveLegs(int speed) {
        System.out.println("Dog.Legs() called");
    }

    @Override
    public void move(int speed) {
        System.out.println("Dog.move() called");
        moveLegs(speed);
        super.move(speed);
    }
}
