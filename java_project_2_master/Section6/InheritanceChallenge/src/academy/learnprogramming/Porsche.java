package academy.learnprogramming;

public class Porsche extends Car{

    private boolean turbo;

    public Porsche(String name, String size, int wheels, int doors, int gears, boolean isManual, boolean turbo) {
        super("Porsche", "2", 4, 2, 6, false);
        this.turbo = turbo;
    }

    public void turboSpeed(int speed) {
        if(turbo) {
            System.out.println("This Porsche has turbo: " + this.turbo);
        } else {
            System.out.println("This Porsche has turbo: " + this.turbo);
        }
    }

    public boolean isTurbo() {
        return turbo;
    }

    public void setTurbo(boolean turbo) {
        this.turbo = turbo;
    }
}
