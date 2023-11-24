class Solution:
    def matrixReshape(self, mat: List[List[int]], r: int, c: int) -> List[List[int]]:
        if len(mat)*len(mat[0]) != r*c:
            return mat
        reshapedMat = [[]]
        count = 0
        for i,row in enumerate(mat):
            for j,col in enumerate(mat[i]):
                if len(reshapedMat[count])>=c:
                    reshapedMat.append([])
                    count += 1
                reshapedMat[count].append(col)
        return reshapedMat



        