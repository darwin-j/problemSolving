class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        numsLength = len(nums)
        removeDups = list(dict.fromkeys(nums))
        uniqueNumsLength = len(removeDups)
        for index,num in enumerate(nums):
            if index < len(removeDups):
                nums[index] = removeDups[index]
            else:
                nums[index] = '_'
        return uniqueNumsLength



