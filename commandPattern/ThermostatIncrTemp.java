package commandPattern;

public class ThermostatIncrTemp implements Command {
    private Thermostat thermo;

    public ThermostatIncrTemp(Thermostat thermo) {
        this.thermo = thermo;
    }

    @Override
    public void execute() {
        thermo.increaseTemp();
    }
}