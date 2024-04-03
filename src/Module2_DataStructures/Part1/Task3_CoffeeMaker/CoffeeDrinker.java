package Module2_DataStructures.Part1.Task3_CoffeeMaker;

import java.util.Random;

class CoffeeDrinker {
    public static void main(String[] args) {
        CoffeeMaker myCoffeeMaker = new CoffeeMaker();

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
