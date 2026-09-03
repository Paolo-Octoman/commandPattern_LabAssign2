package commandPattern;

public class Telly {
    private boolean power;
    private int vol;

    public Telly() {
        power = false;
        vol = 37;
    }

    public void powerOn() {
        power = true;
        System.out.println("SMART TV");
        System.out.println("Source: Digital Air");
        System.out.println("Current Channel: 25.01 - NET25 HD");
        System.out.println("Volume: " + vol);
    }

    public void powerOff() {
        power = false;
        System.out.println("Smart TV is switched off");
    }

    public void tellyVolUp() {
        if (!power) {
            System.out.println("Please power on this Smart TV to adjust the volume.");
            return;
        }

        if (vol < 100) {
            vol++;
            System.out.println("Volume increased.");
            System.out.println("Volume: " + vol);
        } else {
            System.out.println("Max volume reached");
        }
    }

    public void tellyVolDown() {
        if (!power) {
            System.out.println("Please power on this Smart TV to adjust the volume.");
            return;
        }

        if (vol > 0) {
            vol--;
            System.out.println("Volume decreased.");
            System.out.println("Volume: " + vol);
        } else {
            System.out.println("Min volume reached");
        }
    }
}
