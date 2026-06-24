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
public class BalancedBT {
     public boolean isBalanced(TreeNode root) {
        return dfsHeight(root)!=-1;
    }

    int dfsHeight(TreeNode root){
        if(root==null)
        return 0;

        int leftHgt=dfsHeight(root.left);
        if(leftHgt==-1)
        return -1;
        int rightHgt=dfsHeight(root.right);
        if(rightHgt==-1)
        return -1;

        if(Math.abs(leftHgt-rightHgt)>1)
        return -1;

        return Math.max(leftHgt,rightHgt)+1;
    }
}
/*
 if(root == null)
        return true;

        int lh=maxDepth(root.left);
        int rh=maxDepth(root.right);

        if(Math.abs(lh-rh)>1)
        return false;

        boolean left=isBalanced(root.left);
        boolean right=isBalanced(root.right);

        if(!left || !right)
        return false;

        return true;
    }

     public int maxDepth(TreeNode root) {
        if(root==null)
        return 0;
        int lh=maxDepth(root.left);
        int rh=maxDepth(root.right);

        return (1+Math.max(lh,rh));
}
 */
