package commandPattern;

public class SpkVoice implements Command {
    private SmartSpeaker spk;

    public SpkVoice(SmartSpeaker spk) {
        this.spk = spk;
    }

    @Override
    public void execute() {
        spk.voiceCommand();
    }
}
