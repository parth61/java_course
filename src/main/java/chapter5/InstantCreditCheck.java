package chapter5;

import java.util.Scanner;

public class InstantCreditCheck {
    static int requiredCreditScore = 700;
    static int requiredSalary = 25000;
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        double salary = getSalary();
        int creditScore = getCreditScore();
        input.close();
        boolean qualified = isUserQualified(salary, creditScore);
        notifyUser(qualified);
    }

    public static double getSalary() {
        System.out.println("Enter Salary");
        double salary = input.nextDouble();
        return  salary;
    }

    public static int getCreditScore() {
        System.out.println("Enter Credit Score");
        int creditScore = input.nextInt();
        return  creditScore;
    }

    public static boolean isUserQualified(double salary, int creditScore) {

        if (requiredSalary <= salary && requiredCreditScore <= creditScore)
            return true;
         else
            return false;

    }

    public static void notifyUser(boolean isQualified) {
        if (isQualified)
            System.out.println("You are approved");

        else
            System.out.println("You are not approved");

    }
}
