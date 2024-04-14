package Module3_AdvancedJavaConcepts.Part2.Task3_ElectricVehicles;

class VehicleDemo {
    private static void printVehicle(Vehicle vehicle) {
        vehicle.start();
        vehicle.stop();
        vehicle.info();

        if (vehicle instanceof ElectricVehicle) {
            ((ElectricVehicle) vehicle).charge();
        }
    }
    public static void main(String[] args) {
        System.out.println("\nVehicle Demonstration:\n");

        Car car = new Car("Car", "Petrol", "Red");
        Motorcycle motorcycle = new Motorcycle("Motorcycle", "Gasoline", "Black");
        Bus bus = new Bus("Bus", "Diesel", "40");

        eCar ecar = new eCar("Electric car", "blue" );
        eMotorcycle emotorcycle = new eMotorcycle("Electric motorcycle", "red");
        eBus ebus = new eBus("Electric Bus", 45);

        printVehicle(car);
        printVehicle(motorcycle);
        printVehicle(bus);

        printVehicle(ecar);
        printVehicle(emotorcycle);
        printVehicle(ebus);
    }
}
