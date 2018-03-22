package com.bvan.oop.lesson4.shape;

/**
 * @author bvanchuhov
 */
public class Square implements Shape {

    private final Rectangle rectangle;

    public Square(double side) {
        this.rectangle = new Rectangle(side, side);
    }

    @Override
    public double getArea() {
        return rectangle.getArea();
    }

    @Override
    public double getPerimeter() {
        return rectangle.getPerimeter();
    }
}
