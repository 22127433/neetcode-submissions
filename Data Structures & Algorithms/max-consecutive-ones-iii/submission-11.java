    class Solution {
        public int longestOnes(int[] nums, int k) {
            int maxLength = 0, l = 0, r = 0;
            int kZero = k;
            while (r < nums.length){
                if (nums[r] == 0) {
                    kZero--;
                }
                if (kZero < 0){
                    if (nums[l] == 0){
                        kZero++;
                    }
                    l++;
                }
                maxLength = Math.max(maxLength, r - l + 1);
                r++;
            }
            return maxLength;
        }
    }