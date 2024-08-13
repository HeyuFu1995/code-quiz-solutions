package tradition150;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ConstructBinaryTreeFromInorderAndPostOrderTraversal106 {

    public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }
    private class TestCase {
        static int[] inorder = {9,3,15,20,7};

        static int[] postorder = {9,15,7,20,3};
    }

    public static void main(String... args) {
       new ConstructBinaryTreeFromInorderAndPostOrderTraversal106().buildTree(TestCase.inorder, TestCase.postorder);
    }

    int postIndex;

    /**
     * Solution
     * Time Complexity: O(n)
     * @param inorder
     * @param postorder
     * @return
     */
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        int length = inorder.length;
        Map<Integer, Integer> inorderMap = new HashMap<>();
        for(int i = 0; i < length; i++) {
            inorderMap.put(inorder[i], i);
        }
        postIndex = length - 1;
        return buildSubTree(inorderMap, postorder, 0, length - 1);
    }

    public TreeNode buildSubTree(Map<Integer, Integer> inorderMap, int[] postorder, int start, int end) {
        if(start > end) {
            return null;
        }
        int rootNumber = postorder[postIndex];
        TreeNode rootNode = new TreeNode(rootNumber);
        int leftMax = inorderMap.get(rootNumber) - 1;
        int rightMin = inorderMap.get(rootNumber) + 1;
        postIndex--;
        rootNode.right = buildSubTree(inorderMap, postorder, rightMin, end);
        rootNode.left = buildSubTree(inorderMap, postorder, start, leftMax);
        return rootNode;
    }
}
