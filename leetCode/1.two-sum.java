/*
 * @lc app=leetcode id=1 lang=java
 *
 * [1] Two Sum
 */

// @lc code=start
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2] ;
        for(int i=0;i<nums.length;i++){
            if(i<nums.length-1){
                for(int j=0;j<nums.length;j++){
                   //System.out.println(nums[i] + nums[j]);
                    if(nums[i] + nums[j] == target && i != j){
                         result[0] = i;
                         result[1] = j;  
                         return result;
                    }
                  
                }
            }
              
        }

        return result;
    }
}
// @lc code=end

