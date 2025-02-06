package Collections;

import java.util.ArrayList;
import java.util.List;

import ImpClass.Employee;

public class ListDemo {

    public static void main(String[] args) {
        //  List interface  (java.util.List)

//      interface: List
//      implementing classes: ArrayList, LinkedList, Vector, Stack
//      ArrayList class extends List interface.

        System.out.println("\nList Methods :) !\n");

//----------------- integer list ----------------------------------------------------------------------------------------------------------------------------------------

        List<Integer> integerList = new ArrayList<Integer>();      // integer List
        integerList.add(11);
        integerList.add(15);
        integerList.add(18);
        integerList.add(21);
        integerList.add(2, 25);

        System.out.println("IntegerList: " + integerList);


//----------------- string list ----------------------------------------------------------------------------------------------------------------------------------------

        List<String> stringList = new ArrayList<String>();          // String List

        stringList.add("Infosys Limited");
        stringList.add("Mindtree");
        stringList.add("Wipro");
        stringList.add("Emerson");
        stringList.add("Persistent");
        stringList.add(1, "Microsoft");

//    stringList.clear();                                // Removes all the elements from this list
//    stringList.remove(1);                              // Removes the element at the specified position in this list (optional operation).


        System.out.println("StringList: " + stringList);


//--------------------- Employee(custom object) list ---------------------------------------------------------------------------------------------------------------------------------

        List<Employee> employeeList = new ArrayList<Employee>();                             // object List

        employeeList.add(0, new Employee(21, "Akash Pawar"));         // storing at index
        employeeList.add(new Employee(22, "Mayur Mahale"));
        employeeList.add(new Employee(23, "Sanket Parkhe"));
        employeeList.add(new Employee(24, "Akash Khandait"));
        Employee listEmployee = new Employee(25, "Pratik Bandal");

        employeeList.add(listEmployee);

        System.out.println("EmployeeList: " + employeeList);

//    System.out.println(employeeList.indexOf(listEmployee));                     // returns -1 if list does not contain the item

    }

}
