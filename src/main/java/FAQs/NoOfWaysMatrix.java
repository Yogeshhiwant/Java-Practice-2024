package FAQs;

// Find the number of ways in n * m matrix using recursion.
public class NoOfWaysMatrix {
    public static void main(String[] args) {
        System.out.println(count(4,3));
    }

    private static int count(int n, int m) {
        if (n == 1 || m == 1) {
            return 1;
        }
        return count(n - 1, m) + count(n, m - 1);
    }

}
