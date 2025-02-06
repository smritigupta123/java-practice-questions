package Collection.Stream;

import java.util.HashMap;
import java.util.Map;

public class IterateOnHashMap {
    public static void main(String[] args)
    {
        Map<String,Integer> map = new HashMap<>();
        map.put("A",1);
        map.put("B",2);
        map.put("C",6);
        map.put("D",1);
        //Using for loop
        for(Map.Entry<String,Integer> entry:map.entrySet())
        {
            System.out.println(entry.getKey()+ " " +entry.getValue());
        }
        System.out.println("********************");
        //Using forEach()
        map.forEach((key,value)->System.out.println(key+" "+value));
    }
}
