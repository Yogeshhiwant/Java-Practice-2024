package Collections;

import java.util.Map;
import java.util.NavigableMap;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapDemo {

    // TreeMap is implementation of SortedMap
    // TreeMap extends the NavigableMap interface
    // When we wanted to sort the elements, we use TreeMap

    public static void main(String[] args) {

        NavigableMap<Integer, String> map = new TreeMap<>();
        map.ceilingEntry(1);
        map.floorKey(2);

        Map<Integer, String> integerStringTreeMap = new TreeMap<Integer, String>();

        integerStringTreeMap.put(1, "Ravindra Jadeja");
        integerStringTreeMap.put(2, "Ravi Ashwin");
        integerStringTreeMap.put(3, "Kuldeep Yadav");
        integerStringTreeMap.put(4, "Ravi Bishnoi");
        integerStringTreeMap.put(5, "Yuzi Chahal");


        System.out.println("IntegerStringTreeMap: " + integerStringTreeMap);

    }
}
