class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxLength = 0, l = 0, r = 0;
        Map<Character, Integer> map = new HashMap<>();
        while (r < s.length()){
            char c = s.charAt(r);
            if (map.containsKey(c)){
                int idx = map.get(c);
                if (idx >= l) {
                    l = idx + 1;
                }
            }
            map.put(c, r);
            r++;
            maxLength = Math.max(maxLength, r - l);
        }
        return maxLength;
    }
}
