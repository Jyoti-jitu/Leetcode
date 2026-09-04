class Solution {
    public int[] shuffle(int[] nums, int n) {
        int arr[] = new int[n*2];
        int s = 0;
        for(int i= 0 ; i < n ; i++){
            arr[s]= nums[i];
            s++;
            arr[s]=nums[i+n];
            s++;
        }
        return arr;
    }
}