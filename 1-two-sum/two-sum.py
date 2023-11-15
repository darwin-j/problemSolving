class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        left ,right = 0,1
        while  left <= len(nums)-1:
            if right <= len(nums)-1:
                if nums[left]+nums[right] == target:
                    return [left,right]
                right += 1
            else:
                left += 1
                right = left + 1
            


        