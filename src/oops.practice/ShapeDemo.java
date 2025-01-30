package oops.practice;

import java.util.Locale;

interface Shape
{
    void display();
}
class Circle implements Shape{
   public void display()
    {
        System.out.println("This is a Circle class");
    }
}
class Rectangle implements Shape{
    public void display()
    {
        System.out.println("This is a Rectangle class");
    }
}
class Triangle implements Shape{
    public void display()
    {
        System.out.println("This is a Triangle class");
    }
}
class ShapeFactory
{
    public Shape getShape(String shapeType)
    {
        if (shapeType==null)
            return null;
        switch (shapeType.toLowerCase())
        {
            case "circle":
                return new Circle();
            case "rectangle":
                return new Rectangle();
            case "triangle":
                return new Triangle();
            default:
                System.out.println("Invalid shape passed: " +shapeType);
                return null;
        }
    }
}
public class ShapeDemo {
    public static void main(String[] args)
    {
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape circle1 = shapeFactory.getShape("circle");
        circle1.display();

        Shape rect1 = shapeFactory.getShape("rectangle");
        rect1.display();

        Shape tri = shapeFactory.getShape("triangle");
        tri.display();

        //Shape oval = shapeFactory.getShape("oval");
        //oval.display();

    }
}
