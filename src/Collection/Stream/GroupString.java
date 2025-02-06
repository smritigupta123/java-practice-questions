package Collection.Stream;
//How to group a list of strings by their length using Streams?
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupString {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", "kiwi", "grape", "mango");
       Map<Integer,List<String>> result =  words.stream().collect(Collectors.groupingBy(String::length));
       System.out.println(result);
    }
}
