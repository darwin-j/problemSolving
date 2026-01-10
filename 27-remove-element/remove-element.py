class Solution:
    def removeElement(self, nums: List[int], val: int) -> int:
        pointer_1 = 0
        pointer_2 = 0

        count =0 

        while pointer_1 < len(nums):
            if nums[pointer_1] != val:
                nums[pointer_2] = nums[pointer_1]
                pointer_2 += 1
                count += 1    

            pointer_1 += 1
        
        print(nums,count)

        return count



            
            