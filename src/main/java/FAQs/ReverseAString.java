package FAQs;

import java.util.Scanner;

public class ReverseAString {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str = sc.next();

        // 1. using StringBuffer class

   /*     StringBuffer buffer = new StringBuffer(str);
          StringBuffer rev = buffer.reverse();

          System.out.println("The reversed string is: "+rev);

    */

        // 2. using StringBuilder class

    /*    StringBuilder builder = new StringBuilder();
          builder.append(str);
          StringBuilder rev = builder.reverse();

          System.out.println("The reversed string is: "+rev);

     */

        // 3. using +(concatenation) operator

     /*    String rev = "";
           for (int i = str.length() - 1; i >= 0; i--) {
                rev += str.charAt(i);
            }
            System.out.println("The reversed string is: " + rev);

     */

        // 4. using charArray operator

        String rev = "";
        char[] chars = str.toCharArray();
        for (int i = str.length() - 1; i >= 0; i--) {
            rev += chars[i];
        }
        System.out.println("The reversed string is: " + rev);
    }
}
