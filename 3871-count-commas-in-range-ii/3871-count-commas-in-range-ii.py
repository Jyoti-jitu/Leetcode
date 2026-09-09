class Solution:
    def countCommas(self, n: int) -> int:
        pow = 1000 
        ans = 0
        while pow <= n:
            a= n - pow + 1
            ans +=a
            pow *=1000
        return ans
        