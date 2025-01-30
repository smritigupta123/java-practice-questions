package oops.practice;

interface Vehicle
{
    //abstract method
    void start();
    //default method
    default void stop()
    {
        System.out.println("oops.practice.Vehicle is Stopped");
    }
}
class Car implements Vehicle
{
    @Override
    public void start()
    {
        System.out.println("oops.practice.Car Start method is implemented");
    }
}
public class InterfaceDemo {
    public static void main(String[] args)
    {
         Car car = new Car();
         car.start();
         car.stop();
    }
}
