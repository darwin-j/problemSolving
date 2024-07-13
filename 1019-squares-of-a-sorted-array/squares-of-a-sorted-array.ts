function sortedSquares(nums: number[]): number[] {
    if(nums.length === 0) return []
    const sortedSquares:number[] = []

    let left:number = 0
    let right:number  = nums.length - 1

    while(left <= right){
        const leftSquare:number = nums[left]**2
        const rightSquare:number = nums[right]**2

        if(leftSquare > rightSquare){
            sortedSquares.unshift(leftSquare)
            left += 1
        } else {
            sortedSquares.unshift(rightSquare)
            right -= 1
        }
    }

    return sortedSquares
};