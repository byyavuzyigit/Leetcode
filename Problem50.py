class Solution(object):
    def myPow(self, x, n):
        """
        :type x: float
        :type n: int
        :rtype: float
        """
        if n == 0:
            return 1
        elif n < 0:
            n = abs(n)
            x = 1 / x

        result = 1.0
    
        # powering based on n's binary representation
        while n > 0:
            if n % 2 == 1:
                result *= x
            
            x *= x
            n = n // 2
        
        return result
        