package Collection.Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//1. How to convert a List of Strings to uppercase using Streams?
public class UppercaseConvert {
    public static void main(String[] args)
    {
        List<String> strlist = Arrays.asList("Smriti","Gupta","Simmie");
        List<String> result = strlist.stream().map(String::toUpperCase).collect(Collectors.toList());
        System.out.println(result);
    }
}
