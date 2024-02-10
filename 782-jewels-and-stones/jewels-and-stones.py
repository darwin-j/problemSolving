class Solution:
    def numJewelsInStones(self, jewels: str, stones: str) -> int:
        stones_count  = {}
        jewel_count = 0
        for stone in stones:
            if stones_count.get(stone):
                stones_count[stone] += 1
            else:
                stones_count[stone] = 1
        for jewel in jewels:
            if stones_count.get(jewel):
                jewel_count += stones_count.get(jewel)
        return jewel_count