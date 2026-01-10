class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        i = 0
        x = 0

        count = 0

        while i < len(nums):
            if nums[i] > nums[x]:
                x += 1
                nums[x] = nums[i]
                count += 1
            
            i += 1

        return count + 1

