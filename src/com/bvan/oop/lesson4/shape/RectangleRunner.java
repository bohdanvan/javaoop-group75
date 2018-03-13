package com.bvan.oop.lesson4.shape;

import java.util.ArrayList;

/**
 * @author bvanchuhov
 */
public class RectangleRunner {

    public static void main(String[] args) {
        Rectangle r = new Rectangle(10, 20);
        double a1 = r.getArea();
        System.out.println(a1);

        Circle c = new Circle(10);
        double a2 = c.getArea();
        System.out.println(a2);

        Shape s = new Rectangle(1, 2);
        System.out.println(s.getArea()); // +

        ArrayList<Shape> shapes = new ArrayList<>();
//        shapes.add(new Rectangle(10, 20));
        shapes.add(new Circle(10));

        double res = getTotalArea(shapes);
        System.out.println(res);


        Shape shape = shapes.get(0);
        if (shape instanceof Rectangle) { // BAD PRACTICE
            Rectangle rectangle = (Rectangle) shape; // BAD PRACTICE
            System.out.println(rectangle.getWidth());
        }

    }

    public static double getTotalArea(ArrayList<Shape> shapes) {
        double res = 0.0;
        for (Shape shape : shapes) {
            res += shape.getArea();
        }
        return res;
    }
}
