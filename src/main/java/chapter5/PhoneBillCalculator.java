package chapter5;

import java.util.Scanner;

public class PhoneBillCalculator {
    static double chargePerMin = 0.25;
    static double taxPercent = 0.15;
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        double planFee = planFee();
        double overageCharge = overageCharge();
        input.close();
        double tax = totalTax(planFee, overageCharge);
        double total = total(planFee,overageCharge, tax);

//        double total = planFee + overageCharge + tax;
        System.out.printf("Phone Bill Statement\nPlan: $%.2f\nOverage: $%.2f\nTax: $%.2f\nTotal: $%.2f",planFee,overageCharge,tax,total);
    }
    //plan fee
    public static double planFee() {
        System.out.print("Please enter your plan fee: ");
        double planFee = input.nextDouble();
        return planFee;
    }
    //overage mins
    public static double overageCharge() {
        System.out.print("Please enter your overage mins: ");
        double overageMins = input.nextDouble();
        double overageCharge = overageMins * chargePerMin;
        return overageCharge;
    }
    //calculate overage mins
    public static double totalTax(double planfee, double overagecharge) {
       double totalTax = (planfee + overagecharge)*taxPercent;
       return totalTax;
    }

    public static double total(double planFee, double overageCharge, double tax) {
        double total = planFee + overageCharge + tax;
        return total;
    }
}
