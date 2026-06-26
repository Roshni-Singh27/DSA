import java.util.ArrayList;
import java.util.List;

class TreeNode {
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

public class BinaryTreePath {
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> result = new ArrayList<>();
        dfs(root, new StringBuilder(), result);
        return result;
    }

    private void dfs(TreeNode node, StringBuilder path, List<String> result) {
        if (node == null) return;

        int len = path.length();

        if (len != 0) {
            path.append("->");
        }
        path.append(node.val);

        if (node.left == null && node.right == null) {
            result.add(path.toString());
        } else {
            dfs(node.left, path, result);
            dfs(node.right, path, result);
        }

       
        path.setLength(len);
    }
}
/*
public List<String> binaryTreePaths(TreeNode root) {
        List<String> result = new ArrayList<>();

        if (root == null) {
            return result;
        }

        dfs(root, "", result);

        return result;
    }

    private void dfs(TreeNode node, String path, List<String> result) {

        if (node == null) {
            return;
        }

        if (path.length() == 0) {
            path = String.valueOf(node.val);
        } else {
            path = path + "->" + node.val;
        }

       
        if (node.left == null && node.right == null) {
            result.add(path);
            return;
        }

        dfs(node.left, path, result);
        dfs(node.right, path, result);
    }
 */