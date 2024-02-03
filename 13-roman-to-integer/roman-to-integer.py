class Solution:
    def romanToInt(self, s: str) -> int:
        roman_num = {
            "I":1,
            "V":5,
            "X":10,
            "L":50,
            "C":100,
            "D":500,
            "M":1000,
            "IV":4,
            "IX":9,
            "XL":40,
            "XC":90,
            "CD":400,
            "CM":900
        }

        ans = 0
        sList = list(s)
        for index,letter in enumerate(sList):
            if index+1 < len(sList) and roman_num.get(letter+sList[index+1]) :
                ans += roman_num[letter+sList[index+1]]
                sList.pop(index+1)
            else:       
                ans += roman_num[letter]
        return ans
            


