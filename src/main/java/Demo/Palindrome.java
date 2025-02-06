package Demo;

public class Palindrome {
    public static void main(String[] args) {

        String s = "yogesh";

        System.out.println(isPalindrome(s));

    }

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
}
