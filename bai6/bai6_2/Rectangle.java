package bai6.bai6_2;

public class Rectangle implements GametriObject {
    private double width;
    private double height;
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }
    @Override
    public String toString() {
        return "Rectangle [width=" + width + ", height=" + height + "]";
    }
    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public double getPerimeter() {
        return (width + height) * 2;
    }
}

