class Solution {
    public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
        int rem ,ans = x, sol=0;
        while (x>0){
            rem = x%10 ;
            
            sol = sol*10+rem;
            x=x/10;
        }
        if(ans==sol){
            return true;
        }
        else{
            return false;
        }
    }
}