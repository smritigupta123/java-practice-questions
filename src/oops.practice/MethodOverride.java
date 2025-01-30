package oops.practice;

public class MethodOverride {
    public static void main (String[] args)
    {
        A1 a;
        a = new B1();
        System.out.println(a.display());

        a = new C1();
        System.out.println(a.display());
    }
}
class A1{
    public int display()
    {
        int a=5,b=7;
        return a+b;
    }
}
class B1 extends A1{
    public int display()
    {
        int a=5,b=7;
        return a*b;
    }
}
class C1 extends A1{
    public int display()
    {
        int a=5,b=7;
        return (a*a+b*b);
    }
}