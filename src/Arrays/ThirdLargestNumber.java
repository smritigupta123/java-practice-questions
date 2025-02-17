package Arrays;
import java.util.Arrays;
public class ThirdLargestNumber {
    public static int findThirdLargest(int[] arr)
    {
        Arrays.sort(arr); //O(nlogn)
        return arr[arr.length-3];

    }
    public static void main(String[] args)
    {
        int[] arr = {10, 20, 4, 45, 99, 30};
       System.out.println("Third Largest " + findThirdLargest(arr));
    }
}