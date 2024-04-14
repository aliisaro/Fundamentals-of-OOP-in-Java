package Module3_AdvancedJavaConcepts.Part2.Task4_FuelEfficiency;

class Car extends AbstractVehicle {
    private String color;
    private String fuel;
    public Car(String type, double fuelEfficiency, String fuel, String color) {
        super(type, fuelEfficiency);
        this.fuel = fuel;
        this.color = color;
    }
    @Override
    public void info() {
        System.out.println("Type: " + this.type + "\nFuel: " + this.fuel + "\nColor: " + this.color);
    }

}

class Motorcycle extends AbstractVehicle {
    private String color;
    private String fuel;

    public Motorcycle(String type, double fuelEfficiency, String fuel, String color) {
        super(type, fuelEfficiency);
        this.fuel = fuel;
        this.color = color;
    }
    @Override
    public void info() {
        System.out.println("Type: " + this.type + "\nFuel: " + this.fuel + "\nColor: " + this.color);
    }
}

class Bus extends AbstractVehicle {
    private String passengers;
    private String fuel;
    public Bus(String type, double fuelEfficiency,String fuel, String passengers) {
        super(type, fuelEfficiency);
        this.fuel = fuel;
        this.passengers = passengers;
    }
    @Override
    public void info() {
        System.out.println("Type: " + this.type + "\nFuel: " + this.fuel + "\nPassengers: " + this.passengers);
    }
}