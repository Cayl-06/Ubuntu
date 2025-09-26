package inheritance3;
public interface Vehicle {
    void accelerate();
    void decelerate();
}

// Bicycle class
public class Bicycle implements Vehicle {
    @Override
    public void accelerate() {
        System.out.println("Bicycle accelerates by pedaling faster.");
    }

    @Override
    public void decelerate() {
        System.out.println("Bicycle decelerates by applying brake.");
    }
}

// Car class
public class Car implements Vehicle {
    @Override
    public void accelerate() {
        System.out.println("Car accelerates by increasing the engine speed.");
    }

    @Override
    public void decelerate() {
        System.out.println("Car decelerates by applying brakes.");
    }
}

// Road class
public class Road {
    public void drive(Vehicle vehicle) {
        System.out.println("Vehicle on the road:");
        vehicle.accelerate();
        vehicle.decelerate();
    }
}
