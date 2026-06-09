class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        int left = 0;

        while (left < nums.length) {
            int right = left + 1;

            while (right < nums.length && right - left <= k) {
                if (nums[left] == nums[right]) {
                    return true;
                }
                right++;
            }

            left++;
        }

        return false;
    }
}