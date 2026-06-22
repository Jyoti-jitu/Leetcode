class Solution {
    public int[] twoSum(int[] number, int target) {
        int j = number.length -1;
        int i = 0;
        int arr[] = new int [2];
        while(i<j){
            int sum =number[i]+number[j];
            if (sum == target) {
                arr[0]= i+1;
                arr[1]= j+1;
                return arr;
            }
            if(sum > target){
                j--;
            }
            else if(sum < target){
                i++;
            }
            
        }
        return arr;
        }
}