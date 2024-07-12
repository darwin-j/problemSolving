/**
 * @param {number} n
 * @return {Function} counter
 */
var createCounter = function(n) {
    let callCount = -1
    return function() {
callCount += 1
        return n + callCount
    };
};

/** 
 * const counter = createCounter(10)
 * counter() // 10
 * counter() // 11
 * counter() // 12
 */