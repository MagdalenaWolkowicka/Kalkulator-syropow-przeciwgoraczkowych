package registration;

import registration.registrationFunctions.*;

import java.util.Scanner;

public class Registration {

    private boolean exitRegistration = false;

    private MenuRegistration menuRegistration = new MenuRegistration();
    private TimeSaver timeSaver = new TimeSaver();
    private InfoShower infoShower = new InfoShower();
    private TableDropper tableDropper = new TableDropper();
    private InfoUpdater infoUpdater = new InfoUpdater();
    private Remover remover = new Remover();

    public void startRegistration() {
        System.out.println("----------------------------------");
        System.out.println("| Rejestr godzin podawania leków |");
        System.out.println("----------------------------------");
        exitRegistration = false;
        while (!exitRegistration) {
            System.out.println(menuRegistration.getRegistrationMenuOptionsToPrint());
            actionMenu();
        }
    }

    private void actionMenu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nWybierz opcję:");
        String option = scanner.next();
        switch (option) {
            case "1":
                timeSaver.save();
                break;
            case "2":
                infoShower.showInfo();
                break;
            case "3":
                infoUpdater.updateMedicine();
                break;
            case "4":
                infoUpdater.updateTime();
                break;
            case "5":
                remover.delete();
                break;
            case "6":
                tableDropper.dropTheTableRegistration();
                break;
            case "0":
                exitRegistration = true;
                break;
            default:
                System.out.println("Błędny wybór\n");
        }
    }
}
