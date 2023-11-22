class Solution:
    def rotate(self, nums: List[int], k: int) -> None:
        for i in range(k):
            lastNum = nums[len(nums)-1]
            nums.pop()
            nums.insert(0,lastNum)
        