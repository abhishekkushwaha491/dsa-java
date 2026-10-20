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
    // For calculating height and diameter together
    class Info{
        int height;
        int diam;

        Info(int height,int diam){
            this.height = height;
            this.diam = diam;
        }
    }
    public Info diam(TreeNode root){
        if(root == null){
            return new Info(0,0);
        }
        Info left = diam(root.left);
        Info right = diam(root.right);

        // for calculating the height of each node
        int height = 1 + Math.max(left.height, right.height);
        // for calculating the diameter of each node
        int diameter = Math.max(Math.max(left.diam,right.diam),left.height+right.height);

        return new Info(height,diameter);
    }
    public int diameterOfBinaryTree(TreeNode root) {
        Info diameter = diam(root);

        return diameter.diam;
    }
    
}


// Time complexity --> O(N); // because we visited every node single time
// Space complexity --> O(H); // H--> height
