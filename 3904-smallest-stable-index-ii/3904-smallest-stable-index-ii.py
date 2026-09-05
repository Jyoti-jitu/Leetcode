class Solution:
    def firstStableIndex(self, nums: list[int], k: int) -> int:
        n = len(nums)

        mn = nums[-1]
        right = [0] * n

        for i in range(n - 1, -1, -1):
            mn = min(mn, nums[i])
            right[i] = mn

        mx = nums[0]

        for i in range(n):
            mx = max(mx, nums[i])

            if mx - right[i] <= k:
                return i

        return -1