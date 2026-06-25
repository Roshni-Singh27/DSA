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

public class diameterofBT {
     int diameter = 0;

    public int diameterOfBinaryTree(TreeNode root) {
        height(root);
        return diameter;
    }

    private int height(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int leftHeight = height(root.left);
        int rightHeight = height(root.right);

        diameter = Math.max(diameter, leftHeight + rightHeight);

        return 1 + Math.max(leftHeight, rightHeight);
    }
}
/*
 int max=0;
    public int diameterOfBinaryTree(TreeNode root) {
        if(root == null )
        return 0;
        int lh=findDepth(root.left);
        int rh=findDepth(root.right);

        max=Math.max(max,lh+rh);
        diameterOfBinaryTree(root.left);
        diameterOfBinaryTree(root.right);

        return max;
    }

        public int findDepth(TreeNode root) {
        if(root==null)
        return 0;
        int lh=findDepth(root.left);
        int rh=findDepth(root.right);

        return (1+Math.max(lh,rh));
}
 */
