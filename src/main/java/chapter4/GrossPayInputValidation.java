package chapter4;

import java.util.Scanner;

public class GrossPayInputValidation {
    public static void main(String[] args) {
        int rate = 15;
        int maxHours = 40;
        Scanner input = new Scanner(System.in);
        double hoursWorked = input.nextDouble();
        while (hoursWorked > maxHours || hoursWorked < 1) {
            System.out.println("Hours worded should be between 1 to 40");
            hoursWorked = input.nextDouble();

        }
        input.close();
        double gross = rate*hoursWorked;
        System.out.println("Gross Pay : "+ gross);

    }
}
