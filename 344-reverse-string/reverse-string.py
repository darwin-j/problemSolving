class Solution:
    def reverseString(self, s: List[str]) -> None:
        """
        Do not return anything, modify s in-place instead.
        """
        start_pointer = 0
        s_len = len(s)
        end_pointer = s_len - 1

        for i in range(0,round(s_len/2)):
            temp = s[start_pointer]
            s[start_pointer] = s[end_pointer]
            s[end_pointer] = temp

            start_pointer += 1
            end_pointer -= 1




