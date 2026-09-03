package commandPattern;

public class LightsDecrBright implements Command {
    private Lights light;

    public LightsDecrBright(Lights light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.decreaseBright();
    }
}
