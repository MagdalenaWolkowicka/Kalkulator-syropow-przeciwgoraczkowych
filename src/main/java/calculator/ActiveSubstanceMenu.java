package calculator;

import java.util.ArrayList;
import java.util.List;

public class ActiveSubstanceMenu {

    private String activeSubstanceMenuOptionsToPrint;

    public ActiveSubstanceMenu() {
        List<String> activeSubstanceMenuOptions = new ArrayList<>();
        activeSubstanceMenuOptions.add("\nWybierz substancję czynną podawanego leku:");
        activeSubstanceMenuOptions.add("1. Paracetamol");
        activeSubstanceMenuOptions.add("2. Ibuprofen");
        activeSubstanceMenuOptions.add("0. Wstecz");
        activeSubstanceMenuOptionsToPrint = String.join("\n", activeSubstanceMenuOptions);
    }

    public String getActiveSubstanceMenuOptionsToPrint() {
        return activeSubstanceMenuOptionsToPrint;
    }
}
