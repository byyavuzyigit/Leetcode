class Solution(object):
    def hasAlternatingBits(self, n):
        """
        :type n: int
        :rtype: bool
        """
        binaryForm = toBinary(n)
        if len(binaryForm) <=1:
            return True
        
        for i in range(0, len(binaryForm)-1):
            leftChar = binaryForm[i]
            rightChar = binaryForm[i+1]
            if leftChar == rightChar:
                return False
        
        return True

def toBinary(n):
    binary = ''

    while(n > 0):
        decimal = str(n % 2)
        n = n // 2
        binary += decimal

    return binary
        