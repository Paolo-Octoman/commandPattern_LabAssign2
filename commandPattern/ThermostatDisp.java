package commandPattern;

public class ThermostatDisp implements Command {
    private Thermostat thermo;

    public ThermostatDisp(Thermostat thermo) {
        this.thermo = thermo;
    }

    @Override
    public void execute() {
        thermo.displayTemp();
    }
}