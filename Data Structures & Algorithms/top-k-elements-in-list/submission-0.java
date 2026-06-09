class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] res = new int[k];

        for(int num : nums){
            map.putIfAbsent(num, 0);
            map.put(num, map.get(num) + 1);
        }

        for(int i = 0; i < k; i++){
            final int[] max = {Integer.MIN_VALUE};
            final int[] maxKey = {0};

            map.forEach((key, value) -> {
                if(value > max[0]) {
                    max[0] = value;
                    maxKey[0] = key;
                }
            });
            res[i] = maxKey[0];
            map.remove(maxKey[0]);
        }
        return res;
    }
}
