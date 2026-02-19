class Solution(object):
    def countBinarySubstrings(self, s):
        """
        :type s: str
        :rtype: int
        """
        count0 = 0
        count1 = 0
        charCounts = []
        # count 0s and 1s before switching points
        for char in s:
            if char == '0':
                if count1 != 0:
                    charCounts.append(count1)
                    count1 = 0
                count0 += 1
            elif char == '1':
                if count0 != 0:
                    charCounts.append(count0)
                    count0 = 0
                count1 += 1
        # add the last count of 0 or 1 
        if count0 != 0:
            charCounts.append(count0)
        elif count1 != 0:
            charCounts.append(count1)
        
        ssCount = 0
        # find the substring count by grouping consecutive counts
        for i in range(0, len(charCounts)-1):
            ssCount += min(charCounts[i], charCounts[i+1])
        
        return ssCount