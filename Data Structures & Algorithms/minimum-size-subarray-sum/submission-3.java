class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int left = 0, right = 0, minLen = nums.length + 1, sum = 0;

        while (right < nums.length){
            sum += nums[right];
            while (sum >= target){
                minLen = Math.min(minLen, right - left + 1);
                sum -= nums[left];
                left++;
            }
            right++;
        }
        if (minLen == nums.length + 1) return 0;
        return minLen;
    }
}