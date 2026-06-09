class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        int left = 0, right = 0;
        while (right <= nums.length - 1){
            int distance = Math.abs(right - left);
            if (distance > k){
                left++;
                right--;
            }
            else {
                if (distance > 0 && nums[left] == nums[right]){
                    return true;
                }
                else if (distance == k) {
                    left++;
                }
                else {
                    right++;
                }
            }
        }
        
        return false;
    }
}