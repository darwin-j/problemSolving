class Solution:
    def rotate(self, nums: List[int], k: int) -> None:
        lengthOfNums = len(nums)
        for i in range(k%lengthOfNums):
            lastNum = nums[lengthOfNums-1]
            nums.pop()
            nums.insert(0,lastNum)
        