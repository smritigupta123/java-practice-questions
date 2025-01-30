package oops.practice;

public class CounterStatic {
    private static int count =0;
    CounterStatic()
    {
        count++;
    }
    /*public static int getCount()
    {
        return count;
    }*/
    public static void main(String[] args)
    {
        CounterStatic counter1 = new CounterStatic();
        CounterStatic counter2 = new CounterStatic();
        CounterStatic counter3 = new CounterStatic();
        //oops.practice.CounterStatic counter4 = new oops.practice.CounterStatic();
        //System.out.println("Object counts are: " + CounterStatic.getCount());//static keyword so directly calling method.
        System.out.println("Object counts are: " + count);
    }
}
