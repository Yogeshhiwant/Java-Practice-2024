package ImpClass;

public class StringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
//		String.format(null, args);               // Returns a formatted string using the specified format string and arguments. 
	
		
		
//		System.out.println(String.valueOf(false));
//		System.out.println(String.valueOf('f'));
//		System.out.println(String.valueOf(23));
		
		
//--------------------------------------  StringBuilder class --------------------------------------------------------------------------------------		

// StringBuilder is not thread-safe.
// Two or more threads can call the StringBuilder at the same time(simultaneously).
// StringBuilder is more efficient as compared to StringBuffer.
		
		
		
		StringBuilder stringBuilder = new StringBuilder("Yogesh");
	
						// 
		stringBuilder.setCharAt(0, 'Y');	  					// The character at the specified index is set.
		stringBuilder.insert(1, "o");							// Inserts the string at specified position. 
		stringBuilder.delete(1, 2);								// Removes the characters in a substring from START to END.
		stringBuilder.deleteCharAt(5);							// Removes the char at the specified position .
		stringBuilder.append(" Hiwant"); 						// Appends the specified string.
		stringBuilder.lastIndexOf("n");							// Returns the index within this string of the last occurrence of the specified substring.
		stringBuilder.lastIndexOf("w", 2);						// Returns the index within this string of the last occurrence of the specified substring, searching backward starting at the specified index. 
		stringBuilder.reverse();								// Returns the reverse of the sequence.
		

		
		
		System.out.println(stringBuilder.reverse());
		
		
		
//--------------------------------------  StringBuffer class --------------------------------------------------------------------------------------
		
// StringBuffer is thread-safe.
// Two or more threads cannot call the StringBuffer at the same time(simultaneously).
// StringBuffer is less efficient as compared to StringBuilder.
		
		
		StringBuffer stringBuffer = new StringBuffer("Yogesh");
		
		
		
		
	}

}



















