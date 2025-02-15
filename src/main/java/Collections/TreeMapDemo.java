package Collections;

import java.util.NavigableMap;
import java.util.TreeMap;

public class TreeMapDemo {

    // TreeMap extends the NavigableMap interface
    // When we wanted to sort the elements, we use TreeMap

    public static void main(String[] args) {

        NavigableMap<Integer, String> map = new TreeMap<>();
        map.ceilingEntry(1);
        map.floorKey(2);

    }
}
