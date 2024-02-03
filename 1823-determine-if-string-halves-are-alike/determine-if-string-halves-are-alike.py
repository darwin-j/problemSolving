class Solution:
    def halvesAreAlike(self, s: str) -> bool:
        vowels = 'aeiouAEIOU'
        vowel_count = {
            "firstHalf":0,
            "secondHalf":0
        }
        left = 0
        right = len(s)-1
        while left < right:
            vowel_count["firstHalf"] += 1 if vowels.find(s[left]) != -1 else 0
            vowel_count["secondHalf"] += 1 if vowels.find(s[right]) != -1 else 0
            left += 1
            right -= 1
        return True if vowel_count["firstHalf"] == vowel_count["secondHalf"] else False
        