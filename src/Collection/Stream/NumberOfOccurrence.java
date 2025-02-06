package Collection.Stream;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

//Count the number of occurrences of each character in a string using Streams?
public class NumberOfOccurrence {
    public static void main(String[] args)
    {
        String input = "banana";
        Map<Character,Long> result = input.chars()
                .mapToObj(c->(char)c)
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println(result);
    }
}
//Why Can't We Use Map<String, Integer>?
/*
1. Key Type (Character vs. String)
The input.chars() method returns an IntStream of Unicode code points, representing each character as an int.
The .mapToObj(c -> (char) c) step converts each int into a Character object.
The groupingBy(Function.identity(), Collectors.counting()) groups by Character.
If we use Map<String, Integer>, the key type would be String, but we are grouping Character objects.
Fix: If we need a String key, we must explicitly convert each character to a String:

Map<String, Integer> frequencyMap = input.chars()
        .mapToObj(c -> String.valueOf((char) c))  // Convert char to String
        .collect(Collectors.groupingBy(Function.identity(), Collectors.summingInt(c -> 1)));

2. Value Type (Long vs. Integer)
Collectors.counting() returns a Long, not an Integer.
If we want Integer, we should use Collectors.summingInt(c -> 1).
Fix:
Map<Character, Integer> frequencyMap = input.chars()
        .mapToObj(c -> (char) c)
        .collect(Collectors.groupingBy(Function.identity(), Collectors.summingInt(c -> 1)));

*/