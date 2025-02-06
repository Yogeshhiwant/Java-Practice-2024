package Collections;

import java.util.Stack;

import ImpClass.Employee;

public class StackDemo {

	public static void main(String[] args) {
		// Stack methods  (java.util.Stack)

        System.out.println("\nStack Methods :) !\n");

//----------------------------- integer stack -------------------------------------------------------------------------------------------------------------------------

        Stack<Integer> integerStack = new Stack<Integer>();
        integerStack.push(41);									// push the item on the top of the stack
        integerStack.push(42);
        integerStack.push(43);
        integerStack.push(44);
        integerStack.push(45);
        integerStack.push(46);

        System.out.println(integerStack);

        Integer peek = integerStack.peek();                     // peek shows element at the top of the stack
        Integer pop = integerStack.pop();                       // pop removes element at the top of the stack
        boolean isEmpty = integerStack.empty();                 // check whether Stack is empty ?
        integerStack.remove(2);                               	// Removes the element at the specified position in this Vector.

        System.out.println("peek element: " + peek);
        System.out.println("pop element: " + pop);

//----------------------------- string stack -------------------------------------------------------------------------------------------------------------------------

        Stack<String> stringStack = new Stack<String>();
        stringStack.add("xyz");
        stringStack.add("abc");
        stringStack.add("pqr");
        stringStack.add("lmn");
        stringStack.add("ijk");
        
        stringStack.search("pqr");								// Returns the 1-based position where an object is on this stack.
        
        System.out.println(stringStack);
        System.out.println(stringStack.empty());

//----------------------------- Employee(custom object) stack -------------------------------------------------------------------------------------------------------------------------

        Employee emp1 = new Employee(21,"Pramila");
        Employee emp2 = new Employee(22,"Ritvik");

        Stack<Employee> employeeStack = new Stack<Employee>();
        employeeStack.push(emp1);
        employeeStack.push(emp2);


        employeeStack.empty();									// Tests if this stack is empty.
	}
}
