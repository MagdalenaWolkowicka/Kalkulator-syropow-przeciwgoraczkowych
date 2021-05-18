package calculator;

import java.util.InputMismatchException;
import java.util.Scanner;

public class PatientInfo {

    private double bodyWeight;

    public double getBodyWeight() {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Podaj wagę dziecka w kg");
            bodyWeight = scanner.nextDouble();
        } catch (InputMismatchException e) {
        }
        return bodyWeight;
    }

    public boolean checkTheWeight() {
        if (bodyWeight > 0) {
            return true;
        }
        return false;
    }
}
