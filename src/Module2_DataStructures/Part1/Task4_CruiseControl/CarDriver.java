package Module2_DataStructures.Part1.Task4_CruiseControl;

class CarDriver {
    public static void main(String[] args) {
        CruiseControl myCar;

        myCar = new CruiseControl("Toyota Corolla", 60, 200, 100, 70);
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
