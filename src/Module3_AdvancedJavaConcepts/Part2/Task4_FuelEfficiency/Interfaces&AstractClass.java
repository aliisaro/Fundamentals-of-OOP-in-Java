package Module3_AdvancedJavaConcepts.Part2.Task4_FuelEfficiency;

interface Vehicle {
    void start();
    void stop();
    void info();
    void calculateFuelEfficiency(double distance, double consumption);
}

interface ElectricVehicle {
    void charge();
}

abstract class AbstractVehicle implements Vehicle, ElectricVehicle {
    protected String type;
    protected double fuelEfficiency;

    public AbstractVehicle(String type, double fuelEfficiency) {
        this.type = type;
        this.fuelEfficiency = fuelEfficiency;
    }

    @Override
    public void start() { System.out.println(this.type + " is starting...");}

    @Override
    public void stop() {
        System.out.println(this.type + " is stopping...");
    }
    @Override
    public void charge() {
        System.out.println("Vehicle '" + this.type + "' is not possible to charge.\n");
    }

    public void info() {}

    @Override
    public void calculateFuelEfficiency(double distance, double consumption) {
        this.fuelEfficiency = consumption/distance;
        System.out.println("The fuel efficiency of vehicle '" + this.type + "': " + this.fuelEfficiency + " l/km");
    }
}
