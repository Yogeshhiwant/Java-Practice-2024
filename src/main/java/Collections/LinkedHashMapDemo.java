package Collections;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapDemo {

    // LinkedHashMap is used to store elements in a map in "Ordered" manner;
    // All the working and functionalities are as same as HashMap.
    // doesn't allow duplicate keys
    // Map --> HashMap --> LinkedHashMap --> TreeMap --> EnumMap
    // Set --> HashSet --> LinkedHashSet --> TreeSet --> EnumSet


    public static void main(String[] args) {


    Map<Integer,Integer> map = new LinkedHashMap<>();
    map.put(1,1);
    map.put(1,2);
    map.put(2,2);
    map.put(3,3);
    map.put(4,4);
    map.put(5,5);

    System.out.println(map);

    }
}
