package commandPattern;

public class TellyVolUp implements Command {
    private Telly tv;

    public TellyVolUp(Telly tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
        tv.tellyVolUp();
    }
}
