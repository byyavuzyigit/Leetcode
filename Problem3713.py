class Solution(object):
    def longestBalanced(self, s):
        """
        :type s: str
        :rtype: int
        """

        max_length = 0

        for i in range(len(s)):
            counts = {}
            max_frequency = 0
            char_count = 0
            for j in range(i, len(s)):
                char = s[j]
                counts[char] = counts.get(char, 0) + 1
                current_frequency = counts[char]
                if current_frequency == 1:
                    char_count += 1
                max_frequency = max(max_frequency, current_frequency)

                # check balance
                substring_len = j - i + 1
                if max_frequency * char_count == substring_len:
                    max_length = max(substring_len, max_length)


        return max_length
        