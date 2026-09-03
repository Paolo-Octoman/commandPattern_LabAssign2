package commandPattern;

public class TellyVolDown implements Command {
    private Telly tv;

    public TellyVolDown(Telly tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
        tv.tellyVolDown();
    }
}
