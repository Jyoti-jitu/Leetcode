class Solution {
    public int maxSubArray(int[] nums) {
        int n = nums.length;
        int sum = 0;
        int maximum = Integer.MIN_VALUE;
        for (int st = 0 ; st < n ; st++){
                sum+= nums[st];
                maximum = Math.max(sum,maximum);
                if(sum<0){
                    sum = 0;
                }
        }
        return maximum;
    }
}