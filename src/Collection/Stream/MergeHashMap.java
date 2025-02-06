package Collection.Stream;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;
//8. How to merge two HashMaps in Java 8?
public class MergeHashMap {
    public static void main(String[] args)
    {
        Map<Integer,String> map1 = new HashMap<>();
        map1.put(1,"A");
        map1.put(2,"B");
        map1.put(3,"C");

        Map<Integer,String> map2 = new HashMap<>();
        map2.put(3,"D");
        map2.put(4,"E");
        map2.put(5,"F");
        
        //merge two maps
        Map<Integer,String> mergeMap = Stream.concat(map1.entrySet().stream(),map2.entrySet().stream())
                .collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue,(existingValue,newValue)->existingValue+","+newValue));
        System.out.println(mergeMap);
    }
}