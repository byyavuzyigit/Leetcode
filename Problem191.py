class Solution(object):
    def hammingWeight(self, n):
        """
        :type n: int
        :rtype: int
        """
        return toBinary(n).count('1')

def toBinary(n):
    binary = ''

    while(n > 0):
        decimal = str(n % 2)
        n = n // 2
        binary += decimal

    return binary
        