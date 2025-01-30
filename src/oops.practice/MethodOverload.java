package oops.practice;

public class MethodOverload {
    public static void main(String[] args) {
        MethodOverload meth = new MethodOverload();
        int result = meth.show(5);
        int result1 = meth.show(5,6);
        
        System.out.println(result);
        System.out.println(result1);
    }

    public int show(int number) {
        return number;
    }

    public int show(int num1, int num2) {
        return num1 + num2 ;
    }
}