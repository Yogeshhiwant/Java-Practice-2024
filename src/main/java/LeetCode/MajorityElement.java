package LeetCode;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

// Moore's Voting Algorithm
public class MajorityElement {
    public static void main(String[] args) {
        System.out.println(findMajorityElement(new int[]{5, 1, 4, 1, 1}));
    }

    private static int findMajorityElement(int[] a) {
        int ansIndex = 0;
        int count = 1;
        for (int i = 1; i < a.length; i++) {
            if (a[i] == a[ansIndex]) {
                count++;
            } else {
                count--;
            }
            if (count == 0) {
                ansIndex = 0;
                count = 1;
            }
        }
        if (count > a.length / 2) {
            return ansIndex;
        } else {
            return -1;
        }

    }
}
