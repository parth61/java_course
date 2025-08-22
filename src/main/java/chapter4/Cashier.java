package chapter4;

import java.util.Scanner;

// For Loop
public class Cashier {
    public static void main(String[] args) {
    System.out.println("Enter number of items you want to scan");
    Scanner input = new Scanner(System.in);
    int quantity =input.nextInt();
    double total=0;
    for(int i=1;i<=quantity;i++){
    System.out.println("Enter cost of item : " + (i));
    double cost = input.nextDouble();
    total = total+cost;
    }
        input.close();
        System.out.println("Total cost : "+ total);
    }
}
