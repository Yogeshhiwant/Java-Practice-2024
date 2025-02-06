package FAQs;

public class PermutationOfString {
    public static void main(String[] args) {

    }

    private static void permutation(String s, int l, int r) {
        if (l == s.length()) {
            System.out.println(s);
            return;
        }

        for (int i = l; i <= r; i++) {
            s = swap(s, l, i);
            permutation(s, l + 1, r);
            s = swap(s, l, i);
        }
    }

    private static String swap(String s, int l, int r) {
        return s.replace(s.charAt(l), s.charAt(r));
    }
}
