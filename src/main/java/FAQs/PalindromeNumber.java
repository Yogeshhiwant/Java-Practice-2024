package FAQs;

import java.util.Collections;
import java.util.Objects;
import java.util.Scanner;

public class PalindromeNumber {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        int org_num = num;

        // 1. using algorithm
     /*    int rev = 0;
           while (num != 0){
             rev = rev*10 + num%10;
             num = num/10;
        }
     */

        // 2. using StringBuilder class
        StringBuilder builder = new StringBuilder();
        builder.append(num);
        StringBuilder rev = builder.reverse();

        if (rev.toString().equals(String.valueOf(org_num))) {
            System.out.println(org_num + " is a Palindrome number");
        } else {
            System.out.println(org_num + " is not a Palindrome number");
        }

    }
}
