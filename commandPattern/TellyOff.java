package commandPattern;

public class TellyOff implements Command {
    private Telly tv;

    public TellyOff(Telly tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
        tv.powerOff();
    }
}
