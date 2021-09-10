package academy.learnprogramming;

public class Porsche extends Car{

    private int turbo;

    public Porsche(String steering, String brakes, int wheels, int speed, int turbo) {
        super(steering, brakes, wheels, speed);
        this.turbo = turbo;
    }

    public void horsePower(int speed) {
        speed = speed + turbo;
        speed = speed;
        System.out.println("Porsche speed is " + speed);
    }

    public int getTurbo() {
        return turbo;
    }

    public void setTurbo(int turbo) {
        this.turbo = turbo;
    }
}
