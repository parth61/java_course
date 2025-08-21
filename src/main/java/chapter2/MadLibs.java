package chapter2;

import java.util.Scanner;

public class MadLibs
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter adjective");
        String adj = input.nextLine();
        System.out.println("Enter season");
        String season = input.nextLine();
        System.out.println("Enter Number of coffee");
        int num = input.nextInt();
        System.out.println("On a " + adj + " " + season + " day, I drink a minimum of " + num + " cups of coffees.");
        input.close();
    }
}
