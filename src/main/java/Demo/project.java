package Demo;

import java.util.Iterator;

public class project {
 public static void main(String[] args) {
	
	 //find the sum of those elements that appears only once , you have an array [10,15,15,20,10,30];
	 
	
	 int demoArr[] = {10,15,15,20,10,30,35};
	 
	 int result = sum(demoArr);
	 System.out.println("Sum is:"+result);
   }
 
 	public static int sum(int[] arr) {
 		int sum = 0;
 		
 		for (int i = 0; i < arr.length; i++) {
			boolean isUnique = true;
			for (int j = 0; j < arr.length; j++) {
				if (i != j && arr[i] == arr[j]) {
						isUnique = false;
						break;
				}
			}
			if (isUnique) {
				sum += arr[i];
			}
		}
 		
 		return sum;
	}
 }
	 

