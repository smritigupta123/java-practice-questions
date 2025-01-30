package oops.practice;

abstract class Animal
{
    String name;
    //Constructor
    Animal(String name)
    {
        this.name = name;
    }
    //abstract method
    abstract void makeSound();
    //concrete method
    void eat()
    {
        System.out.println("oops.practice.Animal Eating method called");
    }

}
class Cat extends Animal
{
    Cat(String name)
    {
        super(name);
    }
    @Override
    void makeSound()
    {
        System.out.println("oops.practice.Cat is making sound");
    }
}
public class AbstractClassDemo {
    public static void main(String[] args)
    {
        Animal animal = new Cat("jacky");
            animal.eat();
            animal.makeSound();

    }
}
