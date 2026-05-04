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
    int sum=0;
    int maxdepth=0;

    public int deepestLeavesSum(TreeNode root) {
       dfs(root,1);
       return sum;
    }
    public void dfs(TreeNode node, int depth)
    {
        if(node==null)
        {
            return ;
        }
        if(depth>maxdepth)
        {
            maxdepth=depth;
            sum=node.val;
        }
        else if(depth==maxdepth)
        {
            sum=sum+node.val;
        }

        dfs(node.left, depth + 1);
        dfs(node.right, depth + 1);

    }
}