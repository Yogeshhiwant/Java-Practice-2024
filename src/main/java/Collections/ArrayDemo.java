package Collections;

import java.util.Arrays;

import ImpClass.Employee;

public class ArrayDemo {

	public static void main(String[] args) {
		// Array methods (java.util.Array)

		System.out.println("\nArray Methods :) !\n");

//------------ integer array ---------------------------------------------------------------------------------------------------------------------------------------------

		int[] intArr1 = { 1, 2, 3, 4, 5 };      // initializing at the start.
		int[] intArr2 = new int[5];				// Java-style syntax to declare an Array.
		int intArr[] = new int[3];				// C-style syntax to declare an Array.

		intArr2[0] = 4;
		intArr2[1] = 5;

		Arrays.sort(intArr2);        // Sorts the specified array into ascending numerical order.

//		System.out.println("IntArr1: "+intArr1);     	// we can't print array directly, we have to wrap with "java.util.Arrays.toString(intArr1))"
		System.out.println("IntArr1: " + Arrays.toString(intArr1));
		System.out.println("IntArr2: " + Arrays.toString(intArr2));


//----------------- string array ----------------------------------------------------------------------------------------------------------------------------------------

		String[] stringArr1 = { "Yogesh", "Sham", "Mahesh" };
		stringArr1[2] = "Sanket"; 											// it replaces the element at the specified index.

		String[] stringArr2 = new String[5];

		stringArr2[0] = "Urvi Chavan";
		stringArr2[1] = "Rasika Jadhav";
		stringArr2[2] = "Kranti Jadhav";
		stringArr2[3] = "Vaishnavi Bijwe";
		stringArr2[4] = "Anisha Borade";
//      stringArr2[5] = "Priyanka Sapkal";                                  // it throws ArrayIndexOutOfBoundsException if it exceeds the array size.

		Arrays.sort(stringArr1);

//		Arrays.copyOf(stringArr2,stringArr2.length);        // used to create a new array with a specific length and copies the contents of the original array to the new array.

//      System.out.println("StringArray1: "+stringArr1);                     // we can't print array directly, we have to wrap with "java.util.Arrays.toString(stringArr2)"
		System.out.println("StringArray1: "+ Arrays.toString(stringArr1));
//		System.out.println("StringArray2: " + Arrays.toString(stringArr2));


//--------------------- Employee(custom object) array ---------------------------------------------------------------------------------------------------------------------------------

		Employee[] employees = new Employee[5];
		employees[0] = new Employee(10, "Yogesh");
		employees[1] = new Employee(21, "Sham");
		employees[2] = new Employee(35, "Sanket");
		employees[3] = new Employee(14, "Varun");
		employees[4] = new Employee(5, "Sumit");

		for (Employee employee : employees) {
			//System.out.println(employee);
		}

		Arrays.sort(employees, Employee.NameComparator); // sort using Comparator
//		System.out.println(Arrays.toString(employees));

	}

}
