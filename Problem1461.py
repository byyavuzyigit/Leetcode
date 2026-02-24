class Solution(object):
    def hasAllCodes(self, s, k):
        """
        :type s: str
        :type k: int
        :rtype: bool
        """
        substringSet = set()
        for i in range(0, len(s) - k + 1):
            substring = s[i:i+k]
            substringSet.add(substring)
        
        return len(substringSet) == 2**k