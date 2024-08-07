/**
 * @param {number[]} nums
 * @param {Function} fn
 * @param {number} init
 * @return {number}
 */
var reduce = function(nums, fn, init) {

    if(nums.length === 0){
        return init
    }

    let reducedValue = init

    for(i = 0;i<nums.length;i++){
        reducedValue = fn(reducedValue,nums[i])
    }

    return reducedValue
};