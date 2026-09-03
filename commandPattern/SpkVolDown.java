package commandPattern;

public class SpkVolDown implements Command {
    private SmartSpeaker spk;

    public SpkVolDown(SmartSpeaker spk) {
        this.spk = spk;
    }

    @Override
    public void execute() {
        spk.spkVolDown();
    }
}
