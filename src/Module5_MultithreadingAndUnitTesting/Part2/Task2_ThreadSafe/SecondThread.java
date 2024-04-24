package Module5_MultithreadingAndUnitTesting.Part2.Task2_ThreadSafe;

public class SecondThread extends Thread {
    private ThreadSafeArray safeArray;

    public SecondThread(ThreadSafeArray safeArray) {
        this.safeArray = safeArray;
    }

    @Override
    public void run() {
        safeArray.removeElement("Element 1");
        System.out.println("Removed Element 1 by " + Thread.currentThread().getName());
    }
}
