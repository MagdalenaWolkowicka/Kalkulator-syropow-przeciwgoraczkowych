package calculator;

import java.util.ArrayList;
import java.util.List;

public class MainMenu {

    private String menuOptionsToPrint;

    public MainMenu() {
        List<String> menuOptions = new ArrayList<>();
        menuOptions.add("\n---Menu---");
        menuOptions.add("1. Oblicz dawkę");
        menuOptions.add("2. Zapisz godzinę podania leku");
        menuOptions.add("3. Zobacz zasady podawania leków przeciwgorączkowych");
        menuOptions.add("0. Wyjdź z programu");
        menuOptionsToPrint = String.join("\n", menuOptions);
    }

    public String getMenuOptionsToPrint() {
        return menuOptionsToPrint;
    }
}
