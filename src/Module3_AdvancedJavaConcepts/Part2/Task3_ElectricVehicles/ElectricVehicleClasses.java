package Module3_AdvancedJavaConcepts.Part2.Task3_ElectricVehicles;

class eCar extends AbstractVehicle  {
    private String color;
    public eCar(String type, String color) {
        super(type);
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
}

class eMotorcycle extends AbstractVehicle {
    private String color;
    public eMotorcycle(String type, String color) {
        super(type);
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
}

class eBus extends AbstractVehicle {
    private int passengers;
    public eBus(String type, int passengers) {
        super(type);
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
}
