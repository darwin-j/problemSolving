class Solution:
    def toLowerCase(self, s: str) -> str:
        string_list = list(s) 
        for index,letter in enumerate(string_list):
            if ord(letter) >= 65 and ord(letter) <= 90:
                string_list[index] = chr(ord(letter) + 32)
        return ''.join(string_list)


        