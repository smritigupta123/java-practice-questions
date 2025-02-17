package Arrays;

import java.util.Arrays;

//8.Find the largest and smallest element in an array.
public class LargestAndSmallestElem {
    public static void main(String[] args)
    {
        int[] arr = {2,1,4,6,7,9,22,40,10};
        /*Approach 1- using Arrays.sort
        Arrays.sort(arr);
        //for(int i=0;i<arr.length;i++)
            //System.out.println(arr[i]);
        int small = arr[0];
        int large = arr[arr.length-1];
        System.out.println("Smallest element is: " +small);
        System.out.println("Largest element is: " + large);
        */
        /*Approach 2- using single loop
        int small= arr[0];
        int large=arr[0];

                for(int i=0;i<arr.length;i++)
                {
                    if(arr[i]<small)
                        small=arr[i];
                    if(arr[i]>large)
                        large=arr[i];
                }
        System.out.println("Smallest element is: " +small);
        System.out.println("Largest element is: " + large);
        */

         //Approach 3-Using Streams
        int small = Arrays.stream(arr).min().getAsInt();
        int large = Arrays.stream(arr).max().getAsInt();
        System.out.println("Smallest element is: " +small);
        System.out.println("Largest element is: " + large);
    }

}
