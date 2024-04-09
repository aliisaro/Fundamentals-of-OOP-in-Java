package Module3_AdvancedJavaConcepts.Part1.Task1_SportsCar;

public class CarDriver {
    public static void main(String[] args) {
        Car myCar = new Car("Toyota Corolla", 60, 200);
        SportsCar sportsCar = new SportsCar("Ferrari", 80, 230);

        myCar.fillTank();
        sportsCar.fillTank();

        for (int i = 0; i < 6; i++) {
            myCar.accelerate();
            System.out.println("\nMy car speed: " + myCar.getSpeed());
            System.out.println("My car gasoline level: " + myCar.getGasolineLevel());
            sportsCar.accelerate();
            System.out.println("Sports car speed: " + sportsCar.getSpeed());
            System.out.println("Sports car gasoline level: " + sportsCar.getGasolineLevel());
        }

        for (int i = 0; i < 6; i++) {
            myCar.decelerate();
            System.out.println("\nMy car speed: " + myCar.getSpeed());
            System.out.println("My car gasoline level: " + myCar.getGasolineLevel());

            sportsCar.decelerate();
            System.out.println("Sports car speed: " + sportsCar.getSpeed());
            System.out.println("Sports car gasoline level: " + sportsCar.getGasolineLevel());
        }
    }
}