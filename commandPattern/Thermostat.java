package commandPattern;

public class Thermostat {
    private int temp;
    
    public Thermostat() {
        temp = 24;
    }

    public void increaseTemp() {
        temp++;
        System.out.println("Temperature increased");
        System.out.println("Temperature: " + temp + "°C");
    }

    public void decreaseTemp() {
        temp--;
        System.out.println("Temperature decreased");
        System.out.println("Temperature: " + temp + "°C");
    }

    public void displayTemp() {
        System.out.println("Temperature: " + temp + "°C");
    }

}
