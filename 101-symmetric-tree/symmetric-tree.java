/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    boolean symetric(TreeNode l,TreeNode r)
    {
        if(l==null && r==null)
        {
            return true;
        }
        if(l==null || r==null)
        {
            return false;
        }
        if(l.val!=r.val)
        {
            return false;
        }
       
        return symetric(l.left,r.right)&& symetric(l.right,r.left);
    }
    public boolean isSymmetric(TreeNode root) {
        if(root==null)
        {
            return true;
        }

      return symetric(root.left,root.right);
        
    }
}