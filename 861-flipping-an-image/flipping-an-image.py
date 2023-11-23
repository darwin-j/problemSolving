class Solution:
    def flipAndInvertImage(self, image: List[List[int]]) -> List[List[int]]:
        for numArray in image:
            l,r = 0,len(numArray)-1
            
            
            while l <= r:
                if l != r:
                    numArray[l],numArray[r] = numArray[r],numArray[l]
                    if numArray[l] == 0:
                        numArray[l] = 1
                    else:
                        numArray[l] = 0
                    if numArray[r] == 0:
                        numArray[r] = 1
                    else:
                        numArray[r] = 0
                else:
                    if numArray[l] == 0:
                        numArray[l] = 1
                    else:
                        numArray[l] = 0
                l += 1
                r -= 1
        return image

        