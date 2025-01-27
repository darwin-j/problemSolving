function longestCommonPrefix(strs: string[]): string {
    // if(strs.length === 1){
    //     return strs[0]
    // }
    let prefix = ''

    strs.sort()

    const firstStr = strs[0]
    const lastStr = strs[strs.length - 1]

    // if(!firstStr.length || !lastStr.length){
    //     return ''
    // }

    for (let i = 0; i<firstStr.length; i++){
        
        if(firstStr[i] === lastStr[i]){
            
            prefix += firstStr[i]
           
        } else {
            return prefix
        }
    }

    return prefix

};