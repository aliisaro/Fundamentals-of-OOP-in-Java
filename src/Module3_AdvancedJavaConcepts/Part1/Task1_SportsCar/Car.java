package Module3_AdvancedJavaConcepts.Part1.Task1_SportsCar;

public class Car {
    private double speed;
    private double gasolineLevel;
    private String typeName;
    private int tankCapacity;
    private int topSpeed;

    public Car(String typeName, int tankCapacity, int topSpeed) {
        this.typeName = typeName;
        this.tankCapacity = tankCapacity;
        this.topSpeed = topSpeed;
        speed = 0;
        gasolineLevel = 0;
    }

    public void accelerate() {
        if (gasolineLevel > 0 && speed < topSpeed) {
            speed += 5;
            gasolineLevel -= 5;
            if (speed > topSpeed) {
                speed = topSpeed;
            }
            if (gasolineLevel < 0) {
                gasolineLevel = 0;
            }
            System.out.println("\nAccelerating car...\n Speed: " + getSpeed() + "\n Gasoline level: " + getGasolineLevel());
        }
    }

    public void decelerate() {
        if (gasolineLevel > 0 && speed > 0) {
            speed -= 5;
            gasolineLevel -= 5;
            if (speed < 0) {
                speed = 0;
            }
            if (gasolineLevel < 0) {
                gasolineLevel = 0;
            }
            System.out.println("\nDecelerating car...\n Speed: " + getSpeed() + "\n Gasoline level: " + getGasolineLevel());
        }
    }

    public void fillTank() {
        gasolineLevel = tankCapacity;
    }
    public double getSpeed() {
        return speed;
    }
    public int getTopSpeed() {
        return topSpeed;
    }
    public double getGasolineLevel() {
        return gasolineLevel;
    }
    public void setGasolineLevel(double gasolineLevel) {
        this.gasolineLevel = gasolineLevel;
    }
    public void setSpeed(double speed) {
        this.speed = speed;
    }
}

class SportsCar extends Car {
    public SportsCar(String typeName, int tankCapacity, int topSpeed) {
        super(typeName, tankCapacity, topSpeed);
    }
    @Override
    public void accelerate() {
        if (getGasolineLevel() > 0 && getSpeed() < getTopSpeed()) {
            setSpeed(getSpeed() + 10);
            setGasolineLevel(getGasolineLevel() - 10);
            if (getSpeed() > getTopSpeed()) {
                setSpeed(getTopSpeed());
            }
            System.out.println("\nAccelerating sports car...\n Speed: " + getSpeed() + "\n Gasoline level: " + getGasolineLevel());
        }
    }

    @Override
    public void decelerate() {
        if (getGasolineLevel() > 0 && getSpeed() > 0) {
            setSpeed(getSpeed() - 10);
            setGasolineLevel(getGasolineLevel() - 10);
            if (getSpeed() < 0) {
                setSpeed(0);
            }
            if (getGasolineLevel() < 0) {
                setGasolineLevel(0);
            }
            System.out.println("\nDecelerating sports car...\n Speed: " + getSpeed() + "\n Gasoline level: " + getGasolineLevel());
        }
    }
}


