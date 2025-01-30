package oops.practice;
class Person1
{
    public void display()
    {
        System.out.println("Parent display method");
    }
}
class Employee1 extends Person1
{

    @Override
    public void display()
    {
       super.display();
        //System.out.println("Child display method");
    }
}
public class SuperDemo {
    public static void main(String[] args)
    {
        /*Employee1 emp = new Employee1();
        emp.display();//Child(Employee) display method

        Person1 person = new Person1();
        person.display();//Parent(Person) display method

        Person1 p =new Employee1();
        p.display();//Child(Employee) display method
        */
         Employee1 e1 = new Employee1();
         e1.display();
    }
}
