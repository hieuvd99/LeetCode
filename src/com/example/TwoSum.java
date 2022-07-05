package com.example;

/*
 * Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
 * 
 * Input: nums = [2,7,11,15], target = 9 
 * Output: [0,1] 
 * Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
 * 
 * Input: nums = [3,2,4], target = 6 
 * Output: [1,2]
 */

public class TwoSum {
 
	public static int[] twoSum(int[] nums, int target) {
		int results[] = new int[2];
		for(int i = 0; i < nums.length; i++) {
			for(int j = i + 1; j < nums.length; j++) {
				if((nums[i] + nums[j]) == target) {
					results[0] = i;
					results[1] = j;
					break;
				}
			}
		}
		return results;
    }
    public static void main(String[] args) {
  
        // Array taken for consideration
        int arr[] = { 1, 3, 3, 4, 5, 6 };
        int[] ans = twoSum(arr, 4);
        for (int element: ans) {
            System.out.println(element);
        }
      
        
    }
}
