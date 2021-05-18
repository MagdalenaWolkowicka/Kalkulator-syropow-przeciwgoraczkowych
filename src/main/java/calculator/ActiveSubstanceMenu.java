package calculator;

import java.util.ArrayList;

public class ActiveSubstanceMenu {

    public enum ActiveSubstanceOptions {

        PARACETAMOL("1. Paracetamol"),
        IBUPROFEN("2. Ibuprofen"),
        BACK("0. Wstecz");

        private String value;

        ActiveSubstanceOptions(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }
    }

    ActiveSubstanceMenu.ActiveSubstanceOptions[] options = ActiveSubstanceMenu.ActiveSubstanceOptions.values();

    public void showActiveSubstanceMenu() {
        ArrayList<String> listMenu = new ArrayList<>();
        for (int i = 0; i < options.length; i++) {
            listMenu.add(options[i].getValue());
        }
        String optionsToChoose = String.join("\n", listMenu);
        System.out.println(optionsToChoose);
    }
}
