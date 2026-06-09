class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashMap<Integer, Integer> table = new HashMap<>();

        for (int num : nums){
            if (table.containsKey(num)) {
                return true;
            }
            else table.put(num, 1);
        }

        return false;
    }
}
