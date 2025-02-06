package Collection.Stream;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicates2 {
    List<Integer> list = new ArrayList<>();
    public RemoveDuplicates2()
    {
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(2);
        list.add(4);
        System.out.println(list);
        Set<Integer> set = new LinkedHashSet<>(list);
        System.out.println(set);
        //If we want to convert set back to list
        /*List<Integer> result = new ArrayList<>(set);
        System.out.println(result)*/
    }
    public static void main(String[] args)
    {
        new RemoveDuplicates2();
    }

}
