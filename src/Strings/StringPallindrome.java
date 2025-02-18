package Strings;
//Check if a string is a palindrome.
public class StringPallindrome {
    public static void main(String[] args)
    {
        String str = "KANAKA";
        int left=0;
        int right = str.length()-1;
        while (left<right)
        {
            if(str.charAt(left)!=str.charAt(right))
            {
                System.out.println("Not Pallindrome");
                return;
            }
            left++;
            right--;
        }
            System.out.println("Pallindrome");
    }
}
