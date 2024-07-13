function isMonotonic(nums: number[]): boolean {   
    const numsLength: number =  nums.length
    if(numsLength === 1){
        return true
    }

    let monotonicType: string = ''

    if(nums[0] > nums[numsLength - 1]){
        monotonicType = 'decreasing'
    }else if(nums[0] < nums[numsLength - 1]){
        monotonicType = 'increasing'
    }else if(nums[0] === nums[numsLength - 1]){
        monotonicType = 'same'
    }
    

    for(let i=1;i<=numsLength-1;i++){
        switch(monotonicType){
            case 'increasing':
                if(nums[i-1] > nums[i]){
                    return false
                } 
                break
            case 'decreasing':
                if(nums[i-1] < nums[i]) {
                    return false
                }
                break
            case 'same':
                if(nums[i-1] !== nums[i]) {
                    return false
                }
                break
        }
    }

    return true


};