package commandPattern;

public class LightsOn implements Command {
    private Lights light;

    public LightsOn(Lights light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.lightsOn();
    }
}
