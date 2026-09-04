package DAY11.SESSION3;

class TrieNode {
    TrieNode[] children;
    boolean isEnd;

    public TrieNode() {
        children = new TrieNode[26];
        isEnd = false;
    }
}

public class TrieDataStructure {
    private TrieNode root;

    public TrieDataStructure() {
        root = new TrieNode();
    }

    public void insert(String word) {
        TrieNode current = root;
        for (char ch : word.toCharArray()) {
            int index = ch - 'a';
            if (index < 0 || index >= 26) {
                throw new IllegalArgumentException("Only lowercase English letters are supported.");
            }
            if (current.children[index] == null) {
                current.children[index] = new TrieNode();
            }
            current = current.children[index];
        }
        current.isEnd = true;
    }

    //Search
    public boolean search(String word){
        TrieNode current= root;
        for(char ch: word.toCharArray()){
            int index = ch-'a';
            if(current.children[index]==null){
                return false;
            }
            current = current.children[index];
        }
        return current.isEnd;
    }
    public static void main(String[] args) {
        TrieDataStructure t = new TrieDataStructure();
        t.insert("apple");
        t.insert("chandan");
        t.insert("thomas");

        System.out.println(t.search("apple"));
        System.out.println(t.search("thomas"));
    }
}
