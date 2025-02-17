package Arrays;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

//Move all zeros to end of array
public class MoveZeroToEnd {
    public static void main(String[] args)
    {
        //Approach 1
        Integer[] arr = {1,4,0,1,0,11,3,2,0,5,8,9};
         Arrays.sort(arr, Collections.reverseOrder());
        System.out.println(Arrays.toString(arr));

        //Approach 2
         int[] arr1 = {1,4,0,1,0,11,3,2,0,5,8,9};
        List<Integer> list = Arrays.stream(arr1).boxed().filter(n->n!=0).sorted((a,b)->b-a).collect(Collectors.toList());
        //System.out.println(list);

        long zero = Arrays.stream(arr1).filter(n->n==0).count();//with count we use long
        for(int i=0;i<zero;i++)
            list.add(0);
        System.out.println(list);
    }

}
