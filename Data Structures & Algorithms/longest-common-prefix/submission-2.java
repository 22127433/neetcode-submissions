class Solution {
    public String isCommonChars(String[] strs, int idxCh, int idxStr, int n){
        if (idxCh >= strs[idxStr].length()) return "";
        if (idxStr + 1 == n) return "" + strs[idxStr].charAt(idxCh);
        if (idxCh < strs[idxStr + 1].length() && strs[idxStr].charAt(idxCh) == strs[idxStr + 1].charAt(idxCh)){
            return isCommonChars(strs, idxCh, idxStr + 1, n);
        }
        return "";
    }
    public String longestCommonPrefix(String[] strs) {
        String ans = "", ch;
        int idxCh = 0;
        do {
            ch = isCommonChars(strs, idxCh, 0, strs.length);
            ans += ch;
            idxCh++;
        }
        while (ch != "");
        return ans;
    }
}