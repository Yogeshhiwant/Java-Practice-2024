package Codility;

import java.util.Arrays;

public class PermCheck {
    public static void main(String[] args) {
        int[] A = {4, 1, 3};
        System.out.println(solution(A));

    }

    public static int solution(int[] A) {
        int res = 0;
        Arrays.sort(A);

        for (int i = 0; i < A.length; i++) {
            if (A[i] == i+1) {
                res = 1;
            } else {
                res = 0;
            }
        }
        return res;
    }
}
