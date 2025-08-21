package chapter2;

import java.util.Scanner;

public class GrossPayCalculator {
    public static void main(String[] args) {
        System .out .println("Enter number of hours employee worked");
        Scanner input = new Scanner(System.in);
        int hours = input.nextInt();
        System.out.println("Enter employee salary:");
        double salary = input.nextDouble();
        double grossPay = hours * salary;
        System.out.println("Employee Gross Pay " + grossPay);
        input.close();
    }
}
