package Arrays;

public class RemoveDupSortedArray2 {
   public static int removeDuplicate(int[] arr)
    {
        if(arr.length==0)
            return 0;
        int i=0;
        for (int j=1;j<arr.length;j++)
        {
            if(arr[j]!=arr[i])
            {
                i++;
                arr[i]=arr[j];
            }
        }
        return i+1;

    }
    public static void main(String [] args)
    {
        int[] arr = {1, 1, 2, 2, 3, 4, 4, 5};
        int newLength = removeDuplicate(arr);//return length of new array

        for(int i =0; i<newLength;i++)
        {
            System.out.println(arr[i]+ " ");
        }
    }
}
