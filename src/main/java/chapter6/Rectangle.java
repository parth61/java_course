package chapter6;

public class Rectangle {
    private double width;
    private double length;

    public Rectangle(){
        length = 0;
        width = 0;
    }
    public Rectangle(double length, double width){
        setLength(length);
        this.width = width;
    }

    public double getLength() {
        return length;
    }
    public void setLength(double length) {
        this.length = length;
    }
    public double getWidth() {
        return width;
    }
    public void setWidth(double width) {
        this.width = width;
    }
    public double calculatePerimeter() {
        return 2 * (width + length);
    }
    public  double calculateArea() {
        return width * length;
    }
}
