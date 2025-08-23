package chapter3;

import java.util.Scanner;

public class GradeMessage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char grade = input.next().charAt(0);
        String message;
        switch (grade) {
            case 'A': message = "Excellent";
            break;
            case 'B' : message = "Great";
            break;
            case 'C' : message = "Good";
            break;
            case 'D' : message = "Poor";
            break;
            case 'E' : message = "work hard";
            break;
            default: message = "Invalid grade";
            break;
        }
        System.out.println(message);


    }
}
