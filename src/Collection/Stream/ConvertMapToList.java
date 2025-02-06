package Collection.Stream;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
//How to convert a Map's values into a List using Streams?
public class ConvertMapToList {
    public static void main(String[] args)
    {
        Map<Integer,String> map = new HashMap<>();
        map.put(1,"Smriti");
        map.put(2,"Juli");
        map.put(3,"Simmie");
        map.put(4,"Sapna");
    System.out.println(map);
    List<String> result = map.values().stream().toList();
        System.out.println(result);
    }
}
