package Collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

import ImpClass.Employee;

public class SetDemo {

    public static void main(String[] args) {

// Set interface (java.util.Set)

        System.out.println("\nSet Methods :) !\n");

//      Set doesn't allow duplicates.
//      Set allows null values, multiple null values
//      interfaces: Set, SortedSet
//      implementation classes: HashSet, LinkedHashSet, TreeSet
//      HashSet, LinkedHashSet -------> Set
//      TreeSet ------> SortedSet

        // ------------------------- HashSet implements Set interface ----------------------------------------------------------------------------------------------------

        Set<Integer> integerHashSet = new HashSet<Integer>();
        integerHashSet.add(51);
        integerHashSet.add(52);
        integerHashSet.add(53);
        integerHashSet.add(54);
        integerHashSet.add(55);

        integerHashSet.add(56);                                                // Adds the specified element to this SET if it is not already present.
        integerHashSet.isEmpty();                                            // Returns True if this SET contains no elements.
        integerHashSet.clear();                                                // Removes all of the elements from this SET.
        integerHashSet.size();                                                // Returns the number of elements in this SET.
        integerHashSet.remove(54);                                        // Removes the specified element from this SET if it is present.
        integerHashSet.removeAll(integerHashSet);                            // Removes from this set all of its elements that are contained in the specified collection
        integerHashSet.contains(51);                                        // Returns true if this SET contains the specified element.
        integerHashSet.containsAll(integerHashSet);                            // Returns true if this SET contains all of the elements of the specified collection.
        integerHashSet.toArray();                                            // Returns an array containing all of the elements in this SET.
        integerHashSet.toString();                                            // Returns a string representation of the object.
        integerHashSet.retainAll(integerHashSet);                            // Retains only the elements in this SET that are contained in the specified collection.
        integerHashSet.iterator();                                            // Returns an iterator over the elements in this SET.


        System.out.println("IntegerHashSet: " + integerHashSet);

        Set<String> stringHashSet1 = new HashSet<String>();
        stringHashSet1.add("9139775526");
        stringHashSet1.add("91583826644");

        Set<String> stringHashSet2 = new HashSet<String>();
        stringHashSet2.add("Yogesh");
        stringHashSet2.add("Mummy");

//        stringHashSet1.addAll(stringHashSet2);                            // for adding all elements from other set

//        System.out.println(stringHashSet2);

        Set<Employee> employeeHashSet = new HashSet<Employee>();

        employeeHashSet.add(new Employee(11, "Pooja"));
        employeeHashSet.add(new Employee(12, "Aishwarya"));
        employeeHashSet.add(new Employee(13, "Pratiksha"));
        employeeHashSet.add(new Employee(13, "Dhanashree"));

        Employee hashSetEmployee = new Employee(15, "Tejaswini");
        employeeHashSet.add(hashSetEmployee);

        System.out.println("EmployeeHashSet: " + employeeHashSet);

//  ---------------------------- LinkedHashSet class implements Set interface -------------------------------------------------------------------------------------------

        Set<String> linkedHashSet = new LinkedHashSet<String>();
        linkedHashSet.add("Java");
        linkedHashSet.add("Python");
        linkedHashSet.add("C");
        linkedHashSet.add("C++");
        linkedHashSet.add(null);

        System.out.println("LinkedHashSet: " + linkedHashSet);

//	----------------------------- TreeSet class implements SortedSet interface ------------------------------------------------------------------------------------------------------------------------------

        Set<Integer> integerTreeSet = new TreeSet<Integer>();

        integerTreeSet.add(31);
        integerTreeSet.add(32);
        integerTreeSet.add(33);
        integerTreeSet.add(34);
        integerTreeSet.add(35);

        // boolean contains = integerTreeSet.contains(32); 					// to check if the element is present in the set

        System.out.println("TreeSet: " + integerTreeSet);


    }

}
