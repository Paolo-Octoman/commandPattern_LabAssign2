package commandPattern;

public class LightsIncrBright implements Command {
    private Lights light;

    public LightsIncrBright(Lights light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.increaseBright();
    }
}
