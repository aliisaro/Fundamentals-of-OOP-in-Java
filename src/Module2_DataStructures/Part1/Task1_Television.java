package Module2_DataStructures.Part1;

public class Task1_Television {
    private int channel;
    private boolean isOn;
    public Task1_Television() {
        channel = 1;
        isOn = true;
    }

    public void setChannel(int channel) {
        this.channel = channel;
    }

    public int getChannel() {
        return channel;
    }

    public boolean isOn() {
        return isOn;
    }

    public void pressOnOff() {
        isOn = !isOn;
    }
}

class TelevisionViewer {
    public static void main(String[] args) {
        Task1_Television myTV = new Task1_Television();

        myTV.setChannel(1);

        for (int day = 1; day <= 10; day++) {
            System.out.println("Woke up, day " + day);

            boolean tired = false;

            if (!myTV.isOn())
                myTV.pressOnOff();

            while (!tired) {
                System.out.println("Watching channel " + myTV.getChannel());
                if (myTV.getChannel() == 10) {
                    myTV.setChannel(0);
                }

                myTV.setChannel(myTV.getChannel() + 1);
                if (myTV.getChannel() % 4 == 0)
                    tired = true;
            }

            myTV.pressOnOff();

            System.out.println("Falling asleep");
        }
    }
}