package Codility;

public class NumberSolitaire {
    public static void main(String[] args) {

        int[] a = {1, -2, 0, 9, -1, -2};
        System.out.println(solution(a));
    }

    public static int solution(int[] a) {
        int[] r = new int[a.length];

        for (int i = 0; i < r.length; i++) {
            if (i == 0) {
                r[i] = a[i];
            } else {

                int maxOnThisSquare = Integer.MIN_VALUE;
                for (int j = 1; j <= 6; j++) {
                    if (i - j >= 0) {
                        maxOnThisSquare = Math.max(maxOnThisSquare, r[i - j] + a[i]);
                    }
                }
                r[i] = maxOnThisSquare;
            }
        }
        return r[r.length - 1];
    }
}
