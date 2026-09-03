package commandPattern;

public class TellyOn implements Command {
    private Telly tv;

    public TellyOn(Telly tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
        tv.powerOn();
    }
}
