class Vehicle {
    void run() {
        System.out.println("Vehicle is running");
    }
}

class Bike extends Vehicle {
    void speed() {
        System.out.println("Bike speed is 60 km/h");
    }
}

class SportsBike extends Bike {
    void brand() {
        System.out.println("Brand is Yamaha");
    }
}

public class MultilevelInheritance {
    public static void main(String[] args) {
        SportsBike sb = new SportsBike();
        sb.run();
        sb.speed();
        sb.brand();
    }
}
