package Collection.Stream;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class DifferenceBwArrayListLinkedList {
    public static void main(String[] args)
    {
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        System.out.println("ArrayList: " + arrayList);
        System.out.println("******************");
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        System.out.println("LinkedList: " + linkedList);
        System.out.println("******************");
        // Measure performance
        long startTime = System.nanoTime();
        arrayList.add(1, 100); // Insert in middle
        long endTime = System.nanoTime();
        System.out.println("ArrayList Insert Time: " + (endTime - startTime));
        System.out.println("******************");
        // Measure performance
        long startTime2 = System.nanoTime();
        linkedList.add(1, 100); // Insert in middle
        long endTime2 = System.nanoTime();
        System.out.println("LinkedList Insert Time: " + (endTime2 - startTime2));
    }
}
