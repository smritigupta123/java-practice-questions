package oops.practice;

final class A{
    private final int max_count=10;
    public final void showName()
    {
        System.out.println(max_count);
    }
}
public final class FinalExample {
    public static void main(String[] args)
    {
        A a2 = new A();
        a2.showName();
    }
}
