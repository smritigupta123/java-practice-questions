package Arrays;
//Check if an array is sorted.
import java.util.Arrays;
public class CheckifArrSorted {
    public static void main(String[] args)
    {
        int[] arr = {3,2,6,9,2,1};
        System.out.println(sortedArray(arr));
    }

    public static boolean sortedArray(int[] arr)
    {
        for (int i=0;i<arr.length-1;i++)
        {
            if(arr[i]>arr[i+1])
                return false;
        }
        return true;
    }
}
//Time Complexity-O(n)
//Space Complexity - O(1), since no extra space needed