package Module3_AdvancedJavaConcepts.Part1.Task2_Bus;
public class Driver {
    public static void main(String[] args) {
            Car car = new Car("Toyota Corolla", 1);
            Bus bus = new Bus("Mercedes-Benz Citaro", 0);

            System.out.println("\nInitial amount of passengers in " + bus.getTypeName() + ": " + bus.getCurrentPassengers());
            System.out.println("Initial amount of passengers in " + car.getTypeName() + ": " + car.getCurrentPassengers() + "\n");

            bus.passengerEnter(10);
            bus.passengerExit(7);
            car.passengerEnter(2);
            car.passengerExit(2);

            System.out.println("\nFinal amount of passengers in " + bus.getTypeName() + ": " + bus.getCurrentPassengers());
            System.out.println("Final amount of passengers in " + car.getTypeName() + ": " + car.getCurrentPassengers());
    }
}