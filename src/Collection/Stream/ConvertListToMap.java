package Collection.Stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

//How to convert a List to a Map in Java 8?
class Employee{

     int age;
     String name;

    Employee(int age,String name){
        this.name=name;
        this.age=age;
    }
}
public class ConvertListToMap {
    public static void main(String[] args)
    {
        List<Employee> emp = Arrays.asList(
                new Employee(1,"Smriti"),
                new Employee(2,"Juli"),
                new Employee(3,"Simmie")
        );
        System.out.println("List: " + emp);
        System.out.println("*************");
        Map<Integer,String> map = emp.stream().collect(Collectors.toMap(e->e.age,e->e.name));
        System.out.println("Map: " + map);
    }
}
