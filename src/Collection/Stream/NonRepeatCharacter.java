package Collection.Stream;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

//3. How to find the first non-repeating character in a string using Streams?
public class NonRepeatCharacter {
    public static void main(String[] args)
    {
        String input = "swiss";
        Character result = input.chars()// 1. Convert String to IntStream of characters
                .mapToObj(c->(char)c)// 2. Convert each int to Character object
                .collect(Collectors.groupingBy(// 3. Group characters and count occurrences
                        Function.identity(),// Key: Character itself
                        LinkedHashMap::new,// Maintain insertion order
                        Collectors.counting()// Value: Count of occurrences
                ))
                .entrySet().stream()// 4. Convert map entries to stream
                .filter(entry->entry.getValue()==1)// 5. Filter only non-repeating characters (count == 1)
                .map(Map.Entry::getKey)// 6. Extract the character (key)
                .findFirst()// 7. Get the first non-repeating character
                .orElse(null);// 8. Return null if no such character is found
        System.out.println(result);//result is of Character type since input.chars() will returns an IntStream of Unicode code points, representing each character as an int.
    }
}