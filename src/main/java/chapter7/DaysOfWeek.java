package chapter7;

import java.util.Scanner;

public class DaysOfWeek {
    public static void main(String[] args) {
        String[] week = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter day of the week number");
        int index = sc.nextInt();

        System.out.println("Corresponding day: " + week[index - 1]);

    }
}
