package chapter4;

import java.util.Scanner;

public class AddNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean again;
        do {
            System.out.println("Enter FIrst number");
            double firstNumber = input.nextDouble();
            System.out.println("Enter Second number");
            double secondNumber = input.nextDouble();
            double sum = firstNumber + secondNumber;
            System.out.println("Sum : "+ sum);
            System.out.println("Do you like to run it again");
            again = input.nextBoolean();

        }
        while (again);
        input.close();

    }
}
