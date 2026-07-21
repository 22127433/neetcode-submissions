class Trie {
    private Trie[] links = new Trie[26];
    private boolean endOfWord = false;

    public boolean checkExist(char ch){
        return (links[ch - 'a'] != null);
    }

    public void put(char ch, Trie node){
        links[ch - 'a'] = node;
    }

    public Trie get(char ch){
        return links[ch - 'a'];
    }

    public boolean checkEndWord(){
        return endOfWord;
    }

    public void endWord(){
        endOfWord = true;
    }
}
class PrefixTree {
    private Trie root;
    public PrefixTree() {
         root = new Trie();
    }

    public void insert(String word) {
        Trie cur = root;
        for (char ch : word.toCharArray()) {
            if (!cur.checkExist(ch)) {
                cur.put(ch, new Trie());
            }
            cur = cur.get(ch);
        }
        
        cur.endWord();
    }

    public boolean search(String word) {
        Trie cur = root;
        for (char ch : word.toCharArray()){
            if (!cur.checkExist(ch)) return false;
            cur = cur.get(ch);
        }

        return cur.checkEndWord();
    }

    public boolean startsWith(String prefix) {
        Trie cur = root;
        for (char ch : prefix.toCharArray()){
            if (!cur.checkExist(ch)) return false;
            cur = cur.get(ch);
        }
        
        return true;
    }
}
