class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> table = new HashMap<>();

        int[] res = new int[2];
        for (int i = 0; i < nums.length; i++){
            int idx = table.getOrDefault(nums[i], -1);
            if (idx != -1){
                res[0] = idx; 
                res[1] = i;
                break;
            } 
            else {
                table.put(target - nums[i], i);
            }
        }
        return res;
    }
}
