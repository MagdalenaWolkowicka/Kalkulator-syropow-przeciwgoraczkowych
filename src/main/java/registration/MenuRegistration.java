package registration;

import java.util.ArrayList;
import java.util.List;

public class MenuRegistration {

    private String registrationMenuOptionsToPrint;

    public MenuRegistration() {
        List<String> registrationMenuOptions = new ArrayList<>();
        registrationMenuOptions.add("1. Zapisz godzinę podania leku");
        registrationMenuOptions.add("2. Pokaż wszystkie godziny");
        registrationMenuOptions.add("3. Edytuj nazwę leku");
        registrationMenuOptions.add("4. Edytuj czas");
        registrationMenuOptions.add("5. Usuń");
        registrationMenuOptions.add("6. Reset");
        registrationMenuOptions.add("0. Wstecz");
        registrationMenuOptionsToPrint = String.join("\n", registrationMenuOptions);
    }

    public String getRegistrationMenuOptionsToPrint() {
        return registrationMenuOptionsToPrint;
    }
}
