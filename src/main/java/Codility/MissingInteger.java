package Codility;

import java.util.Arrays;

public class MissingInteger {
    public static void main(String[] args) {

        int[] A = {1, 3, 6, 4, 1, 2};
        System.out.println(solution(A));
    }
    public static int solution(int[] A){

        Arrays.sort(A);
        int min = 1;
        for (int i : A) {
            if(i == min){
                min++;
            }
        }
        return min;
    }
}
