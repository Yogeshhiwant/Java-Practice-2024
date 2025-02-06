package LeetCode;

public class KadaneAlgorithm {
    public static void main(String[] args) {
        System.out.println(maxSumSubArray(new int[]{5, -4, -2, 6, -1}));
    }

    private static int maxSumSubArray(int[] a) {
        int maxSum = Integer.MIN_VALUE;
        int sum = 0;


        for (int i = 0; i < a.length; i++) {
            sum += a[i];
            if (sum > maxSum) {
                maxSum = sum;
            }
            if (sum < 0) {
                sum = 0;
            }
        }
        return maxSum;
    }
}
