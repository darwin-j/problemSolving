class Solution:
    def findMaxConsecutiveOnes(self, nums: List[int]) -> int:
        max_consecutive_1s_count = 0

        current_consecutive_1s_count = 0

        for i in range(0,len(nums)):
            if nums[i] != 1:
                current_consecutive_1s_count = 0
                continue

            current_consecutive_1s_count += 1

            if current_consecutive_1s_count > max_consecutive_1s_count:
                    max_consecutive_1s_count = current_consecutive_1s_count

        return max_consecutive_1s_count
        