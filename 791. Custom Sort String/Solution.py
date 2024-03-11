class Solution:
    def customSortString(self, order: str, s: str) -> str:
        result = ''
        complement = ''.join([x for x in s if x not in order])
        for x in order:
            if x in s:
                result += x * s.count(x)
        return result+complement
