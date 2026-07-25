class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int arr[] = new int[nums1.length];

        for (int i = 0; i < nums1.length; i++) {
            arr[i] = -1;   // Default answer

            for (int j = 0; j < nums2.length; j++) {

                if (nums1[i] == nums2[j]) {

                    int count = j + 1;

                    while (count < nums2.length) {
                        if (nums2[count] > nums2[j]) {
                            arr[i] = nums2[count];
                            break;
                        }
                        count++;
                    }

                    break; // No need to search nums2 anymore
                }
            }
        }

        return arr;
    }
}