class Solution:
    def generate(self, numRows: int) -> List[List[int]]:
        numstriangle = []
        numstriangle.append([1])
        for i in range(numRows-1):
            numArr = []
            numArr.append(1)
            for j in range(0,i):
                numArr.append(numstriangle[i][j]+numstriangle[i][j+1])
            numArr.append(1)
            numstriangle.append(numArr)
        return numstriangle


        