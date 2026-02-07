class Solution(object):
    def minimumDeletions(self, s):
        a_count = s.count('a')
        a_seen = 0
        b_seen = 0
        deletions_counts = []
        # for every char we need to calculate the sum of it's right side a's and left side b's
        for char in s:
            if char == 'a':
                a_seen += 1
                deletions_counts.append(a_count - a_seen + b_seen)
            elif char == 'b':
                b_seen += 1
                deletions_counts.append(a_count - a_seen + b_seen -1)
        
        return min(deletions_counts)
            
        