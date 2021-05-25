package calculator.ibuprofen;

import calculator.PatientInfo;

public class IbuprofenCalculations {

    private static final int MAX_SINGE_DOSE_OF_IBUPROFEN_FOR_WEIGHT_EQUEL_TO_OR_GREATER_THAN_40_KG = 400;
    private static final int MILIGRAMS_OF_IBUPROFEN_PER_KILOGRAM_OF_BODY_WEIGHT = 10;
    private double singleDoseRounded;
    private double bodyWeight;

    PatientInfo patientInfo = new PatientInfo();

    public void calculateIbuprofenSingleDose(int amountOfSubstanceIn1Ml) {
        double amountOfSubstance;
        bodyWeight = patientInfo.getBodyWeight();
        if (bodyWeight > 0) {
            if (bodyWeight < 40) {
                amountOfSubstance = bodyWeight * MILIGRAMS_OF_IBUPROFEN_PER_KILOGRAM_OF_BODY_WEIGHT;
            } else {
                amountOfSubstance = MAX_SINGE_DOSE_OF_IBUPROFEN_FOR_WEIGHT_EQUEL_TO_OR_GREATER_THAN_40_KG;
            }
            double singleDose = amountOfSubstance / amountOfSubstanceIn1Ml;
            singleDoseRounded = Math.round(singleDose * 10);
            singleDoseRounded = singleDoseRounded / 10;
            System.out.println("Dawka jednorazowa (objętość) syropu to " + singleDoseRounded + " ml");
        } else {
            System.out.println("Nieprawidłowa wartość masy ciała dziecka\n");
        }
    }

    public void calculateIbuprofenMaxDailyDose() {
        double maxDailyDose;
        if (bodyWeight > 0) {
            if (bodyWeight > 1) {
                maxDailyDose = singleDoseRounded * 4;
            } else {
                maxDailyDose = singleDoseRounded * 3.3;
            }
            maxDailyDose = Math.round(maxDailyDose * 10);
            maxDailyDose = maxDailyDose / 10;
            System.out.println("Maksymalna dobowa objętość syropu to: " + maxDailyDose + " ml\n");
        }
    }
}
