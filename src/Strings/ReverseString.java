package Strings;
//Reverse words in a string
public class ReverseString {
    public static void main(String[] args)
    {
        //String is stored as a literal
        String str = "smriti";
        int length = str.length();
        //String is stored as a group of characters in an Array
        //char [] c = {'s','m','r','i','t','i'};

        //int l = c.length;
        String reversed = "";
        for(int i=length-1;i>=0;i--)
        {
            reversed+=str.charAt(i);
        }
        System.out.println(reversed);
    }
}
