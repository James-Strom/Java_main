package academy.learnprogramming;

public class Vehicle {

    private String steering;
    private String brakes;

    public Vehicle(String steering, String brakes) {
        this.steering = steering;
        this.brakes = brakes;
    }

    public String getSteering() {
        return steering;
    }

    public void setSteering(String steering) {
        this.steering = steering;
    }

    public String getBrakes() {
        return brakes;
    }

    public void setBrakes(String brakes) {
        this.brakes = brakes;
    }
}
