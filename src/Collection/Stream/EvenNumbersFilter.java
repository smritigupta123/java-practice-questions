package Collection.Stream;
//2. How to filter even numbers from a list using Streams?
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EvenNumbersFilter {
    public static void main(String[] args)
    {
        List<Integer> list = Arrays.asList(1,2,4,5,6,7,8);
        List<Integer> result = list.stream().filter(n->n%2==0).collect(Collectors.toList());
        System.out.println(result);
    }
}
