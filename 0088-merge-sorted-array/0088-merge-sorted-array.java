class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int size =  m+n;
        int arr [] = new int[size]; 
        int left= 0; 
        int right= 0;
        int idx = 0;
        while(left<m && right<n){
            if(nums1[left]>nums2[right]){
                arr[idx]=nums2[right];
                idx++;
                right++;
            }
            else{
                arr[idx]=nums1[left];
                idx++;
                left++;
            }
        }
        while(left<m){
                arr[idx]=nums1[left];
                idx++;
                left++;
            }
            while(right<n){
                arr[idx]=nums2[right];
                idx++;
                right++;
            }

            for(int i = 0;i<arr.length ; i++){
                nums1[i]=arr[i];
            }
    }
}