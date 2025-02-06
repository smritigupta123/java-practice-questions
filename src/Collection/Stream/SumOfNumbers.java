package Collection.Stream;
//How to find the sum of all numbers in a list using Streams?
import java.util.Arrays;
import java.util.List;

public class SumOfNumbers {
    public static void main(String[] args)
    {
       List<Integer> numbers = Arrays.asList(10,20,40);
       int result = numbers.stream()
               .mapToInt(Integer::intValue)//Converts each Integer in the stream to a primitive int using method reference (Integer::intValue).
               .sum();
       System.out.println(result);
    }
}
