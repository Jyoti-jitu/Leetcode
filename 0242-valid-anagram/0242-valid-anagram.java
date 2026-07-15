class Solution {
    public boolean isAnagram(String str1, String str2) {
        char arr1[] =str1.toCharArray();
         char arr2[] =str2.toCharArray();
         boolean ans = true;
         if(arr1.length != arr2.length){
            // System.out.print("Not Anagram");
            return false;
         }
         Arrays.sort(arr1);
         Arrays.sort(arr2);
         if(Arrays.equals(arr1,arr2)){
            // System.out.print("Anagram");
            return true;
         }
         else{
            // System.out.print("Not Anagram");
            return false;
         }
    }
}

   
         
         