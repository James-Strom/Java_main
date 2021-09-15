package com.example.mypackage;

class Car {
    private String name;
    private int cylinders;
    private int wheels;
    private boolean engine;

    public Car(String name, int cylinders) {
        this.name = name;
        this.cylinders = cylinders;
        this.wheels = 4;
        this.engine = true;
    }

    public String getName() {
        return name;
    }

    public int getCylinders() {
        return cylinders;
    }

    public String startEngine() {
        return "Default startEngine() ......";
    }

    public String accelerate() {
        return "Default accelerate() called";
    }

    public String brake() {
        return "Default brake() called";
    }
}

class Porsche extends Car {
    public Porsche(String name, int cylinders) {
        super(name, cylinders);
    }

    @Override
    public String startEngine() {
        return "Porsche engine start";
    }

    @Override
    public String accelerate() {
        return "Porsche is speeding up";
    }

    @Override
    public String brake() {
        return "Porsche is slowing down...";
    }
}

    class Mercedes extends Car {
        public Mercedes(String name, int cylinders) {
            super(name, cylinders);
        }

        @Override
        public String startEngine() {
            return "Mercedes engine start";
        }

        @Override
        public String accelerate() {
            return "Mercedes is speeding up";
        }

        @Override
        public String brake() {
            return "Mercedes is slowing down...";
        }
    }

    class BMW extends Car {
        public BMW(String name, int cylinders) {
            super(name, cylinders);
        }

        @Override
        public String startEngine() {
            return "BMW engine start";
        }

        @Override
        public String accelerate() {
            return "BMW is speeding up";
        }

        @Override
        public String brake() {
            return "BMW is slowing down...";
        }
    }


public class Main {

    public static void main(String[] args) {
        Car car = new Car("Default" , 4);
        System.out.println(car.startEngine());
        System.out.println(car.brake());
        System.out.println(car.accelerate());
        System.out.println("\n");

        Porsche porsche = new Porsche("911", 12);
        System.out.println(porsche.getName());
        System.out.println(porsche.getCylinders());
        System.out.println(porsche.startEngine());
        System.out.println(porsche.brake());
        System.out.println(porsche.accelerate());
        System.out.println("\n");

        Mercedes mercedes = new Mercedes("A45 Amg", 8);
        System.out.println(mercedes.getName());
        System.out.println(mercedes.getCylinders());
        System.out.println(mercedes.startEngine());
        System.out.println(mercedes.brake());
        System.out.println(mercedes.accelerate());
        System.out.println("\n");

        BMW bmw = new BMW("I8", 6);
        System.out.println(bmw.getName());
        System.out.println(bmw.getCylinders());
        System.out.println(bmw.startEngine());
        System.out.println(bmw.brake());
        System.out.println(bmw.accelerate());
        System.out.println("\n");
    }
}
