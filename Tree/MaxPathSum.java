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

public class MaxPathSum {
    int maxSum = Integer.MIN_VALUE;

    public int maxPathSum(TreeNode root) {
        findMaxGain(root);
        return maxSum;
    }

    private int findMaxGain(TreeNode node) {

        if (node == null)
            return 0;

      
        int leftGain = Math.max(0, findMaxGain(node.left));
        int rightGain = Math.max(0, findMaxGain(node.right));

        int currentPathSum = node.val + leftGain + rightGain;

        
        maxSum = Math.max(maxSum, currentPathSum);

        
        return node.val + Math.max(leftGain, rightGain);
    }
}
