class Solution:
    def isPalindrome(self, s: str) -> bool:
        onlyAlphhaString = []
        s = s.strip()
        for char in s:
            asscii_of_char = ord(char)
            if (asscii_of_char >= 97 and asscii_of_char <= 122) or char.isdigit():
                onlyAlphhaString.append(char)
            elif(asscii_of_char >= 65 and asscii_of_char <= 90):
                onlyAlphhaString.append(chr(asscii_of_char+32))
        onlyAlphhaString = ''.join(onlyAlphhaString)
        if len(onlyAlphhaString)==0:
            return True
        else:
            return True if onlyAlphhaString == onlyAlphhaString[::-1] else False
        
