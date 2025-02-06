package Collection.Stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
//How to find the second highest number in a list using Streams?
public class SecondHighestNo {
    public static void main(String[] args)
    {
       List<Integer> list = Arrays.asList(1,2,4,6,8,10);
       int result = list.stream()
                        .distinct()
                        .sorted(Comparator.reverseOrder())
                        .skip(1)
                        .findFirst()
                        .orElseThrow();

        System.out.println("Second Highest: " + result);
    }
}
