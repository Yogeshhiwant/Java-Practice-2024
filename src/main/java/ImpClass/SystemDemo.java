package ImpClass;

import java.util.stream.Stream;

public class SystemDemo {

	public static void main(String[] args) {

// ------------------ System.exit(0); problem ---------------------------------------------------------------------------------------------------------------------
//
//		int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8 };
//
//		for (int i = 0; i < arr.length; i++) {
//			if (arr[i] >= 5) {
//				System.out.println("exit...");
//
//		                // Terminate JVM
//		               //System.exit(0);
//				break;
//			} else
//				System.out.println("arr[" + i + "] = " + arr[i]);
//		}
//		
//		System.out.println("\nEnd of Program");
		
// ---------------------------------------------------------------------------------------------------------------------------------------------------------------		
		System.out.println("This is how we print with System.out");

		System.err.println("This is how we throw error with System.err");

		String x = System.console().readLine();
		System.out.println(x);




	}

}
