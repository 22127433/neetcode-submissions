class Solution {
    public int maxArea(int[] heights) {
        int maxWater = 0;
        int left = 0, right = heights.length - 1;
        while (left < right){
                int curWater = Math.min(heights[left], heights[right]) * (right - left);
                if (curWater > maxWater){
                    maxWater = curWater;
                }
                if (heights[left] < heights[right]){
                    left++;
                }
                else right--;
        }
        return maxWater;
    }
}
