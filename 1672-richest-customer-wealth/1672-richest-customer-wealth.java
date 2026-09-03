class Solution {
    public int maximumWealth(int[][] accounts) {
        int max = 0;
        for(int f[] : accounts){
            int sum = 0;
            for (int i : f){
                sum = sum+i;
            }
            max = Math.max(max , sum);
        }
        return max;
    }
}