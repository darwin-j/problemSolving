function majorityElement(nums: number[]): number {
    const numsCount = {}

    for (const num of nums) {
        if (!numsCount[num]) {
            numsCount[num] = 1
        } else {
            numsCount[num] += 1
        }

        if(nums.length/2 < numsCount[num]){
            return num
        }

    }
};