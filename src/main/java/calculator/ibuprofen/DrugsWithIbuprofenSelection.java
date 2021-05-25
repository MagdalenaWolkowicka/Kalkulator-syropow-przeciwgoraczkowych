package calculator.ibuprofen;

import java.util.Scanner;

public class DrugsWithIbuprofenSelection {

    private boolean exitDrugsWithIbuprofenMenu = false;

    private IbuprofenCalculations ibuprofenCalculations = new IbuprofenCalculations();

    public void selectDrugWithIbuprofen() {
        System.out.println("\nNazwa podawanego leku to: ");
        DrugsWithIbuprofenMenu drugsWithIbuprofenMenu = new DrugsWithIbuprofenMenu();
        while (!exitDrugsWithIbuprofenMenu) {
            System.out.println(drugsWithIbuprofenMenu.getIbuprofenMenuOptionsToPrint());
            actionIbuprofenMenu();
        }
    }

    private void actionIbuprofenMenu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nWybierz lek:");
        String option = scanner.next();
        switch (option) {
            case "1":
            case "3":
            case "5":
            case "7":
            case "9":
            case "10":
            case "12":
            case "13":
            case "16":
            case "19":
            case "20":
              ibuprofenCalculations.calculateIbuprofenSingleDose(40);
              ibuprofenCalculations.calculateIbuprofenMaxDailyDose();
              break;
            case "2":
            case "4":
            case "6":
            case "8":
            case "11":
            case "14":
            case "15":
            case "17":
            case "18":
                ibuprofenCalculations.calculateIbuprofenSingleDose(20);
                ibuprofenCalculations.calculateIbuprofenMaxDailyDose();
                break;
            case"0":
                exitDrugsWithIbuprofenMenu = true;
                break;
            default:
                System.out.println("Błędny wybór\n");
        }
    }
}
