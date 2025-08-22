package chapter4;

import java.util.Scanner;

public class AverageTestScores {
    public static void main(String[] args) {
        int numberOfTest = 4;
        int numberOfStudents = 24;
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < numberOfStudents; i++) {
            double total = 0;
            for (int j = 0; j < numberOfTest; j++) {
                System.out.println("Enter the score for Test "+ (j+1));
                double score = input.nextDouble();
                total = total + score;
            }
            double average = total/numberOfTest;
            System.out.println("The average score for student " + (i+1) +  " is "+average);
        }
        input.close();
    }
}
