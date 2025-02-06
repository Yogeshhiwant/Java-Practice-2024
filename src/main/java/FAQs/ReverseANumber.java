package FAQs;

import java.util.Scanner;

public class ReverseANumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = sc.nextInt();   //12345

        // 1. using algorithm

      /*  int rev = 0;
        while (num != 0){
            rev = rev*10 + num%10;     // 0*10 + 12345 % 10 = 0 + 5 = 5 //  // 5*10 + 1234 % 10 = 50 + 4 = 54 // // 54*10 + 123 % 10 = 540 + 3 = 543
            num = num/10;              // 543*10 + 12 % 10 = 5430 + 2 = 5432  // 5432*10 + 1 % 10 = 54320 + 1 = 54321
        }

        System.out.println("Reversed number is: "+ rev);
       */

        // 2. using StringBuffer class

      /*  StringBuffer buffer = new StringBuffer(String.valueOf(num));
          StringBuffer rev = buffer.reverse();

          System.out.println("Reversed number is: "+ rev);
       */

        // 3. using StringBuilder class

        StringBuilder builder = new StringBuilder();
        builder.append(num);
        StringBuilder rev = builder.reverse();

        System.out.println("Reversed number is: " + rev);
    }
}
