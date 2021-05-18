package calculator.ibuprofen;

import java.util.ArrayList;

public class DrugsWithIbuprofenMenu {

    public enum DrugsWithIbuprofenOptions {

        AXOPROFEN_FORTE("1. Axoprofen Forte (40mg/ml)"),
        BABYFEN("2. Babyfen (100mg/5ml)"),
        BRUFEN_FORTE("3. Brufen Forte (200mg/5ml)"),
        BUFENIK("4. Bufenik (100mg/5ml)"),
        BUFENIK_FORTE("5. Bufenik Forte (200mg/5ml)"),
        IBUFEN_DLA_DZIECI("6. Ibufen dla dzieci (100mg/5ml)"),
        IBUFEN_DLA_DZIECI_FORTE("7. Ibufen dla dzieci Forte (200mg/5ml)"),
        IBUM("8. Ibum (100mg/5ml)"),
        IBUM_FORTE("9. Ibum Forte (200mg/5ml)"),
        IBUNID_DLA_DZIECI_FORTE("10. Ibunid dla dzieci Forte (200mg/5ml)"),
        IBUPROM_DLA_DZIECI("11. Ibuprom dla Dzieci (100mg/5ml)"),
        IBUPROM_DLA_DZIECI_FORTE("12. Ibuprom dla Dzieci Forte (200mg/5ml)"),
        IBUTACT("13. Ibutact (200mg/5ml"),
        KIDOFEN("14. Kidofen (100mg/5ml)"),
        MIG_DLA_DZIECI("15. MIG dla dzieci (100mg/5ml)"),
        MIG_DLA_DZIECI_FORTE("16. MIG dla dzieci Forte (200mg/5ml)"),
        MILIFEN("17. Milifen (100mg/5ml"),
        NUROFEN_DLA_DZIECI("18. Nurofen dla dzieci (100mg/5ml)"),
        NUROFEN_DLA_DZIECI_FORTE("19. Nurofen dla dzieci Forte (200mg/5ml)"),
        NUROFEN_DLA_DZIECI_JUNIOR("20.  Nurofen dla dzieci JUNIOR (200mg/5ml)"),
        BACK("0. Wstecz");

        private String value;

        DrugsWithIbuprofenOptions(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }
    }

    DrugsWithIbuprofenMenu.DrugsWithIbuprofenOptions[] options = DrugsWithIbuprofenMenu.DrugsWithIbuprofenOptions.values();

    public void showDrugsWithIbuprofenMenu() {
        ArrayList<String> listMenu = new ArrayList<>();
        for (int i = 0; i < options.length; i++) {
            listMenu.add(options[i].getValue());
        }
        String optionsToChoose = String.join("\n", listMenu);
        System.out.println(optionsToChoose);
    }
}
