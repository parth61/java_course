package chapter6;

public class Rectangle {
    double width;
    double length;

    double getLength() {
        return length;
    }
    void setLength(double length) {
        this.length = length;
    }
    double getWidth() {
        return width;
    }
    void setWidth(double width) {
        this.width = width;
    }
    double calculatePerimeter() {
        return 2 * (width + length);
    }
    double calculateArea() {
        return width * length;
    }
}
