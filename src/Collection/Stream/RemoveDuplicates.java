package Collection.Stream;

import java.util.Arrays;
import java.util.List;

public class RemoveDuplicates {
    public static void main(String[] args)
    {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 2, 4, 3, 5, 1);
            List<Integer> result = numbers.stream().distinct().toList();
            System.out.println(result);
    }
}
