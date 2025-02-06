package Collection.Stream;
//How to find the maximum and minimum number in a list using Streams?

import java.util.Arrays;
import java.util.List;

public class MaxMinNumber {
    public static void main(String[] args)
    {
        List<Integer> numbers = Arrays.asList(10,20,30,40,50);
        int max = numbers.stream().max(Integer::compareTo).orElseThrow();
        int min = numbers.stream().min(Integer::compareTo).orElseThrow();
        System.out.println("Max is: " + max);
        System.out.println("Min is: " + min);
    }
}
