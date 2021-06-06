package calculator;

import informations.MedicinesInfoReader;
import registration.Registration;

import java.net.URISyntaxException;
import java.sql.SQLException;
import java.util.Scanner;

public class Calculator {

    private boolean exitCalculator = false;
    private SubstanceSelection substanceSelection = new SubstanceSelection();
    private Registration registration = new Registration();
    private MedicinesInfoReader medicinesInfoReader = new MedicinesInfoReader();

    public void start() throws SQLException, URISyntaxException {
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("~~~~~~ Kalkulator syropów przeciwgorączkowych ~~~~~~");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("");
        MainMenu mainMenu = new MainMenu();
        exitCalculator = false;
        while (!exitCalculator) {
            System.out.println(mainMenu.getMenuOptionsToPrint());
            actionMenu();
        }
    }

    private void actionMenu() throws URISyntaxException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nWybierz opcję:");
        String option = scanner.next();
        switch (option) {
            case "1":
                substanceSelection.selectSubstance();
                break;
            case "2":
                registration.startRegistration();
                break;
            case "3":
                medicinesInfoReader.readFile("Leki przeciwgorączkowe.txt");
                break;
            case "0":
                exitCalculator = true;
                break;
            default:
                System.out.println("Błędny wybór\n");
        }
    }
}
