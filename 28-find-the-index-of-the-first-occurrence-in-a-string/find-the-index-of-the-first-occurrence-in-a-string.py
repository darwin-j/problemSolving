class Solution:
    def strStr(self, haystack: str, needle: str) -> int:
        split_by_needle = haystack.split(needle)
        if(len(split_by_needle) > 1):
            return len(split_by_needle[0])
        else:
            return -1

        # print(haystack[len(needle)*1:len(needle)*2])