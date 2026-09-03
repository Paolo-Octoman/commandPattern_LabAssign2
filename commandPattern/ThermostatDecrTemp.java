package commandPattern;

public class ThermostatDecrTemp implements Command {
    private Thermostat thermo;

    public ThermostatDecrTemp(Thermostat thermo) {
        this.thermo = thermo;
    }

    @Override
    public void execute() {
        thermo.decreaseTemp();
    }
}