package Module2_DataStructures.Part1.Task4_CruiseControl;

public class CruiseControl {
    private double speed;
    private double topSpeed;
    private double gasolineLevel;
    private String typeName;
    private int tankCapacity;
    private boolean cruiseControl;
    private double maxSpeed;
    private double minSpeed;
    private double targetSpeed;

    public CruiseControl(String typeName) {
        this.typeName = typeName;
        speed = 0;
        gasolineLevel = 0;
        cruiseControl = false;
    }

    public CruiseControl(String typeName, int tankCapacity, double topSpeed, double maxSpeed, double minSpeed) {
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

