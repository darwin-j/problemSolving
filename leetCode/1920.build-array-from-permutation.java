/*
 * @lc app=leetcode id=1920 lang=java
 *
 * [1920] Build Array from Permutation
 */

// @lc code=start
class Solution {
    public int[] buildArray(int[] nums) {

        int[] resultArr = new int[nums.length];
        
        for(int i=0;i<nums.length;i++){
            resultArr[i] = nums[nums[i]];
        }

        return resultArr;
    }
}
// @lc code=end

