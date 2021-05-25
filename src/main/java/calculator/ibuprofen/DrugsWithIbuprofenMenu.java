package calculator.ibuprofen;

import java.util.ArrayList;
import java.util.List;

public class DrugsWithIbuprofenMenu {

    private String ibuprofenMenuOptionsToPrint;

    public DrugsWithIbuprofenMenu() {
        List<String> ibuprofenMenuOptions = new ArrayList<>();
        ibuprofenMenuOptions.add("1. Axoprofen Forte (40mg/ml)");
        ibuprofenMenuOptions.add("2. Babyfen (100mg/5ml)");
        ibuprofenMenuOptions.add("3. Brufen Forte (200mg/5ml)");
        ibuprofenMenuOptions.add("4. Bufenik (100mg/5ml)");
        ibuprofenMenuOptions.add("5. Bufenik Forte (200mg/5ml)");
        ibuprofenMenuOptions.add("6. Ibufen dla dzieci (100mg/5ml)");
        ibuprofenMenuOptions.add("7. Ibufen dla dzieci Forte (200mg/5ml)");
        ibuprofenMenuOptions.add("8. Ibum (100mg/5ml)");
        ibuprofenMenuOptions.add("9. Ibum Forte (200mg/5ml)");
        ibuprofenMenuOptions.add("10. Ibunid dla dzieci Forte (200mg/5ml)");
        ibuprofenMenuOptions.add("11. Ibuprom dla Dzieci (100mg/5ml)");
        ibuprofenMenuOptions.add("12. Ibuprom dla Dzieci Forte (200mg/5ml)");
        ibuprofenMenuOptions.add("13. Ibutact (200mg/5ml");
        ibuprofenMenuOptions.add("14. Kidofen (100mg/5ml)");
        ibuprofenMenuOptions.add("15. MIG dla dzieci (100mg/5ml)");
        ibuprofenMenuOptions.add("16. MIG dla dzieci Forte (200mg/5ml)");
        ibuprofenMenuOptions.add("17. Milifen (100mg/5ml");
        ibuprofenMenuOptions.add("18. Nurofen dla dzieci (100mg/5ml)");
        ibuprofenMenuOptions.add("19. Nurofen dla dzieci Forte (200mg/5ml)");
        ibuprofenMenuOptions.add("20.  Nurofen dla dzieci JUNIOR (200mg/5ml)");
        ibuprofenMenuOptions.add("0. Wstecz");
        ibuprofenMenuOptionsToPrint = String.join("\n", ibuprofenMenuOptions);
    }

    public String getIbuprofenMenuOptionsToPrint() {
        return ibuprofenMenuOptionsToPrint;
    }
}
