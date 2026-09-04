class Solution:
    def checkDivisibility(self, n: int) -> bool:
        o= n
        sum = 0 
        mul =1
        while n>0:
            d= n%10
            sum+=d
            mul*=d
            n= n//10
        ans = sum+mul
        return o%ans==0