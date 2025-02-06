package Collections;

import java.util.Vector;

import ImpClass.Employee;

public class VectorDemo {

	public static void main(String[] args) {
		// Vector methods (java.util.Vector)

		System.out.println("\nVector Methods :) !\n");

		Vector<Integer> integerVector = new Vector<Integer>();
		integerVector.add(61);			
		integerVector.add(62);
		integerVector.add(63);
		integerVector.add(64);
		integerVector.add(2, 65);

		integerVector.capacity();  						// Returns the current capacity of this vector.
		integerVector.clear();							// Removes all of the elements from this Vector.
		integerVector.elementAt(1); 					// Returns the component at the specified index.
		integerVector.subList(2, 5);					// portion of this List between fromIndex (inclusive), and toIndex (exclusive).
		integerVector.firstElement(); 					// Returns the first component (the item at index 0) of this vector.
		integerVector.lastElement();					// Returns the last component of this vector.
		
		
		String[] stringArr1 = { "Yogesh", "Sham" };
		System.out.println("IntegerVector: " + integerVector);
		
		integerVector.copyInto(stringArr1); 			// Copies the components of this vector into the specified array.

		
		Vector<Employee> empVector = new Vector<Employee>();
		empVector.add(new Employee(21, "Pramila"));
		empVector.add(new Employee(22, "Ritvik"));
		
		empVector.isEmpty();							// Tests if this vector has no components.
		empVector.toArray();							// Returns an array containing all of the elements in this Vector
		
		
		
		
		
		
	}

}













