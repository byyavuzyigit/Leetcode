class Solution(object):
    def binaryGap(self, n):
        """
        :type n: int
        :rtype: int
        """
        binaryForm = toBinary(n)
        currentIndex = -1
        gap = 0

        for i in range(0, len(binaryForm)):
            char = binaryForm[i]
            if char == '1':
                if currentIndex == -1:
                    # first occurence of a '1'
                    currentIndex = i
                gap = max(gap, i-currentIndex)
                currentIndex = i
        
        return gap


def toBinary(n):
    binary = ''

    while(n > 0):
        decimal = str(n % 2)
        n = n // 2
        binary += decimal

    return binary[::-1]