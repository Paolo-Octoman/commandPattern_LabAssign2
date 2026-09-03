package commandPattern;

public class SpkVolUp implements Command {
    private SmartSpeaker spk;

    public SpkVolUp(SmartSpeaker spk) {
        this.spk = spk;
    }

    @Override
    public void execute() {
        spk.spkVolUp();
    }
}
