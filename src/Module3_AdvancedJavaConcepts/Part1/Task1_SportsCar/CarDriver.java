package Module3_AdvancedJavaConcepts.Part1.Task1_SportsCar;

public class CarDriver {
    public static void main(String[] args) {
        Car myCar = new Car("Toyota Corolla", 60, 200);
        SportsCar sportsCar = new SportsCar("Ferrari", 80, 250);

        myCar.fillTank();
        sportsCar.fillTank();

        myCar.accelerate();
        sportsCar.accelerate();
        myCar.decelerate();
        sportsCar.decelerate();
    }
}