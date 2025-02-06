package Collection.Stream;
//How to sort a list of strings based on their length using Streams?
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortStringByLength {
    public static void main(String[] args)
    {
        List<String> list = Arrays.asList("banana","kiwi","apple","mango","pineapple");
        List<String> result = list.stream().sorted(Comparator.comparingInt(String::length))
                .collect(Collectors.toList());
        System.out.println(result);
    }
}
