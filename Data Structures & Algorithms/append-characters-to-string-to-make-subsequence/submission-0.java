class Solution {
    public int appendCharacters(String s, String t) {
        int maxLetter = 0;
        for (int i = 0; i < s.length(); i++){
            int numLetter = 0, idxT = 0;
            for (int j = i; j < s.length(); j++){
                if (idxT < t.length() && s.charAt(j) == t.charAt(idxT)){
                    numLetter++;
                    idxT++;
                }
            }
            if (numLetter > maxLetter){
                maxLetter = numLetter;
            }
        }
        return t.length() - maxLetter;
    }
}