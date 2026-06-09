class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxLength = 0, l = 0, r = 0;
        Map<Character, Integer> map = new HashMap<>();
        while (r < s.length()){
            if (map.containsKey(s.charAt(r))){
                int idx = map.get(s.charAt(r));
                if (idx < l) {
                    map.put(s.charAt(r), r);
                    r++;
                }
                else {
                    l = idx + 1;
                }
            }
            else {
                map.put(s.charAt(r), r);
                r++;
            }
            maxLength = Math.max(maxLength, r - l);
        }
        return maxLength;
    }
}
