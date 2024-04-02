package Module2_DataStructures.Part1;

public class Task2_ModifiedCar {
    private double speed;
    private double gasolineLevel;
    private String typeName;
    private int tankCapacity;
    private int topSpeed;

    public Task2_ModifiedCar(String typeName) {
        this.typeName = typeName;
        speed = 0;
        gasolineLevel = 0;
    }

    public Task2_ModifiedCar(String typeName, int tankCapacity, int topSpeed) {
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

class CarDriver {

    public static void main(String[] args) {
        Task2_ModifiedCar myCar;

        myCar = new Task2_ModifiedCar("Toyota Corolla", 60, 200);
        myCar.fillTank();

        for (int i = 0; i < 6; i++) {
            myCar.accelerate();
            System.out.println(myCar.getTypeName() + ": speed is " + myCar.getSpeed() + " km/h");
        }

        while (myCar.getSpeed() > 0) {
            myCar.decelerate(15);
            System.out.println(myCar.getTypeName() + ": speed is " + myCar.getSpeed() + " km/h");
        }
    }
}
