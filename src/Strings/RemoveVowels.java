package Strings;
//Remove vowels from a string.
public class RemoveVowels {
    public static void main(String[] args)
    {
        String str = "smriti";
        StringBuilder newString = new StringBuilder();
        for(char c: str.toCharArray())
        {
            if("AEIOUaeiou".indexOf(c)==-1) // If not a vowel, append it
            {
                newString.append(c);
            }
        }
        System.out.println(newString);
    }
}
