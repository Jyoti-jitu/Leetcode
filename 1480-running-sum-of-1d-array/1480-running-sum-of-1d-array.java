class Solution {
    public int[] runningSum(int[] nums) {
        ArrayList<Integer> result = new ArrayList<>();
        int sum = 0 ;
        for(int i : nums){
            sum = sum + i;
            result.add(sum);
        }
        int[] answer = new int[result.size()];

        for (int i = 0; i < result.size(); i++) {
            answer[i] = result.get(i);
        }

        return answer;
    }
}