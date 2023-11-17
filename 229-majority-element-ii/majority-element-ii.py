class Solution:
    def majorityElement(self, nums: List[int]) -> List[int]:
        res=[]
        majCount = len(nums)/3
        numDict = {}
        for num in nums:
            if num not in numDict:
                numDict[num] = 1
            else:
                numDict[num] = numDict[num] + 1
            if numDict[num] > majCount:
                res.append(num)
        return list(set(res))
