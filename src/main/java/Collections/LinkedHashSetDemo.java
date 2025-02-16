package Collections;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetDemo {

    // LinkedHashSet is used to store elements in a Set in "Ordered" manner;
    // All the working and functionalities are as same as HashSet.
    // Set --> HashSet --> LinkedHashSet --> TreeSet --> EnumSet
    // Map --> HashMap --> LinkedHashMap --> TreeMap --> EnumMap

    public static void main(String[] args) {
        Set<Integer> set = new LinkedHashSet<>();

        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(5);

        System.out.println(set);
    }
}
