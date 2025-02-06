package FAQs;

// InsertionSort
public class InsertionSort {
    public static void main(String[] args) {
        int[] a = {-1, 3, 5, 290, 1, 5, 3, 51, 90, 34, 56, 32};

        for (int i = 1; i < a.length; i++) {
            int temp = a[i];
            int j = i - 1;
            while (j >= 0 && a[j] > temp) {
                a[j + 1] = a[j];
                j--;
            }
            a[j + 1] = temp;
        }
    }
}
