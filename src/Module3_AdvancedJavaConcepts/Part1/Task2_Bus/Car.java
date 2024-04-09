package Module3_AdvancedJavaConcepts.Part1.Task2_Bus;

public class Car {
    private String typeName;
    private int currentPassengers;

    public Car(String typeName, int currentPassengers) {
        this.typeName = typeName;
        this.currentPassengers = currentPassengers;
    }

    public int getCurrentPassengers() {
        return currentPassengers;
    }

    public void setCurrentPassengers(int currentPassengers) {
        System.out.println("\nCurrent amount of passengers: " + getCurrentPassengers());
        this.currentPassengers = currentPassengers;
    }
}

class Bus extends Car {
    public Bus(String typeName, int currentPassengers) {
        super(typeName, currentPassengers);
    }

    public void passengerEnter(int passengers) {
        setCurrentPassengers(getCurrentPassengers() + passengers);
        System.out.println(passengers + " passengers have entered.");
    }

    public void passengerExit(int passengers) {
        setCurrentPassengers(getCurrentPassengers() - passengers);
        System.out.println(passengers + " passengers have exited.");
    }
}


