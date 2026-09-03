package commandPattern;
import java.util.*;

public class MainControlCenter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Telly tv = new Telly();
        Lights light = new Lights();
        Thermostat thermo = new Thermostat();
        SmartSpeaker spk = new SmartSpeaker();

        Hub hub = new Hub();

        int choice;

        do {
            System.out.println("\n=================================\nWelcome to Smart Home Central Hub!\n=================================");
            System.out.println("\n1. TV\n2. Lights\n3. Thermostat\n4. Smart Speaker\n0. Exit");
            System.out.print("Choose a device: ");

            choice = input.nextInt();

            switch(choice) {
                case 1:
                    tvMenu(input, hub, tv);
                    break;
                case 2:
                    lightsMenu(input, hub, light);
                    break;
                case 3:
                    thermostatMenu(input, hub, thermo);
                    break;
                case 4:
                    smartSpeakerMenu(input, hub, spk);
                    break;
                case 0:
                    System.out.println("Exiting Smart Home Central Hub...");
                    break;
                default:
                    System.out.println("Invalid Choice! Select only from 0-4.");
            }
        } while (choice != 0);
        input.close();
    }

public static void tvMenu(Scanner input, Hub hub, Telly tv) {
    System.out.println("You have selected: TV\n\nSelection list:");
    System.out.println("1. Power On\n2. Power Off\n3. Volume Up\n4. Volume Down");
    System.out.print("Choose command: ");
    int choice = input.nextInt();

    switch(choice) {
        case 1:
            hub.setCommand(new TellyOn(tv));
            hub.click();
            break;
        case 2:
            hub.setCommand(new TellyOff(tv));
            hub.click();
            break;
        case 3:
            hub.setCommand(new TellyVolUp(tv));
            hub.click();
            break;
        case 4:
            hub.setCommand(new TellyVolDown(tv));
            hub.click();
            break;
        default:
            System.out.println("Incorrect command!");
    }
}

public static void lightsMenu(Scanner input, Hub hub, Lights light) {
    System.out.println("You have selected: Lights\n\nSelection list:");
    System.out.println("1. Power On\n2. Power Off\n3. Increase Brightness\n4. Decrease Brightness");
    System.out.print("Choose command: ");
    int choice = input.nextInt();

    switch(choice) {
        case 1:
            hub.setCommand(new LightsOn(light));
            hub.click();
            break;
        case 2:
            hub.setCommand(new LightsOff(light));
            hub.click();
            break;
        case 3:
            hub.setCommand(new LightsIncrBright(light));
            hub.click();
            break;
        case 4:
            hub.setCommand(new LightsDecrBright(light));
            hub.click();
            break;
        default:
            System.out.println("Incorrect command!");
    }
}

public static void thermostatMenu(Scanner input, Hub hub, Thermostat thermo) {
    System.out.println("You have selected: Thermostat\n\nSelection list:");
    System.out.println("1. Increase Temperature\n2. Decrease Temperature\n3. Display Temperature");
    System.out.print("Choose command: ");
    int choice = input.nextInt();

    switch(choice) {
        case 1:
            hub.setCommand(new ThermostatIncrTemp(thermo));
            hub.click();
            break;
        case 2:
            hub.setCommand(new ThermostatDecrTemp(thermo));
            hub.click();
            break;
        case 3:
            hub.setCommand(new ThermostatDisp(thermo));
            hub.click();
            break;
        default:
            System.out.println("Incorrect command!");
    }
}

public static void smartSpeakerMenu(Scanner input, Hub hub, SmartSpeaker spk) {
    System.out.println("You have selected: Smart Speaker\n\nSelection list:");
    System.out.println("1. Play\n2. Stop\n3. Volume Up\n4. Volume Down\n5. Voice Command");
    System.out.print("Choose command: ");
    int choice = input.nextInt();

    switch(choice) {
        case 1:
            hub.setCommand(new SpkPlay(spk));
            hub.click();
            break;
        case 2:
            hub.setCommand(new SpkStop(spk));
            hub.click();
            break;
        case 3:
            hub.setCommand(new SpkVolUp(spk));
            hub.click();
            break;
        case 4:
            hub.setCommand(new SpkVolDown(spk));
            hub.click();
            break;
        case 5:
            hub.setCommand(new SpkVoice(spk));
            hub.click();
            break;
        default:
            System.out.println("Incorrect command!");
    }
}
}

