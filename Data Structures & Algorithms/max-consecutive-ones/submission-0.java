class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max = 0, l = 0;

        for (int r = 0; r < nums.length; r++){
            if (nums[r] == 0){
                l = r + 1;
            }
            else {
                max = Math.max(max, r - l + 1);
            }
        }
        return max;
    }
}