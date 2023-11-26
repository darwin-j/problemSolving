class Solution:
    def rotate(self, matrix: List[List[int]]) -> None:
        l1,r1 = 0,len(matrix)-1
        while l1<r1:
            matrix[l1],matrix[r1] = matrix[r1],matrix[l1]
            l1 += 1
            r1 -= 1
        
        trans = [list(row) for row in zip(*matrix)]
        for i in range(len(matrix)):
            for j in range(len(matrix[i])):
                matrix[i][j] = trans[i][j]
        
