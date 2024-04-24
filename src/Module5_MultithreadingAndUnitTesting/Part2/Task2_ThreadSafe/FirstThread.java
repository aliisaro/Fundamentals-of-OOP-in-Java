package Module5_MultithreadingAndUnitTesting.Part2.Task2_ThreadSafe;

public class FirstThread extends Thread {
    private ThreadSafeArray safeArray;

    public FirstThread(ThreadSafeArray safeArray) {
        this.safeArray = safeArray;
    }

    @Override
    public void run() {
        safeArray.addElement("Element 1");
        System.out.println("Added Element 1 by " + Thread.currentThread().getName());
    }
}
