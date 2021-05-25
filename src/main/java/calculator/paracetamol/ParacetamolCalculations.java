package calculator.paracetamol;

import calculator.PatientInfo;

public class ParacetamolCalculations {

    private static final int MAX_SINGE_DOSE_OF_PARACETAMOL_FOR_WEIGHT_EQUEL_TO_OR_GREATER_THAN_67_KG = 1000;
    private static final int MAX_DAILY_DOSE_OF_PARACETAMOL_FOR_WEIGHT_GREATER_THEN_OR_EQUEL_TO_45_KG = 4000;
    private static final int MILIGRAMS_OF_PARACETAMOL_PER_KILOGRAM_OF_BODY_WEIGHT = 15;
    private double singleDoseRounded;
    private double bodyWeight;

    private PatientInfo patientInfo = new PatientInfo();

    public void calculateParacetamolSingleDose(int amountOfSubstanceIn1Ml) {
        bodyWeight = patientInfo.getBodyWeight();
        if (bodyWeight > 0) {
            double amountOfSubstance;
            if (bodyWeight < 66.67) {
                amountOfSubstance = bodyWeight * MILIGRAMS_OF_PARACETAMOL_PER_KILOGRAM_OF_BODY_WEIGHT;
            } else {
                amountOfSubstance = MAX_SINGE_DOSE_OF_PARACETAMOL_FOR_WEIGHT_EQUEL_TO_OR_GREATER_THAN_67_KG;
            }
            double singleDose = amountOfSubstance / amountOfSubstanceIn1Ml;
            singleDoseRounded = Math.round(singleDose * 10);
            singleDoseRounded = singleDoseRounded / 10;
            System.out.println("Dawka jednorazowa (objętość) syropu to " + singleDoseRounded + " ml");
        } else {
            System.out.println("Nieprawidłowa wartość masy ciała dziecka\n");
        }
    }

    public void calculateParacetamolMaxDailyDose(double amountOfSubstanceIn1Ml) {
        double maxAmountOfSubstance;
        double maxDailyDose;
        if (bodyWeight > 0) {
            if (bodyWeight < 45 && bodyWeight >= 3) {
                maxDailyDose = singleDoseRounded * 6;
            } else if (bodyWeight >= 45) {
                maxAmountOfSubstance = MAX_DAILY_DOSE_OF_PARACETAMOL_FOR_WEIGHT_GREATER_THEN_OR_EQUEL_TO_45_KG;
                maxDailyDose = maxAmountOfSubstance / amountOfSubstanceIn1Ml;
            } else {
                maxDailyDose = singleDoseRounded * 5.5;
            }
            maxDailyDose = Math.round(maxDailyDose * 10);
            maxDailyDose = maxDailyDose / 10;
            System.out.println("Maksymalna dobowa objętość syropu to: " + maxDailyDose + " ml\n");
        }
    }
}






