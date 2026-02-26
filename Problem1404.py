class Solution(object):
    def numSteps(self, s):
        """
        :type s: str
        :rtype: int
        """
        steps = 0
        num = turnInt(s)

        while (num > 1):
            if num % 2 == 0:
                num /= 2
            else:
                num += 1
            steps += 1
        
        return steps
        
def turnInt(s):
    num = 0
    power = len(s) - 1

    for i in range(0, len(s)):
        digit = int(s[i])
        num += digit * (2**power)
        power -= 1
    
    return num