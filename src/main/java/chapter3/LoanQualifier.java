package chapter3;
import java.util.Scanner;
public class LoanQualifier {
    public static void main(String[] args) {
        int requiredsalary = 30000;
        int requiredyear = 2;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your salary");
        int salary = input.nextInt();
        System.out.println("Enter your years");
        double years = input.nextDouble();
        if (salary >= requiredsalary) {if(years >= requiredyear)
            System.out.println("You have qualified");
            }
            else System.out.println("You have not completed years");
        }
        else System.out.println("Your salary is less");
        input.close();
   }
}
