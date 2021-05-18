package calculator.ibuprofen;

import calculator.PatientInfo;

public class IbuprofenCalculations {

    double singleDose;
    double singleDoseRounded;
    double bodyWeight;

    PatientInfo patientInfo = new PatientInfo();

    public void calculateIbuprofenSingleDose(int amountOfSubstanceIn1Ml) {
        double amountOfSubstance;
        bodyWeight = patientInfo.getBodyWeight();
        if (patientInfo.checkTheWeight()) {
            if (bodyWeight < 40) {
                amountOfSubstance = bodyWeight * 10;
            } else {
                amountOfSubstance = 400;
            }
            singleDose = amountOfSubstance / amountOfSubstanceIn1Ml;
            singleDoseRounded = Math.round(singleDose * 10);
            singleDoseRounded = singleDoseRounded / 10;
            System.out.println("Dawka jednorazowa (objętość) syropu to " + singleDoseRounded + " ml");
        } else {
            System.out.println("Błędne dane\n");
        }
    }

    public void calculateIbuprofenMaxDailyDose() {
        double maxDailyDose;
        if (bodyWeight > 1) {
            maxDailyDose = singleDoseRounded * 4;
        } else {
            maxDailyDose = singleDoseRounded * 3.3;
        }
        if (patientInfo.checkTheWeight()) {
            maxDailyDose = Math.round(maxDailyDose * 10);
            maxDailyDose = maxDailyDose / 10;
            System.out.println("Maksymalna dobowa objętość syropu to: " + maxDailyDose + " ml\n");
        }
    }
}
