package ru.mirea.Practice3.task1;

public class Rectangle extends Shape{
    protected double width;
    protected double length;
    @Override
    public double getArea() {
        return width*length;
    }

    @Override
    public double getPerimeter() {
        return (2*width+2*length);
    }

    @Override
    public String toString() {
        return "Shape: rectangle," +
                "width: " + width +
                ", length: " + length +
                ", color: " + color + '\'' +
                ", filled: " + filled +
                '}';
    }

    public Rectangle() {

    }
    public Rectangle(double wight, double length) {
        this.width = wight;
        this.length = length;
    }

    public Rectangle(double wight, double length,String color, boolean filled ) {
        super(color, filled);
        this.width = wight;
        this.length = length;
    }

    public double getWight() {
        return width;
    }

    public double getLength() {
        return length;
    }

    public void setWight(double wight) {
        this.width = wight;
    }

    public void setLength(double length) {
        this.length = length;
    }

}
