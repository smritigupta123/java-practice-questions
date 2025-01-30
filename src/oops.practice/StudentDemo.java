package oops.practice;

public class StudentDemo {
    private String name;
    private int age;
    private int grade;

    StudentDemo(String name, int age,int grade)
    {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }
    public String getName()
    {
        return name;
    }
    public int getAge()
    {
        return age;
    }
    public int getGrade()
    {
        return grade;
    }

    public void setName(String name)
    {
        this.name = name;
    }
    public void setAge(int age)
    {
        this.age = age;
    }
    public void setGrade(int grade)
    {
        this.grade = grade;
    }
    public void display()
    {
        System.out.println("Name "+ name);
        System.out.println("Age "+ age);
        System.out.println("Grade "+ grade);
    }
    public static void main(String[] args)
    {
        StudentDemo stud = new StudentDemo("Smriti",30,12);
            stud.display();
        System.out.println("Updating the values");
        stud.setName("Juli");
        stud.setAge(29);
        stud.setGrade(10);
        stud.display();
    }
}
