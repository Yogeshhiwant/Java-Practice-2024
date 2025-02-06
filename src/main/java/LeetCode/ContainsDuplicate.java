package LeetCode;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

//Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.
/*
Example 1:
Input: nums = [1,2,3,1]
Output: true

Explanation:
The element 1 occurs at the indices 0 and 3.

Example 2:
Input: nums = [1,2,3,4]
Output: false

Explanation:
All elements are distinct.
 */

public class ContainsDuplicate {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
    //    containsDuplicate(nums);


    }

    public static boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);

        }
        if (nums.length == set.size()) return true;
        return false;


        
        


    }
}

/*
Time complexity: 18 ms Beats 34.29%
Space complexity: 58.50 MB Beats 24.51%
 */