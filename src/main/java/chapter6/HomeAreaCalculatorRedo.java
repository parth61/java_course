package chapter6;

import java.util.Scanner;

public class HomeAreaCalculatorRedo {

    private Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        HomeAreaCalculatorRedo calculator = new HomeAreaCalculatorRedo();

        Rectangle kitchen = calculator.getRoom();
        Rectangle bathroom = calculator.getRoom();

        double area = calculator.calculateTotalArea(kitchen,bathroom);
        System.out.println("The Total Area is "+ area);
        calculator.input.close();
    }
    public Rectangle getRoom(){

        System.out.println("Enter the length of the room");
        double length = input.nextDouble();
        System.out.println("Enter the width of the room");
        double width = input.nextDouble();

        return new Rectangle(length,width);
    }
    public double calculateTotalArea(Rectangle rectangle1, Rectangle rectangle2){
        return rectangle1.calculateArea() + rectangle2.calculateArea();
    }
}
