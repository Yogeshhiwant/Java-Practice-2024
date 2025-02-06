package LeetCode;


// Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
/*
Example 1:

Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
Example 2:

Input: nums = [3,2,4], target = 6
Output: [1,2]
Example 3:

Input: nums = [3,3], target = 6
Output: [0,1]
 */


import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSumProblem {
    public static void main(String[] args) {

        int[] nums = {2, 11, 7, 5};
        int target = 9;
        twoSum(nums, target);

    }

    private static int[] twoSum(int[] nums, int target) {

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            } else {
                map.put(nums[i], i);
            }
        }
        throw new IllegalArgumentException("");
    }
}

// Time complexity: O(n)  where n is length of the array.
// Space complexity: O(n)  because we are using hashMap.