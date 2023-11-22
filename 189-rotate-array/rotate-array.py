class Solution:
    def rotate(self, nums: List[int], k: int) -> None:
        lengthOfNums = len(nums)
        k = k%lengthOfNums
        def rotateArr(start,end):
            while start < end:
                nums[start],nums[end] = nums[end],nums[start]
                start += 1
                end -= 1
        if k != 0:
            rotateArr(0,lengthOfNums-1)
            rotateArr(0,k-1)
            rotateArr(k,lengthOfNums-1)
        