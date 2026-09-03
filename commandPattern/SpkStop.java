package commandPattern;

public class SpkStop implements Command {
    private SmartSpeaker spk;

    public SpkStop(SmartSpeaker spk) {
        this.spk = spk;
    }

    @Override
    public void execute() {
        spk.stop();
    }
}
