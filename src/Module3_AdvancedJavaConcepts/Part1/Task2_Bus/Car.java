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
        this.currentPassengers +=  passengers;
        System.out.println(passengers + " passengers ENTER car: " + this.typeName + ".");
    }

    public void passengerExit(int passengers) {
        if (passengers > this.currentPassengers) {
            passengers = this.currentPassengers;
            System.out.println(passengers + " passengers EXIT car: " + this.typeName + ".");
            setCurrentPassengers(0);
        } else {
            System.out.println(passengers + " passengers EXIT car: " + this.typeName + ".");
            setCurrentPassengers(this.currentPassengers - passengers);
        }
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
            if (passengers > getCurrentPassengers()) {
                passengers = getCurrentPassengers();
                System.out.println(passengers + " passengers EXIT bus: " + getTypeName() + ".");
                setCurrentPassengers(0);
            } else {
                System.out.println(passengers + " passengers EXIT bus: " + getTypeName() + ".");
                setCurrentPassengers(getCurrentPassengers() - passengers);
            }
        }
    }
