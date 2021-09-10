package academy.learnprogramming;

public class Car extends Vehicle{

    private int wheels;
    private int speed;

    public Car(String steering, String brakes, int wheels, int speed) {
        super(steering, brakes);
        this.wheels = wheels;
        this.speed = speed;
    }

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
        speed = 100;
    }
}
