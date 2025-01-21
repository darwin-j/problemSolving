function containsDuplicate(nums: number[]): boolean {
    const numsSet = new Set(nums)
    return numsSet.size === nums.length ? false : true
};