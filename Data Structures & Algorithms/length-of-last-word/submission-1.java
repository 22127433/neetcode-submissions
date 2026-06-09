class Solution {
    public int lengthOfLastWord(String s) {
        int length = 0;
        int idx = s.length() - 1;
        while (idx >= 0 && s.charAt(idx) == ' '){
            idx--;
        }
        for (int i = idx; i >= 0; i--){
            if (s.charAt(i) == ' ' && length > 0) break;
            length++;
        }
        return length;
    }
}