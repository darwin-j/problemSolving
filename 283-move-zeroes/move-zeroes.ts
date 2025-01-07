/**
 Do not return anything, modify nums in-place instead.
 */
function moveZeroes(nums: number[]): void {
    let leftIndex = 0
    let rightIndex = 0

    while (rightIndex < nums.length) {
        if (nums[rightIndex] !== 0) {
            const temp = nums[rightIndex]
            nums[rightIndex] = nums[leftIndex]
            nums[leftIndex] = temp

            leftIndex += 1

        }

        rightIndex += 1
    }
};