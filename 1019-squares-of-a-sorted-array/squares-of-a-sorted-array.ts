function sortedSquares(nums: number[]): number[] {
    if(nums.length === 0) return []
    const sortedSquares:number[] = Array(nums.length)

    let left:number = 0
    let right:number  = nums.length - 1
    let sortedSquaresIndex = sortedSquares.length - 1

    while(left <= right){
        const leftSquare:number = nums[left]**2
        const rightSquare:number = nums[right]**2

        if(leftSquare > rightSquare){
            sortedSquares[sortedSquaresIndex] = leftSquare
            left += 1
            sortedSquaresIndex -= 1
        } else {
            sortedSquares[sortedSquaresIndex] = rightSquare
            right -= 1
            sortedSquaresIndex -= 1

        }
    }

    return sortedSquares
};