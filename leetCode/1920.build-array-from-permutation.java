/*
 * @lc app=leetcode id=1920 lang=java
 *
 * [1920] Build Array from Permutation
 */

// @lc code=start
class Solution {
    public int[] buildArray(int[] nums) {
        int[] result = new int[nums.length];
        int i =0;
        for(int num :nums){
            result[i] = nums[num];
            i++;
        }

        return result;
    }
}
// @lc code=end

