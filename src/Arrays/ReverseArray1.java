package Arrays;

import java.util.Arrays;
//Two Pointer Approach
public class ReverseArray1 {
    public static void findReverse(int[] arr)
    {
        int left =0, right = arr.length-1, temp;
        for(int i =0; i<arr.length;i++)
        {
           if(left<right)
           {
               temp = arr[left];
               arr[left] = arr[right];
               arr[right] = temp;
               left++;
               right--;
           }
        }

    }
    public static void main(String[] args)
    {
        int[] arr = {2,5,6,9,11,13};
        findReverse(arr);
        System.out.println("Reversed Array is: "+ Arrays.toString(arr));//Converting the reverse array to String
    }
}
//O(N) time, O(1) space
//Modifies the original array