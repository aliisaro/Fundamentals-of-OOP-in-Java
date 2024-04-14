package Module3_AdvancedJavaConcepts.Part2.Task3_ElectricVehicles;

interface Vehicle {
    void start();
    void stop();
    void info();
}

interface ElectricVehicle {
    void charge();
}

abstract class AbstractVehicle implements Vehicle, ElectricVehicle {
    protected String type;

    public AbstractVehicle(String type) {
        this.type = type;
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
}
