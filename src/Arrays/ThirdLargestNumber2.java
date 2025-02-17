package Arrays;

public class ThirdLargestNumber2 {
    public static int findThirdLargest(int[] arr)
    {
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        int third = Integer.MIN_VALUE;
        for (int num:arr)
        {
            if(num > first)
            {
                third = second;
                second= first;
                first = num;
            }
            else if (num >second)
            {
                third = second;
                second = num;
            }
            else if(num >third)
            {
                third=num;
            }
        }
        return third;
    }
    public static void main(String[] args)
    {
        int[] arr = {10, 20, 4, 45, 99, 30};
        System.out.println("Third Largest " + findThirdLargest(arr));
    }
}
//Time Complexity= O(n)
//Space Complexity = O(1)