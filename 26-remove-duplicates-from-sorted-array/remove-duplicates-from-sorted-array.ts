function removeDuplicates(nums: number[]): number {
    let left = 1
    let right = 1

    for (let i = 1; i < nums.length; i++) {
        if (nums[right] != nums[right-1] ) {
            nums[left] = nums[right]
            left += 1
        }
        right += 1
    }

    return left
};