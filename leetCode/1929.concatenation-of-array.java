/*
 * @lc app=leetcode id=1929 lang=java
 *
 * [1929] Concatenation of Array
 */

// @lc code=start
class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] arr = new int[nums.length * 2];
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (nums.length == i) {
                j = 0;
            }
            arr[i] = nums[j];
            System.out.println(j);
            j++;
        }
        return arr;

    }
}
// @lc code=end
