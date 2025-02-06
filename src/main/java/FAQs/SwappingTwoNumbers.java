package FAQs;

public class SwappingTwoNumbers {
    public static void main(String[] args) {

        // Logic 1 using third variable
        int a = 10;
        int b = 20;
        System.out.println("Before swapping values are: " + a + " " + b);

    /*    int t = a;
        a = b;
        b = t;

         System.out.println("After swapping values are: " + a + " " + b);
     */
        //Logic 2 using + & - operator
    /*
        a = a+b;  // 10+20=30
        b = a-b;  // 30-20=10
        a = a-b;  // 30-10=20

         System.out.println("After swapping values are: " + a + " " + b);
     */

        //Logic 3 using * & / operator
        //here a and b values should be not zero;

        /*
        a = a*b;  // 10*20=200
        b = a/b;  // 200/20=10
        a = a/b;  // 200/10=20

         System.out.println("After swapping values are: " + a + " " + b);
         */

        //Logic 4 using bitwise XOR(^) operator

    /*
        a = a^b;  // 10^20 = 30
        b = a^b;  // 30^20 = 10
        a = a^b;  // 30^10 = 20

         System.out.println("After swapping values are: " + a + " " + b);
     */

        // Logic 5 using single statement

        b = a + b - (a = b);

        System.out.println("After swapping values are: " + a + " " + b);

    }
}
