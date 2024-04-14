package Module3_AdvancedJavaConcepts.Part2.Task1_VehicleInterface;

interface Vehicle {
    void start();
    void stop();
    void info();

}

class Car implements Vehicle {
    @Override
    public void start() {
        System.out.println("Car is starting...");
    }
    @Override
    public void stop() {
        System.out.println("Car is stopping...");
    }
    @Override
    public void info() {
        System.out.println("Type: Car \nFuel: Petrol \nColor: Red\n");
    }
}

class Motorcycle implements Vehicle {
    @Override
    public void start() {
        System.out.println("Motorcyle is starting...");
    }
    @Override
    public void stop() {
        System.out.println("Motorcyle is stopping...");
    }
    @Override
    public void info() {
        System.out.println("Type: Motorcycle \nFuel: Gasoline \nColor:Black\n");
    }
}

class Bus implements Vehicle {
    @Override
    public void start() {
        System.out.println("Bus is starting...");
    }
    @Override
    public void stop() {
        System.out.println("Bus is stopping...");
    }
    @Override
    public void info() {
        System.out.println("Type: Bus \nFuel: Diesel \nCapacity: 40 passengers\n");
    }
}
class VehicleDemo {
    private static void printVehicle(Vehicle vehicle) {
        vehicle.start();
        vehicle.stop();
        vehicle.info();
    }
    public static void main(String[] args) {
        System.out.println("\nVehicle Demonstration:\n");

        printVehicle(new Car());
        printVehicle(new Motorcycle());
        printVehicle(new Bus());
    }
}





