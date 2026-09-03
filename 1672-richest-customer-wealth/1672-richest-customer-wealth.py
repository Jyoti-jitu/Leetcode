class Solution:
    def maximumWealth(self, accounts: List[List[int]]) -> int:
        maxi = 0
        for f in accounts:
            wealth = sum(f)
            maxi = max (wealth,maxi)
        return maxi