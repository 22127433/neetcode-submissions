class Solution {
    public int appendCharacters(String s, String t) {
        int idxT = 0;  // pointer theo dõi vị trí đang match trong t
        for (char c : s.toCharArray()) {
            if (idxT < t.length() && c == t.charAt(idxT)) {
                idxT++;
            }
        }
        return t.length() - idxT;
    }
}