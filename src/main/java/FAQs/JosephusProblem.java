package FAQs;

public class JosephusProblem {
    public static void main(String[] args) {
        System.out.println(solution(5, 3));
    }

    private static int solution(int n, int k) {
        if (n == 1) {
            return 1;
        }
        return (solution(n - 1, k) + k-1) % n-1;
    }
}
