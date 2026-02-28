class Solution(object):
    def concatenatedBinary(self, n):
        """
        :type n: int
        :rtype: int
        """
        result = 0
        bits = 0 # bit length of the current num

        for i in range(1, n+1):
            # if the num is power of 2, then the length of it's bit form is one more than previous
            if (i & (i-1)) == 0:
                bits += 1
            # make room for the new number so shift that many bits from the current result
            result = int(((result << bits) + i ) % (1e9 + 7))

        return result
    

# --- this solution is faster than the above one, but I saw it in one of the solutions
# class Solution(object):
#     def concatenatedBinary(self, n):
#         """
#         :type n: int
#         :rtype: int
#         """
#         result = 0
#         mod = 10**9 + 7

#         for i in range(1, n+1):
#             # make room for the new number so shift that many bits from the current result
#             result = ((result << i.bit_length()) + i ) % mod

#         return result