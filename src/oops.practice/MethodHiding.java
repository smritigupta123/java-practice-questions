package oops.practice;

class Parent
{
    static void display()
    {
        System.out.println("Class oops.practice.Parent");
    }
}
class Child extends Parent
{
    static void display()
    {
        System.out.println("Class oops.practice.Child");
    }
}
public class MethodHiding {
    public static void main(String[] args)
    {
        Parent parent = new Parent(); //output:Class oops.practice.Parent
        parent.display();

        Child child = new Child(); //output:Class oops.practice.Child
        child.display();

        Parent childRefToParent = new Child(); //output:class oops.practice.Parent
        childRefToParent.display();

        //error:java: incompatible types: oops.practice.Parent cannot be converted to oops.practice.Child
        //oops.practice.Child parentRefToChild = new oops.practice.Parent();
        //parentRefToChild.display();
    }
}
