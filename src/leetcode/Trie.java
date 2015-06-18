package leetcode;



public class Trie {
	
	class TrieNode {
	    // Initialize your data structure here.
	    private boolean end;
	    private TrieNode[] next = new TrieNode[26];
	    public TrieNode() {
	        
	    }
	}
	
    private TrieNode root;

    public Trie() {
        root = new TrieNode();
    }

    // Inserts a word into the trie.
    public void insert(String word) {
        root = insert(root, word, 0);
    }
    
    public TrieNode insert(TrieNode node, String word, int d){
        if (node == null)
            node = new TrieNode();
        if (d == word.length()){
            node.end = true;
            return node;
        }
        int c = word.charAt(d) - 97;
        node.next[c] = insert(node.next[c], word, d + 1);
        return node;
    }

    // Returns if the word is in the trie.
    public boolean search(String word) {
        return search(root, word, 0);
    }
    
    public boolean search(TrieNode node, String word, int d){
        if (node == null)
            return false;
        if (d == word.length() && node.end == false)
            return false;
        if (d == word.length() && node.end == true)
            return true;
        int c = word.charAt(d) - 97;
        System.out.println(c);
        System.out.println(d);
        return search(node.next[c], word, d + 1);
    }

    // Returns if there is any word in the trie
    // that starts with the given prefix.
    public boolean startsWith(String prefix) {
        return startsWith(root, prefix, 0);
    }
    
    public boolean startsWith(TrieNode node, String prefix, int d){
        if (node == null)
            return false;
        if (d == prefix.length())
            return true;
        int c = prefix.charAt(d) - 97;
        return startsWith(node.next[c], prefix, d + 1);
    }
    
    //test
    public static void main(String[] args){
    	Trie trie = new Trie();
    	trie.insert("a");
    	trie.search("a");
    	trie.startsWith("a");
    	System.out.println(trie.search("a"));
    	System.out.println(trie.startsWith("a"));
    }
}