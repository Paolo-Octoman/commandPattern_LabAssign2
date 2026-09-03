package commandPattern;

public class Lights {
    private boolean power;
    private int brightness;
    
    public Lights() {
        power = false;
        brightness = 80;
    }

    public void lightsOn() {
        power = true;
        System.out.println("Lights turned on.");
        System.out.println("Brightness: " + brightness);
    }

    public void lightsOff() {
        power = false;
        System.out.println("Lights turned off.");
    }

    public void increaseBright() {
        if (!power) {
            System.out.println("Please turn on the lights to adjust brightness.");
            return;
        }

        if (brightness < 100) {
            brightness += 10;
            System.out.println("Brightness increased.");
            System.out.println("Brightness: " + brightness);
        } else {
            System.out.println("Max brightness reached");
        }
    }

    public void decreaseBright() {
        if (!power) {
            System.out.println("Please turn on the lights to adjust brightness.");
            return;
        }

        if (brightness > 0) {
            brightness -= 10;
            System.out.println("Brightness decreased.");
            System.out.println("Brightness: " + brightness);
        } else {
            System.out.println("Min brightness reached");
        }
    }
}
