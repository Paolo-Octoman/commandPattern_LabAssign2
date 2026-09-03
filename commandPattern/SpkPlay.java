package commandPattern;

public class SpkPlay implements Command {
    private SmartSpeaker spk;

    public SpkPlay(SmartSpeaker spk) {
        this.spk = spk;
    }

    @Override
    public void execute() {
        spk.playPlaylist();
    }
}
