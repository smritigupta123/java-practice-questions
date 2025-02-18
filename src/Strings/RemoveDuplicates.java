package Strings;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;

//Remove duplicate characters from a string.
//Using LinkedHashSet-> preserves order and removes duplicate
public class RemoveDuplicates {
    public static void main(String[] args)
    {
        String str = "smriti";
        StringBuilder newString = new StringBuilder();

        LinkedHashSet<Character> set = new LinkedHashSet<>();
        for (char c : str.toCharArray())
        {
            if(set.add(c))
            {
                newString.append(c);
            }

        }
        System.out.println(newString);
    }
}
