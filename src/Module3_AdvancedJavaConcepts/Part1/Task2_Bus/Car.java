package Module3_AdvancedJavaConcepts.Part1.Task2_Bus;

public class Car {
    private String typeName;
    private int currentPassengers;

    public Car(String typeName, int currentPassengers) {
        this.typeName = typeName;
        this.currentPassengers = currentPassengers;
    }

    public String getTypeName() {
        return typeName;
    }

    public int getCurrentPassengers() {
        return currentPassengers;
    }

    public void setCurrentPassengers(int currentPassengers) {
        this.currentPassengers = currentPassengers;
    }

    public void passengerEnter(int passengers) {
        this.currentPassengers = getCurrentPassengers() + passengers;
        System.out.println(passengers + " passengers ENTER car: " + getTypeName() + ".");
    }

    public void passengerExit(int passengers) {
        setCurrentPassengers(getCurrentPassengers() - passengers);
        System.out.println(passengers + " passengers EXIT car: " + getTypeName() + ".");
    }
}

    class Bus extends Car {
        public Bus(String typeName, int currentPassengers) {
            super(typeName, currentPassengers);
        }

        @Override
        public void passengerEnter(int passengers) {
            setCurrentPassengers(getCurrentPassengers() + passengers);
            System.out.println(passengers + " passengers ENTER bus: " + getTypeName() + ".");
        }

        @Override
        public void passengerExit(int passengers) {
            setCurrentPassengers(getCurrentPassengers() - passengers);
            System.out.println(passengers + " passengers EXIT bus: " + getTypeName() + ".");
        }
    }
