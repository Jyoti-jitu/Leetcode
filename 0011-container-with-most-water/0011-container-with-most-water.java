class Solution {
    public int maxArea(int[] height) {
        int left = 0 ; 
        int len = height.length;
        int right = len-1;
        int max = 0;
        while(right>left){
          int hei = Math.min(height[left],height[right]);  
          int dist = right-left;
          int st = hei*dist;
          max = Math.max(st,max);
          if(height[left]<height[right]){
            left++;
          }
          else{
            right--;
          }
        }
        return max;


    }
}