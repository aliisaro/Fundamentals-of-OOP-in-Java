package Module3_AdvancedJavaConcepts.Part2.Task4_FuelEfficiency;

class eCar extends AbstractVehicle  {
    private String color;
    public eCar(String type, double fuelEfficiency, String color) {
        super(type, fuelEfficiency);
        this.color = color;
    }
    @Override
    public void info() {
        System.out.println("Type: " + this.type +  "\nColor: " + this.color);
    }
    @Override
    public void charge() {
        System.out.println("Charging '" + this.type + "-...\n");
    }
    @Override
    public void calculateFuelEfficiency(double distance, double consumption) {
        this.fuelEfficiency = consumption/distance;
        System.out.println("The energy efficiency of vehicle '" + this.type + "': " + this.fuelEfficiency + " kWh/km");
    }
}

class eMotorcycle extends AbstractVehicle {
    private String color;
    public eMotorcycle(String type, double fuelEfficiency, String color) {
        super(type, fuelEfficiency);
        this.color = color;
    }
    @Override
    public void info() {
        System.out.println("Type: " + this.type + "\nColor: " + this.color);
    }
    @Override
    public void charge() {
        System.out.println("Charging '" + this.type + "-...\n");
    }
    @Override
    public void calculateFuelEfficiency(double distance, double consumption) {
        this.fuelEfficiency = consumption/distance;
        System.out.println("The energy efficiency of vehicle '" + this.type + "': " + this.fuelEfficiency + " kWh/km");
    }
}

class eBus extends AbstractVehicle {
    private int passengers;
    public eBus(String type, final double fuelEfficiency, int passengers) {
        super(type, fuelEfficiency);
        this.passengers = passengers;
    }
    @Override
    public void info() {
        System.out.println("Type: " + this.type + "\nPassengers: " + this.passengers);
    }
    @Override
    public void charge() {
        System.out.println("Charging '" + this.type + "'...\n");
    }
    @Override
    public void calculateFuelEfficiency(double distance, double consumption) {
        this.fuelEfficiency = consumption/distance;
        System.out.println("The energy efficiency of vehicle '" + this.type + "': " + this.fuelEfficiency + " kWh/km");
    }
}