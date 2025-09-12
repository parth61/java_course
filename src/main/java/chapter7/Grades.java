package chapter7;

import java.util.Scanner;

public class Grades {
    private static int grades [];
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("How many grades would you like to enter?");
        grades = new int[input.nextInt()];
        getGrades();
        System.out.printf("Average: %.2f",calculateAverage());
        System.out.printf("\nLowest: %d",getLowest());
        System.out.printf("\nHighest: %d",getHighest());
        input.close();
    }
    public static void getGrades(){
        for (int i = 0; i < grades.length; i++) {
            System.out.println("Enter Grade #" + (i+1));
            grades[i] = input.nextInt();
        }
    }
    public static int calculateSum(){
        int sum = 0;
        for ( int grade : grades){
            sum = sum + grade;
        }
        return sum;
    }
    public static double calculateAverage(){
        return calculateSum()/grades.length;
    }
    public static int getHighest(){
        int highest = grades[0];
        for(int grade : grades){
            if(grade > highest) highest = grade;
        }
        return highest;
    }

    public static int getLowest(){
        int lowest = grades[0];
        for(int grade : grades){
            if(grade < lowest) lowest = grade;
        }
        return lowest;
    }

}
