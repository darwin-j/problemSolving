/*
 * @lc app=leetcode id=35 lang=java
 *
 * [35] Search Insert Position
 */

// @lc code=start
class Solution {

    public static int binarySearch(int[] arr, int left, int right, int numToFind) {
        if (left > right) {
            return -1;
        }

        int mid = (left + right) / 2;

        if (numToFind == arr[mid]) {
            return mid;
        }

        if (mid > numToFind) {
            return mid;
        }

        if (numToFind < arr[mid]) {
            return binarySearch(arr, left, mid - 1, numToFind);
        }

        return binarySearch(arr, mid + 1, right, numToFind);

    }

    public int searchInsert(int[] nums, int target) {

        int result = binarySearch(nums, 0, nums.length - 1, target);

        return result;
    }
}
// @lc code=end
