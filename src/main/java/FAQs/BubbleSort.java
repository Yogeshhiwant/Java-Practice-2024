package FAQs;

import java.util.Arrays;

// BubbleSort
public class BubbleSort {
    public static void main(String[] args) {

        int[] a = {-1, 3, 5, 290, 1, 5, 3, 51, 90, 34, 56, 32};

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length - 1; j++) {
                if (a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
        System.out.println("Sorted array: " + Arrays.toString(a));
    }
}

// Time complexity O(n2) due to two for loops.