class Solution {
    public int lengthOfLastWord(String s) {
        int cnt = 0, idx = 0;
        for (int i = s.length() - 1; i >= 0; i--){
            if (s.charAt(i) != ' '){
                idx = i;
                break;
            }
        }
        for (int i = idx; i >= 0; i--){
            if (s.charAt(i) == ' '){
                break;
            }
            cnt++;
        }
        return cnt;
    }
}