package Strings;
//Count the occurrences of a character in a string.
public class CountOccurrence {
    public static void main(String[] args)
    {
        String str = "programming";
        int count = 0;
        char target = 'm';
        //System.out.println(str.hashCode());
        for(char c: str.toCharArray())
        {
            if(c==target)
                count++;
        }
        System.out.println("Occurrences of '" + target + "': " + count);
    }
}