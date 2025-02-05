function twoSum(nums: number[], target: number): number[] {
    let left = 0
    let right = 1

    while (left < right) {
        if (nums[left] + nums[right] === target) {
            return [left, right]
        }


        if (right === nums.length - 1) {
            left++
            right = left + 1
        } else {
            right++

        }

    }
};