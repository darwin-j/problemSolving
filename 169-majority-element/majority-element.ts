function majorityElement(nums: number[]): number {
    const numsCount = {}
    let majorityElement = 0
    const numsLength = nums.length
    if(numsLength == 1 ) { 
        return nums[0] }
    nums.forEach((num) => {
        if (numsCount[num]) {
            numsCount[num] += 1
            if (numsCount[num] > numsLength/2  ) { 
                 majorityElement = num }
        } else {
            numsCount[num] = 1
        }

    })
    return majorityElement
};