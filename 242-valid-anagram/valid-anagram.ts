function isAnagram(s: string, t: string): boolean {
    const sMap = {}
    const tMap = {}

    if (s.length !== t.length) {
        return false
    }

    for (let i = 0; i < s.length; i++) {
        if (!sMap[s[i]]) {
            sMap[s[i]] = 1
        } else {
            sMap[s[i]] = sMap[s[i]] + 1
        }

        if (!tMap[t[i]]) {
            tMap[t[i]] = 1
        } else {
            tMap[t[i]] = tMap[t[i]] + 1
        }
    }

    for (const letter of Object.keys(sMap)) {
        if (sMap[letter] !== tMap[letter]) {
            return false
        }
    }

    return true
};