package Strings;

import java.util.stream.Collectors;

public class RemoveDuplicatedUsingStream {
    public static void main(String[] args)
    {
        String str = "smriti";
        System.out.println(removeDup(str));
    }
    static String removeDup(String str)
    {
        return str.chars()
                .distinct()
                .mapToObj(c->String.valueOf((char)c))
                .collect(Collectors.joining());
    }
}
