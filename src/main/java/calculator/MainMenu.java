package calculator;

import java.util.ArrayList;

public class MainMenu {

    public enum Options {

        CALCULATE_DOSE("1. Oblicz dawkę"),
        DOSING_REGISTER("2. Zapisz godzinę podania leku"),
        MEDICINES_INFO("3. Zobacz zasady podawania leków przeciwgorączkowych"),
        EXIT("0. Wyjdź z programu");

        private String value;

        Options(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }
    }

    Options[] options = Options.values();

    public void showMenu() {
        ArrayList<String> listMenu = new ArrayList<>();
        for (int i = 0; i < options.length; i++) {
            listMenu.add(options[i].getValue());
        }
        String optionsToChoose = String.join("\n", listMenu);
        System.out.println(optionsToChoose);
    }
}
