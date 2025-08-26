package chapter5;

import java.util.Scanner;

public class InstantCreditCheck {
    static int requiredCreditScore = 700;
    static int requiredSalary = 25000;
    public static void main(String[] args) {
        getFromData();
        isUserQualified();
    }
    public static double getSalary(){
        System.out.println("Enter Salary");
        Scanner input = new Scanner(System.in);
        double salary = input.nextDouble();
        System.out.println("Enter Credit Score");
        int creditScore = input.nextInt();
    }
    public static int getCreditScore(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Credit Score");
        int creditScore = input.nextInt();
    }
    public static boolean isUserQualified(){

        if (requiredSalary >= salary && requiredCreditScore >= creditScore){

        }

}
