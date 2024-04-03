package Module2_DataStructures.Part1.Task2_ModifiedCar;

public class Car {
    private double speed;
    private double gasolineLevel;
    private String typeName;
    private int tankCapacity;
    private int topSpeed;

    public Car(String typeName) {
        this.typeName = typeName;
        speed = 0;
        gasolineLevel = 0;
    }

    public Car(String typeName, int tankCapacity, int topSpeed) {
        this(typeName);
        this.tankCapacity = tankCapacity;
        this.topSpeed = topSpeed;
    }

    public void accelerate() {
        if (gasolineLevel > 0)
            speed += 10;
        else
            speed = 0;
    }
    void decelerate(int amount) {
        if (gasolineLevel > 0) {
            if (amount > 0)
                speed = Math.max(0, speed - amount);
        } else
            speed = 0;
    }
    double getSpeed() {
        return speed;
    }
    String getTypeName() {
        return typeName;
    }
    void fillTank() {
        gasolineLevel = tankCapacity;
    }
    double getGasolineLevel() {
        return gasolineLevel;
    }
}

