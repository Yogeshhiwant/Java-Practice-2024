package WrapperClass;

public class IntegerDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Integer x = 1041;


		Integer.max(10,20);											// returns the greater of two int values as if by calling Math.max.
		Integer.min(10,20);											// Returns the smaller of two int values as if by calling Math.min.
		System.out.println(Integer.toBinaryString(x));						// Returns a string representation of the integer argument as an unsigned integer in base 2.

		System.out.println(Integer.toString(x,16));					// Returns a string representation of the first argument in the radix specified by the second argument.

		System.out.println(Integer.MAX_VALUE);   		// 2147483647
		System.out.println(Integer.MIN_VALUE);			//-2147483648


	}

}
