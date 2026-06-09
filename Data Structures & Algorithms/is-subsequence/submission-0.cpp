class Solution {
public:
    bool isSubsequence(string s, string t) {
        int i = 0, j = 0;
        int nS = s.size();
        int nT = t.size();
        while (i < nS && j < nT){
            if(s[i] == t[j]){
                i++;
                j++;
            }
            else {
                j++;
            }
        }
        if (i == nS){
            return true;
        }
        return false;
    }
};