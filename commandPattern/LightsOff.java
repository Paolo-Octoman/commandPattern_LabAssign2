package commandPattern;

public class LightsOff implements Command {
    private Lights light;

    public LightsOff(Lights light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.lightsOff();
    }
}
