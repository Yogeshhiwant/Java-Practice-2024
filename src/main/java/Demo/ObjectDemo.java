package Demo;

import java.time.LocalDateTime;
import java.util.Date;

//import java.util.Iterator;

//public class LexJava {

//	private double balance = 500.00;
//	int accId;
//	
//
//	public void getBalance(int accId, double balance) {
//		int id = accId;
//		double value = balance;
//		System.out.println("The balance for the customer " + id + " is: " + value);
//		
//	}
//
//	public static void main(String[] args) {
//		LexJava lex = new LexJava();
//		lex.getBalance(12345, 30123);
//
//	}

//	public static void main(String[] args) {
//		// declaring the array
//
//		int marks[] = { 312, 23, 45, 67, 89 };
//		String subjects[] = { "Mathematics", "Science", "English", "Physics", "Marathi" };
//
//		for (int i : marks) {
//			System.out.println(i);
//		}
//		for (String s : subjects) {
//			System.out.println("Subject at position "+subjects[0]+" is: "+s);
//		}
//
//	}

////	public static void main(String[] args) {
////		int marksArray[] = new int[4];
////		String[] subjectsArray = {"math","science", "English", "Physics", "Marathi"};
////		
////		marksArray[0] = 3;
////		marksArray[1] = 5;
////		for (String string : subjectsArray) {
////			System.out.println(string);
////		}
////		System.out.println(marksArray[0]); 		//It will throw ArrayIndexOutOfBoundsException if we exceed the index to 5
////	}
////}
//
////	public static void main(String[] args) {
////		int[][] myMultidiamensionalArray = { { 11, 23, 45 }, { 23, 45, 89 }, { 34, 67, 90 } };
////
////		for (int i = 0; i < 3; i++) {
////			for (int j = 0; j < 3; j++) {
////				System.out.println(myMultidiamensionalArray[i][j] + " ");
////			}
////			System.out.println();
////		}
////		
////
////	}	
////
////	public static void main(String[] args) {
////		Circle circle = new Circle();
////		Square square = new Square();
////		square.measure();
////		circle.draw();
////		square.fill("Red");
////	}
//	
//	
//	
//}

public class ObjectDemo {
//	enum PizzaSize{
//		SMALL, MEDIUM, LARGE, EXTRALARGE
//	}
//	
//	public static void main(String[] args) {
//		PizzaSize pizzaSize = PizzaSize.EXTRALARGE;
//		System.out.println(pizzaSize);
//	}

	public static void main(String[] args) {
		Employee emp1 = new Employee(1, "Yogesh");
		Employee emp2 = new Employee(2, "Hiwant");

		
			LocalDateTime dateTime = LocalDateTime.now();
			
			System.out.println(dateTime.toLocalDate());
			System.out.println(dateTime.getDayOfMonth());
			System.out.println(dateTime.getMinute());
			System.out.println(dateTime.getMonth());
//		System.out.println(emp1.getClass());
//		System.out.println(emp2.hashCode());
	}

}
