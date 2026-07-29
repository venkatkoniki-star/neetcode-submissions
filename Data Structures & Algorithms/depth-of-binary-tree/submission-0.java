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
    public int maxDepth(TreeNode root) {
        int count = 0;
        return depth(root,count);
    }
    public int depth(TreeNode root,int count){
        if(root == null){
            return count;
        }
        count++;
        int left = depth(root.left,count);
        int right = depth(root.right,count);

        return Math.max(left,right);
    }
}