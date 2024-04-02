package Module2_DataStructures.Part1;
import java.util.Random;

public class Task3_CoffeeMaker {
    private int type;
    private int amount;
    private boolean isOn;

    public Task3_CoffeeMaker() {
        type = 0;
        amount = 0;
        isOn = false;
    }

    public void setType(int type) {
        this.type = type;
    }

    public int getType() {
        return type;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }

    public boolean isOn() {
        return isOn;
    }

    public void pressOnOff() {
        isOn = !isOn;
    }
}

class CoffeeDrinker {
    public static void main(String[] args) {
        Task3_CoffeeMaker myCoffeeMaker = new Task3_CoffeeMaker();

        for (int day = 1; day <= 3; day++) {
            System.out.println("Woke up, day " + day);

            myCoffeeMaker.pressOnOff();
            System.out.println("Coffee maker switched on.");

            int random = new Random().nextInt(3) + 1;
            myCoffeeMaker.setType(random);

            if (myCoffeeMaker.getType() == 1) {
                System.out.println("Making 'normal' coffee.");
            } else {
                System.out.println("Making 'espresso'.");
            }

            random = new Random().nextInt(10) + 1;
            myCoffeeMaker.setAmount(random);

            System.out.println((myCoffeeMaker.getAmount()) + " dl of coffee made.");

            myCoffeeMaker.pressOnOff();
            System.out.println("Coffee maker switched off.\n");
        }
    }
}
