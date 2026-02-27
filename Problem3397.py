class Solution(object):
    def maxDistinctElements(self, nums, k):
        """
        :type nums: List[int]
        :type k: int
        :rtype: int
        """
        # --- found this edge case check in one of the solutions ---
        if k > len(nums):
            return len(nums)

        nums.sort()
        last_used = float('-inf')
        count = 0

        # we have to pick the ideal value for each element = max(last_used + 1, num - k)
        for i in range(0, len(nums)):
            ideal = max(nums[i]-k, last_used+1)
            if ideal <= nums[i]+k:
                nums[i] = ideal
                last_used = ideal
                count += 1

        return count
        