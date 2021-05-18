package registration;

import java.util.ArrayList;

public class MenuRegistration {

    public enum Options {

        SAVE("1. Zapisz godzinę podania leku"),
        SELECT("2. Pokaż wszystkie godziny"),
        UPDATE_MEDICINE("3. Edytuj nazwę leku"),
        UPDATE_TIME("4. Edytuj czas"),
        DELETE("5. Usuń"),
        DROP("6. Reset"),
        EXIT("0. Wstecz");

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
