package calculator.paracetamol;

import java.util.ArrayList;
import java.util.List;

public class DrugsWithParacetamolMenu {

    private String paracetamolMenuOptionsToPrint;

    public DrugsWithParacetamolMenu() {
        List<String> paracetamolMenuOptions = new ArrayList<>();
        paracetamolMenuOptions.add("1. APAP dla dzieci FORTE (200mg/5ml)");
        paracetamolMenuOptions.add("2. Calpol (120mg/5ml)");
        paracetamolMenuOptions.add("3. Calpol 6 Plus (250mg/5ml)");
        paracetamolMenuOptions.add("4. Panadol dla dzieci (120mg/5ml)");
        paracetamolMenuOptions.add("5. Paracetamol Aflofarm (120mg/5ml)");
        paracetamolMenuOptions.add("6. Paracetamol Galena (120mg/5ml)");
        paracetamolMenuOptions.add("7. Paracetamol Hasco (120mg/5ml)");
        paracetamolMenuOptions.add("8. Pedicetamol (100mg/1ml)");
        paracetamolMenuOptions.add("0. Wstecz");
        paracetamolMenuOptionsToPrint = String.join("\n", paracetamolMenuOptions);
    }

    public String getParacetamolMenuOptionsToPrint() {
        return paracetamolMenuOptionsToPrint;
    }
}
