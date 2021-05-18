package calculator.paracetamol;

import java.util.Scanner;

public class DrugsWithParacetamolSelection {


    private boolean exitDrugsWithParacetamolMenu = false;

    ParacetamolCalculations paracetamolCalculations = new ParacetamolCalculations();

    public void selectDrugWithParacetamol() {
        System.out.println("\nNazwa podawanego leku to: ");
        DrugsWithParacetamolMenu drugsWithParacetamolMenu = new DrugsWithParacetamolMenu();
        while (!exitDrugsWithParacetamolMenu) {
            drugsWithParacetamolMenu.showDrugsWithParacetamolMenu();
            actionParacetamolMenu();
        }
    }


    private void actionParacetamolMenu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nWybierz lek:");
        String option = scanner.next();
        switch (option) {
            case "1":
                paracetamolCalculations.calculateParacetamolSingleDose(40);
                paracetamolCalculations.calculateParacetamolMaxDailyDose(40);
                break;
            case "2":
            case "4":
            case "5":
            case "6":
            case "7":
                paracetamolCalculations.calculateParacetamolSingleDose(24);
                paracetamolCalculations.calculateParacetamolMaxDailyDose(24);
                break;
            case "3":
                paracetamolCalculations.calculateParacetamolSingleDose(50);
                paracetamolCalculations.calculateParacetamolMaxDailyDose(50);
                break;
            case "8":
                paracetamolCalculations.calculateParacetamolSingleDose(100);
                paracetamolCalculations.calculateParacetamolMaxDailyDose(100);
                break;
            case "0":
                exitDrugsWithParacetamolMenu = true;
                break;
            default:
                System.out.println("Błędny wybór\n");
        }
    }
}
