class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        HashMap<Character, Integer> table = new HashMap<>();

        for(int i = 0; i < s.length(); i++){
            char letter = s.charAt(i);
            if(table.containsKey(letter)){
                table.replace(letter, table.get(letter) + 1);
            } 
            else table.put(letter, 1);
        }

        for(int i = 0; i < t.length(); i++){
            char letter = t.charAt(i);
            if(table.containsKey(letter)){
                int cnt = table.get(letter);
                if (cnt == 0) return false;
                table.replace(letter, cnt - 1);
            } 
            else return false;
        }

        return true;
    }
}
