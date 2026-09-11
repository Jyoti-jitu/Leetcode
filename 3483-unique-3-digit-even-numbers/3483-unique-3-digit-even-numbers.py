class Solution:
    def totalNumbers(self, digit: List[int]) -> int:
        ans = set()
        n = len(digit)
        for i in range(n):
            for j in range(n):
                for k in range(n):
                    if i==j or j==k or i==k:
                        continue
                    if digit[i]==0:
                        continue
                    if digit[k]%2!=0:
                        continue
                    num = digit[i]*100+digit[j]*10+digit[k]
                    ans.add(num)
        return len(ans)
                    
