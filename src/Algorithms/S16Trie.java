package Algorithms;

import org.jetbrains.annotations.NotNull;

public class S16Trie {

    class TrieNode{
        public char var;
        public boolean isWord;
        public TrieNode[] children = new TrieNode[26];
        public TrieNode(){}
        TrieNode(char c){
            TrieNode node = new TrieNode();
            node.var = c ;
        }
    }

    private TrieNode root;
    public S16Trie(){
        root = new TrieNode();
        root.var = ' ';
    }

    public void insert(@NotNull String word){
        TrieNode ws = root;
        for (int i = 0 ;i<word.length();i++){
            char c = word.charAt(i);
            if(ws.children[c-'a']== null) {
                ws.children[c-'a'] = new TrieNode(c);
            }
            ws = ws.children[c-'a'];
        }
        ws.isWord=true;
    }

    public boolean search(@NotNull String word){
        TrieNode ws = root;
        for (int i = 0 ;i<word.length();i++){
            char c = word.charAt(i);
            if(ws.children[c-'a']== null) {
                return false;
            }
            ws = ws.children[c-'a'];
        }
        return ws.isWord;
    }

    public boolean startWith(@NotNull String word){
        TrieNode ws = root;
        for (int i = 0 ;i<word.length();i++){
            char c = word.charAt(i);
            if(ws.children[c-'a']== null) {
                return false;
            }
            ws = ws.children[c-'a'];
        }
        return true;
    }
}
