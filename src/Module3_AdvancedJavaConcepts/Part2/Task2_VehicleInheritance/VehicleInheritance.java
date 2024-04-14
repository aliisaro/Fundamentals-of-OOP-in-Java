package Module3_AdvancedJavaConcepts.Part2.Task2_VehicleInheritance;

interface Vehicle {
    void start();
    void stop();
    void info();
}

abstract class AbstractVehicle implements Vehicle {
    protected String type;
    protected String fuel;
    protected boolean tankFull;

    public AbstractVehicle(String type, String fuel, boolean tankFull) {
        this.type = type;
        this.fuel = fuel;
        this.tankFull = tankFull;
    }

    @Override
    public void start() { System.out.println(this.type + " is starting...");}

    @Override
    public void stop() {
        System.out.println(this.type + " is stopping...");
    }

    public void info() {}

    public void checkTank() {
        if (!this.tankFull) {
            System.out.println("Tank of vehicle '" + this.type + "' is empty.");
        } else {
            System.out.println("Tank of vehicle '" + this.type + "' is full.");
        }
    }
    public void fillTank() {
        System.out.println("Filling tank of '" + this.type + "'...");
        this.tankFull = true;
    }
}

class Car extends AbstractVehicle {
    private String color;
    public Car(String type, String fuel, boolean tankFull, String color) {
        super(type, fuel, tankFull);
        this.color = color;
    }

    @Override
    public void info() {
        System.out.println("Type: " + this.type + "\nFuel: " + this.fuel + "\nColor: " + this.color + "\n");
    }
}

class Motorcycle extends AbstractVehicle {
    private String color;
    public Motorcycle(String type, String fuel, boolean tankFull, String color) {
        super(type, fuel, tankFull);
        this.color = color;
    }
    @Override
    public void info() {
        System.out.println("Type: " + this.type + "\nFuel: " + this.fuel + "\nColor: " + this.color + "\n");
    }
}

class Bus extends AbstractVehicle {
    private String passengers;
    public Bus(String type, String fuel, boolean tankFull, String passengers) {
        super(type, fuel, tankFull);
        this.passengers = passengers;
    }
    @Override
    public void info() {
        System.out.println("Type: " + this.type + "\nFuel: " + this.fuel + "\nPassengers: " + this.passengers + "\n");
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

        Car car = new Car("Car", "Petrol", false, "Red");
        Motorcycle motorcycle = new Motorcycle("Motorcycle", "Gasoline", true, "Black");
        Bus bus = new Bus("Bus", "Diesel", true, "40");

        printVehicle(car);
        printVehicle(motorcycle);
        printVehicle(bus);

        car.checkTank();
        car.fillTank();
        car.checkTank();
    }
}