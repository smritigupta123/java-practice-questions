package Collection.Stream;
//How to join a list of strings with a delimiter using Streams?
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class JoinStrinsWithDelimiter {
    public static void main(String[] args)
    {
        List<String> list = Arrays.asList("banana","apple","mango");
        System.out.println(list);
        String result = list.stream().collect(Collectors.joining(","));
        System.out.println(result);
    }
}
