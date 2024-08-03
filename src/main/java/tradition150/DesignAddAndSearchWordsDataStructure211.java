package tradition150;

public class DesignAddAndSearchWordsDataStructure211 {

    private class TestCase {
    }

    public static void solution() {
    }

    /**
     * Solution
     * Time Complexity:
     *      insert: O(n) n = length of String
     *      search: O(n) n = 26 powered by length of String
     */
    class WordDictionary {
        private Trie root;

        public WordDictionary() {
            root = new Trie();
        }

        public void addWord(String word) {
            root.insert(word);
        }

        public boolean search(String word) {
            return dfs(word, 0, root);
        }

        private boolean dfs(String word, int index, Trie node) {
            if(index == word.length()) {
                return node.isFinished();
            }
            char ch = word.charAt(index);
            if(Character.isLetter(ch)) {
                int childIndex = ch - 'a';
                Trie child = node.getChildren()[childIndex];
                if(child != null && dfs(word, index + 1, child)) {
                    return true;
                }
            } else {
                for(int i = 0; i < 26; i++) {
                    Trie child = node.getChildren()[i];
                    if(child != null && dfs(word, index + 1, child)) {
                        return true;
                    }
                }
            }
            return false;
        }


    }

    class Trie {
        private Trie[] children;

        private boolean isFinished;

        public Trie() {
            this.children = new Trie[26];
            this.isFinished = false;
        }

        public void insert(String word) {
            Trie node = this;
            for(int i = 0; i < word.length(); i++) {
                char ch = word.charAt(i);
                int index = ch - 'a';
                if(node.children[index] == null) {
                    node.children[index] = new Trie();
                }
                node = node.children[index];
            }
            node.isFinished = true;
        }

        public Trie[] getChildren() {
            return children;
        }

        public boolean isFinished() {
            return isFinished;
        }
    }
}
