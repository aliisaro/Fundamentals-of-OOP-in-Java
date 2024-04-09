package Module2_DataStructuresAndObjects.Part1.Task3_CoffeeMaker;

public class CoffeeMaker {
    private int type;
    private int amount;
    private boolean isOn;

    public CoffeeMaker() {
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

