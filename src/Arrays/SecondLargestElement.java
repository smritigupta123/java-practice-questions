package Arrays;
import java.util.Arrays;
public class SecondLargestElement {
    public static void main(String[] args)
    {
        int[] arr = {1,3,5,2,8,9,21};
        System.out.println("Second Largest Element is : " +findSecondLargest(arr));

    }

    public static int findSecondLargest(int[] arr)
    {
        if(arr==null||arr.length<2)
            throw new IllegalArgumentException("Array must contain atleast two elements");
        Arrays.sort(arr);
        // Step 2: Find the second-largest element (first distinct value from the end)
        int largest = arr[arr.length - 1];
        for (int i = arr.length - 2; i >= 0; i--) {
            if (arr[i] < largest) {
                return arr[i];
            }
        }

        throw new RuntimeException("No second largest element found.");
    }
}
