package Collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class MapDemo {

	public static void main(String[] args) {
		//  Map interface (java.util.Map)

//      Map doesn't allow duplicates.
//      Map allows null values, multiple null values
//      interface: Map, SortedMap, NavigableMap
//      implementation class: AbstractMap, HashMap, EnumMap, TreeMap
//      HashMap -----> Map
//      TreeMap -----> NavigableMap -----> SortedMap

		System.out.println("\nMap Methods :) !\n");

//    ------------------------------- HashMap is implementation of Map interface ---------------------------------------

		Map<Integer, Integer> integerIntegerHashMap = new HashMap<Integer, Integer>(20,0.5f);
		integerIntegerHashMap.put(1, 101);
		integerIntegerHashMap.put(2, 102);
		integerIntegerHashMap.put(3, 103);
		integerIntegerHashMap.put(4, 104);
		integerIntegerHashMap.put(5, 105);
		integerIntegerHashMap.put(null, null);
        integerIntegerHashMap.put(1,101);                                          // MAP doesn't allow duplicates.
		integerIntegerHashMap.put(6, null);			 							   // MAP allows multiple null values.
		
		integerIntegerHashMap.put(7, 107);			 							   // Associates the specified VALUE with the specified KEY in this MAP.
		integerIntegerHashMap.putAll(integerIntegerHashMap);					   // Copies all of the mappings from the specified map to this MAP.
		integerIntegerHashMap.putIfAbsent(null, null);							   // Associates it with the given value and returns null, else returns the current value.
		integerIntegerHashMap.clear();											   // Removes all of the mappings from this MAP.
		integerIntegerHashMap.containsKey(1);									   // Returns true if this MAP contains a mapping for the specified key.
		integerIntegerHashMap.containsValue(101);								   // Returns true if this MAP maps one or more keys to the specified value.
		integerIntegerHashMap.entrySet();										   // Returns a Set view of the mappings contained in this map.
		integerIntegerHashMap.get(101);											   // Returns the value to which the specified key is mapped,or null if this map contains no mapping for the key. 
		integerIntegerHashMap.isEmpty();										   // Returns true if this map contains no key-value mappings.
		integerIntegerHashMap.size();											   // Returns the number of key-value mappings in this MAP.
		integerIntegerHashMap.keySet();											   // Returns a Set view of the keys contained in this MAP.
		integerIntegerHashMap.remove(3);										   // Removes the mapping for a key from this MAP if it is present.




		
		Set<Map.Entry<Integer, Integer>> entries = integerIntegerHashMap.entrySet(); 	// Returns a Set view of the
																						// mappings contained in this
																						// map.

		Integer i = integerIntegerHashMap.get(3); 		// Returns the value to which the specified key is mapped, or null this map contains no mapping for the key.

		System.out.println("IntegerIntegerHashMap: " + integerIntegerHashMap);

		Map<Integer, String> integerStringHashMap = new HashMap<Integer, String>();
		integerStringHashMap.put(1, "Rohit Sharma");
		integerStringHashMap.put(5, "KL Rahul");
		integerStringHashMap.put(3, "Virat Kohli");
		integerStringHashMap.put(4, "Rishabh Pant");
		integerStringHashMap.put(2, "Shubhaman Gill");

		integerStringHashMap.get(2); 									// for getting the element by key value

		System.out.println("IntegerStringHashMap: " + integerStringHashMap);
	}
}
