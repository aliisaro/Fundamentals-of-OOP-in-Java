package Module2_DataStructures.Part1;

public class Task4_CruiseControl {
    private double speed;
    private double topSpeed;
    private double gasolineLevel;
    private String typeName;
    private int tankCapacity;
    private boolean cruiseControl;
    private double maxSpeed;
    private double minSpeed;
    private double targetSpeed;

    public Task4_CruiseControl(String typeName) {
        this.typeName = typeName;
        speed = 0;
        gasolineLevel = 0;
        cruiseControl = false;
    }

    public Task4_CruiseControl(String typeName, int tankCapacity, double topSpeed, double maxSpeed, double minSpeed) {
        this(typeName);
        this.tankCapacity = tankCapacity;
        this.topSpeed = topSpeed;
        this.maxSpeed = maxSpeed;
        this.minSpeed = minSpeed;
    }

    public void accelerate() {
        if (gasolineLevel > 0) {
            speed += 10; // Default acceleration
            if (cruiseControl && speed < targetSpeed && speed < maxSpeed) {
                speed += 10; // Adjust towards target speed if cruise control is on
            }
            // Check if reaching target speed is not possible
            if (cruiseControl && speed >= maxSpeed) {
                System.out.println("Warning: Target speed cannot be reached. Cruise control turned off.");
                cruiseControl = false;
            }
        } else {
            speed = 0;
        }
    }

    void decelerate(int amount) {
        if (gasolineLevel > 0) {
            if (cruiseControl && speed > targetSpeed && speed > minSpeed) {
                speed = Math.max(minSpeed, speed - amount); // Adjust towards target speed if cruise control is on
            } else {
                speed = Math.max(0, speed - amount); // Default deceleration
            }
            // Check if reaching target speed is not possible
            if (cruiseControl && speed <= minSpeed) {
                System.out.println("Warning: Target speed cannot be reached. Cruise control turned off.");
                cruiseControl = false;
            }
        } else {
            speed = 0;
        }
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

    public void setTargetSpeed(double targetSpeed) {
        this.targetSpeed = targetSpeed;
    }

    double getTargetSpeed() {
        return targetSpeed;
    }

    boolean isCruiseControlOn() {
        return cruiseControl;
    }

    public void toggleCruiseControl() {
        cruiseControl = !cruiseControl;
    }
}

class CarDriverr {
    public static void main(String[] args) {
        Task4_CruiseControl myCar;

        myCar = new Task4_CruiseControl("Toyota Corolla", 60, 200, 100, 70);
        myCar.fillTank();
        myCar.setTargetSpeed(80);
        myCar.toggleCruiseControl();

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
