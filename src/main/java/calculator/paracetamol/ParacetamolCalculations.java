package calculator.paracetamol;

import calculator.PatientInfo;

public class ParacetamolCalculations {

    double singleDose;
    double singleDoseRounded;
    double bodyWeight;
    double amountOfSubstance;

    PatientInfo patientInfo = new PatientInfo();

    public void calculateParacetamolSingleDose(int amountOfSubstanceIn1Ml) {
        bodyWeight = patientInfo.getBodyWeight();
        if (patientInfo.checkTheWeight()) {
            if (bodyWeight < 66.67) {
                amountOfSubstance = bodyWeight * 15;
            } else {
                amountOfSubstance = 1000;
            }
            singleDose = amountOfSubstance / amountOfSubstanceIn1Ml;
            singleDoseRounded = Math.round(singleDose * 10);
            singleDoseRounded = singleDoseRounded / 10;
            System.out.println("Dawka jednorazowa (objętość) syropu to " + singleDoseRounded + " ml");
        }
    }

    public void calculateParacetamolMaxDailyDose(double amountOfSubstanceIn1Ml) {
        double maxAmountOfSubstance;
        double maxDailyDose;
        if (bodyWeight < 45 && bodyWeight >= 3) {
            maxDailyDose = singleDoseRounded * 6;
        } else if (bodyWeight >= 45) {
            maxAmountOfSubstance = 4000;
            maxDailyDose = maxAmountOfSubstance / amountOfSubstanceIn1Ml;
        } else {
            maxDailyDose = singleDoseRounded * 5.5;
        }
        if (patientInfo.checkTheWeight()) {
            maxDailyDose = Math.round(maxDailyDose * 10);
            maxDailyDose = maxDailyDose / 10;
            System.out.println("Maksymalna dobowa objętość syropu to: " + maxDailyDose + " ml\n");
        } else {
            System.out.println("Błędne dane\n");
        }
    }
}






