package Module3_AdvancedJavaConcepts.Part2.Task4_FuelEfficiency;
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

        Car car = new Car("Car", 0, "Petrol", "Red");
        Motorcycle motorcycle = new Motorcycle("Motorcycle", 0, "Gasoline", "Black");
        Bus bus = new Bus("Bus", 0, "Diesel", "40");

        eCar ecar = new eCar("Electric car", 0, "blue" );
        eMotorcycle emotorcycle = new eMotorcycle("Electric motorcycle", 0, "red");
        eBus ebus = new eBus("Electric Bus", 0, 45);

        printVehicle(car);
        printVehicle(motorcycle);
        printVehicle(bus);

        printVehicle(ecar);
        printVehicle(emotorcycle);
        printVehicle(ebus);

        car.calculateFuelEfficiency(100, 10);
        ecar.calculateFuelEfficiency(100, 20);
    }
}
