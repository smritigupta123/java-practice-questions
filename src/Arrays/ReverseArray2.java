package Arrays;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseArray2 {
    public static void reverseWithCollections(Integer[] arr)
    {
        List<Integer> list = Arrays.asList(arr);
        Collections.reverse(list);
    }
    public static void main(String[] args)
    {
        Integer[] arr = {2,5,6,9,11,13};
        reverseWithCollections(arr);
        System.out.println("Reversed Array is :" + Arrays.toString(arr));
    }
}
//Works only for Integer[], not for primitive int[]