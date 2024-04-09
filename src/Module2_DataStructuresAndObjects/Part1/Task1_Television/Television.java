package Module2_DataStructuresAndObjects.Part1.Task1_Television;

public class Television {
    private int channel;
    private boolean isOn;
    public Television() {
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

