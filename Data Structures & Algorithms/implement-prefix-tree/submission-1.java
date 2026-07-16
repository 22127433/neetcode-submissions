class Trie {
    Trie[] ch = new Trie[26];
    boolean endOfWord = false;
}
class PrefixTree {
    private Trie root;
    public PrefixTree() {
         root = new Trie();
    }

    public void insert(String word) {
        Trie cur = root;
        for (char c : word.toCharArray()) {
            int i = c - 'a';
            if (cur.ch[i] == null) {
                cur.ch[i] = new Trie();
            }
            cur = cur.ch[i];
        }
        cur.endOfWord = true;
    }

    public boolean search(String word) {
        Trie cur = root;
        for (char c : word.toCharArray()){
            int i = c - 'a';
            if (cur.ch[i] == null) return false;
            cur = cur.ch[i];
        }

        return cur.endOfWord;
    }

    public boolean startsWith(String prefix) {
        Trie cur = root;
        for (char c : prefix.toCharArray()){
            int i = c - 'a';
            if (cur.ch[i] == null) return false;
            cur = cur.ch[i];
        }
        
        return true;
    }
}
