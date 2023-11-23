class Solution:
    def luckyNumbers (self, matrix: List[List[int]]) -> List[int]:
        minInRows = [min(row) for row in matrix]
        maxInCols = [max(col) for col in zip(*matrix)]
        print(minInRows,maxInCols)
        luckyNums = []
        for num in minInRows:
            if num in maxInCols:
                luckyNums.append(num)
        return luckyNums

        

        