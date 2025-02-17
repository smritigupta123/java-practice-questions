package Arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RemoveDupSortedArray {
    public static int[] remDupWithCollection(int[] arr)
    {
        Set<Integer> set = new HashSet<>();
        for(int num : arr)
        {
            set.add(num);
        }
        return set.stream().mapToInt(Integer::intValue).toArray();
    }
    public static void main(String[] args)
    {
        int[] arr = {2,4,4,5,6,8,8};
        int[] result = remDupWithCollection(arr);
        System.out.println("Removed Duplicated from sorted array: " + Arrays.toString(result));
    }
}
