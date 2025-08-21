//Two Sum Problem
/*
Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.



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
class Solution {
    public int[] twoSum(int[] nums, int target) {
        //We will use a nested for loop

        // Declare the loops and iterate through the list
        for (int i = 0; i < nums.length; i++){
            for (int j = i + 1; j < nums.length; j++){
                //The main condition to determine addition to the target. 
                if (nums [i] + nums [j] == target){
                    int [] returnArr = new int [2];
                    returnArr[0] = i; 
                    returnArr[1] = j;
                    return returnArr;

                }
            }
        }
        return null;
    }
}