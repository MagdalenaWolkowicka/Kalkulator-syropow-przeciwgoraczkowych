package calculator.paracetamol;

import java.util.ArrayList;

public class DrugsWithParacetamolMenu {

    public enum DrugsWithParacetamolOptions {

        APAP_DLA_DZIECI_FORTE("1. APAP dla dzieci FORTE (200mg/5ml)"),
        CALPOL("2. Calpol (120mg/5ml)"),
        CALPOL_6_PLUS("3. Calpol 6 Plus (250mg/5ml)"),
        PANADOL_DLA_DZIECI("4. Panadol dla dzieci (120mg/5ml)"),
        PARACETAMOL_AFLOFARM("5. Paracetamol Aflofarm (120mg/5ml)"),
        PATACETAMOL_GALENA("6. Paracetamol Galena (120mg/5ml)"),
        PARACETAMOL_HASCO("7. Paracetamol Hasco (120mg/5ml)"),
        PEDICETAMOL("8. Pedicetamol (100mg/1ml)"),
        BACK("0. Wstecz");

        private String value;

        DrugsWithParacetamolOptions(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }
    }

    DrugsWithParacetamolMenu.DrugsWithParacetamolOptions[] options = DrugsWithParacetamolMenu.DrugsWithParacetamolOptions.values();

    public void showDrugsWithParacetamolMenu() {
        ArrayList<String> listMenu = new ArrayList<>();
        for (int i = 0; i < options.length; i++) {
            listMenu.add(options[i].getValue());
        }
        String optionsToChoose = String.join("\n", listMenu);
        System.out.println(optionsToChoose);
    }
}
