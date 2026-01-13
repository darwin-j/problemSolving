class Solution:
    def missingNumber(self, nums: List[int]) -> int:
        max_num = 0
        nums_length = len(nums)
        total_without_missing_num = 0
        total_with_missing_num = 0

        for i,num in enumerate(nums):
            if num > max_num:
                max_num = num

            total_without_missing_num += num

            total_with_missing_num += i

            if i == nums_length - 1:
                total_with_missing_num += i + 1
        
        return total_with_missing_num - total_without_missing_num
