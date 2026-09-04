class Solution:
    def firstStableIndex(self, nums: list[int], k: int) -> int:
        for i in range(len(nums)):
            ma = nums[0]
            mi = nums[i]
            for j in range (0,i+1):
                if nums[j]> ma:
                    ma = nums[j]
            for j in range (i,len(nums)):
                if nums[j]< mi:
                    mi = nums[j]
            if ma-mi <= k:
                return i
        return -1

