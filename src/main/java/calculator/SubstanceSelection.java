package calculator;

import calculator.ibuprofen.DrugsWithIbuprofenSelection;
import calculator.paracetamol.DrugsWithParacetamolSelection;

import java.util.Scanner;

public class SubstanceSelection {

    private DrugsWithParacetamolSelection drugsWithParacetamolSelection = new DrugsWithParacetamolSelection();
    private DrugsWithIbuprofenSelection drugsWithIbuprofenSelection = new DrugsWithIbuprofenSelection();

    private boolean exitActiveSubstancesMenu = false;

    public void selectSubstance() {
        ActiveSubstanceMenu activeSubstanceMenu = new ActiveSubstanceMenu();
        while (!exitActiveSubstancesMenu) {
            System.out.println(activeSubstanceMenu.getActiveSubstanceMenuOptionsToPrint());
            actionMenu();
        }
    }


    private void actionMenu() {
        Scanner scanner = new Scanner(System.in);
        String option = scanner.next();
        switch (option) {
            case "1":
                drugsWithParacetamolSelection.selectDrugWithParacetamol();
                break;
            case "2":
                drugsWithIbuprofenSelection.selectDrugWithIbuprofen();
                break;
            case "0":
                exitActiveSubstancesMenu = true;
                break;
            default:
                System.out.println("Błędny wybór\n");
        }
    }
}
