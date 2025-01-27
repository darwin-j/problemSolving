/**
 * @param {string[]} strs
 * @return {string[][]}
 */
var groupAnagrams = function(strs) {
    let result = {}

    for (const str of strs) {
        let alphaCount = Array(26).fill(0)
        const strCharsArr = [...str]
        strCharsArr.forEach((letter) => {
            const letterIndex = letter.charCodeAt(0) - 'a'.charCodeAt(0)
            alphaCount[letterIndex] += 1
        })

        if (!result[alphaCount]) {
            result[alphaCount] = []
        } 

        result[alphaCount].push(str)


    }

    return Object.values(result)
};