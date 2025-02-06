package Codility;

import java.util.Arrays;

public class CyclicRotation {
    public static void main(String[] args) {
        int[] A = {3, 8, 9, 7, 6};  // {9,7,6,3,8}
        int k = 3;

        System.out.println(Arrays.toString(solution(A, k)));
    }

    public static int[] solution(int[] A, int K) {
        if (A.length != 0) {
            while (K != 0) {
                int last = A[A.length - 1];
                for (int i = A.length - 1; i > 0; i--) {
                    A[i] = A[i - 1];
                }
                A[0] = last;
                K--;
            }
        }
        return A;
    }

}
