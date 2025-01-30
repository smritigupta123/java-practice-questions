package oops.practice;

class Person
{
    //private fields
    private int age;
    private String name;
    //Constructor to initialize the object
    Person(int age,String name)
    {
        this.age=age;
        this.name=name;
    }
    //Public Getters
    public int getAge()
    {
        return age;
    }
    public String getName()
    {
        return name;
    }
    //Public Setters
    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name)
    {
        this.name=name;
    }
    //Method to print the values
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}
public class EncapsulationDemo {
    public static void main(String[] args)
    {
        Person person = new Person(1,"Smriti");
        person.displayInfo();
        System.out.println("Setting the new values now:");
        person.setAge(20);
        person.setName("Juli");
        person.displayInfo();
    }
}

