package FAQs;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

// Given an array A of N integers, returns the smallest positive integer(greater than 0) that does not occur in A.

public class SmallestPositiveInteger {
    public static void main(String[] args) {

        int[] A = {1, 3, 6, 4, 1};

        Solution solution = new Solution();
        solution.solution(A);
    }
}

class Solution {

    public void solution(int[] A) {
        int length = A.length;
        Set<Integer> integerSet = new HashSet<>();

        for (int i : A) {
            if (i > 0) integerSet.add(i);
        }
        for (int j : A) {
            if (!integerSet.contains(j)) System.out.println(j);
        }
        System.out.println(length+1);
    }
}