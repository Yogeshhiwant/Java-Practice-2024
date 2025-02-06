package FAQs;

import java.util.Scanner;

public class PalindromeString {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the text: ");
        String str = sc.next();

        // 1. using algorithm
    /*
        String rev = "";
        int length = str.length();
        for (int i = length - 1; i >= 0; i--) {
            rev += str.charAt(i);
        }
     */
        // 2. using StringBuilder class
        StringBuilder builder = new StringBuilder();
        builder.append(str);
        StringBuilder rev = builder.reverse();

        if (rev.toString().equals(str)) {
            System.out.println(str + " is a Palindrome String");
        } else {
            System.out.println(str + " is not a Palindrome String");
        }

        System.out.println(isPalindrome("racecar"));
    }

    // 3. Using 2 pointers

    private static boolean isPalindrome(String s) {
        boolean res = false;
        for (int i = 0; i < s.length(); i++) {
            for (int j = s.length() - 1; j >= 0; j--) {
                if (s.charAt(i) != s.charAt(j)) {
                    return res;
                } else {
                    res = true;
                }
            }
        }
        return res;
    }

    // 4. Using recursion
    private static boolean isPalindrome(String s, int l, int r) {
        if (l >= r) return true;
        if (s.charAt(l) != s.charAt(r)) return false;

        return isPalindrome(s, l + 1, r - 1);
    }
}
