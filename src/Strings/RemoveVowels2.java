package Strings;

public class RemoveVowels2 {
    public static void main(String[] args)
    {
        String str = "Hello World";
        //String new1 = str.replaceAll("AEIOUaeiou",""); need to include bracket[] as shown in below line
        String new1 = str.replaceAll("[AEIOUaeiou]","");
        System.out.println(new1);
    }
}